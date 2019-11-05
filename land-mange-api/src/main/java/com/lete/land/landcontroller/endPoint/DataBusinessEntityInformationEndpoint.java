package com.lete.land.landcontroller.endPoint;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataBusinessEntityInformation;
import com.lete.land.landdal.entity.DataLandUseType;
import com.lete.land.landdal.service.DataBusinessEntityInformationService;
import com.lete.land.landdal.vo.business.BusinessAnalysisChartVO;
import com.lete.land.landdal.vo.business.SummaryAnalysisVO;
import com.lete.land.landdal.vo.excelModel.DataRegPopulationModel;
import com.lete.land.landdal.vo.excelModel.SysMuserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/api/business-entity-info")
public class DataBusinessEntityInformationEndpoint {
    @Resource
    private DataBusinessEntityInformationService dataBusinessEntityInformationService;
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Page<DataBusinessEntityInformation> getLandUseTypePage(
            @RequestParam(value = "townId",required = false)String townId,
            @RequestParam(value = "village",required = false)String village,
            @RequestParam(value = "year",required = false)String year,
            @RequestParam(value = "operatorType",required = false)String operatorType,
            @RequestParam(value = "operatorName",required = false)String operatorName,
            @RequestParam(value = "town",required = false)String town,
            @PageableDefault Pageable pageable) {
        return dataBusinessEntityInformationService.getDataBusinessEntityInformation(townId,town,village,year,operatorType,operatorName,pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result save() {
        return dataBusinessEntityInformationService.save();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result deleteRegPopulation(@RequestParam(value = "id") String id) {
        return dataBusinessEntityInformationService.delete(id);
    }

    @GetMapping("/summary-analysis")
    @ResponseBody
    public Page<SummaryAnalysisVO> getSummaryPage(@RequestParam(value = "town")Integer townId,
                                                  @RequestParam(value = "year")String year,
                                                  @PageableDefault Pageable pageable) {
       return   dataBusinessEntityInformationService.getSummaryAnalysis(townId,year,pageable);
    }

    @GetMapping("/operator-type-chart")
    @ResponseBody
    public List<BusinessAnalysisChartVO> getChart(@RequestParam(value = "town")Integer townId,
                                                  @RequestParam(value = "village",required = false)String village,
                                                  @RequestParam(value = "year",required = false)String year) {
        return dataBusinessEntityInformationService.getCharts(townId,village,year);
    }

    @RequestMapping(value = "getExcel",method = RequestMethod.GET)
    public void getExcel(HttpServletRequest servletRequest, HttpServletResponse response)
    {
        ServletOutputStream out = null;

        try {
            out = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, true);
        try {
            String fileName = new String(("虎丘区横塘镇石湖村2019年股民分红清单")
                    .getBytes("UTF-8"), "ISO8859-1");
            Field field = SysMuserModel.class.getDeclaredField("name");
            ExcelProperty excelProperty = field.getAnnotation(ExcelProperty.class);
            InvocationHandler h = Proxy.getInvocationHandler(excelProperty);
            Field hfield = h.getClass().getDeclaredField("memberValues");
            hfield.setAccessible(true);
            Map memberValues = (Map)hfield.get(h);
            // memberValues.put("value",new String[]{"反射"});
            hfield.setAccessible(false);

            Sheet sheet1 = new Sheet(1, 0, DataRegPopulationModel.class);
            sheet1.setSheetName("用户表");
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-disposition", "attachment;filename="+fileName+".xlsx");
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            writer.finish();
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
