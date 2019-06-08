package com.lete.land.landcontroller.endPoint;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataTemplate;
import com.lete.land.landdal.entity.DataTemplateDeatil;
import com.lete.land.landdal.service.DataRegPopulationService;
import com.lete.land.landdal.service.DataTemplateService;
import com.lete.land.landdal.vo.dataCenter.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by WJ on 2019/4/23 0023
 */
@Controller
public class DataTemplateEndpoint {
    @Resource
    private DataRegPopulationService dataRegPopulationService;

    @Resource
    private DataTemplateService dataTemplateService;

    @RequestMapping(value = "/api/template-page", method = RequestMethod.GET)
    @ResponseBody
    public Page<DataTemplate> getTemplatePage(@RequestParam(name = "templateName", required = false) String templateName,
                                              @PageableDefault Pageable pageable) {
        Page<DataTemplate> list = dataTemplateService.getTemplatePage(templateName, pageable);
        return list;
    }

    @RequestMapping(value = "/api/template-edit", method = RequestMethod.GET)
    @ResponseBody
    public List<DataTemplateVo> getTemplateComments(@RequestParam(name = "tableName", required = true) String tableName) {
        return dataTemplateService.getTemplateComments(tableName);
    }

    @RequestMapping(value = "/api/template-edit-submit", method = RequestMethod.POST)
    @ResponseBody
    public Result editTemplate(@RequestBody TemplateRequestVo templateRequestVo) {
        return dataTemplateService.editTemplate(templateRequestVo.getTableName(), templateRequestVo.getTemplates());
    }

    // 上报数据页面
    @RequestMapping(value = "/api/template-import-page", method = RequestMethod.GET)
    @ResponseBody
    public Page<DataImportVo> getTemplateImportPage(@RequestParam(name = "townId", required = false) String townId,
                                                    @RequestParam(name="year",required = false)String year,
                                                    @PageableDefault Pageable pageable) {
        Page<DataImportVo> list = dataTemplateService.getTemplateDetailPage(townId,year, pageable);
        return list;
    }

    @RequestMapping(value = "/api/readExcel", method = RequestMethod.POST)
    @ResponseBody
    public Result readExcelWithSheets(MultipartFile excel,
                                      @RequestParam(name = "templateId")String templateId,
                                      @RequestParam(name = "year")String year,
                                      @RequestParam(name = "townId")String townId){
        Result result = dataTemplateService.importExcel(excel,templateId,year,townId);
        return result;
    }

    @RequestMapping(value = "/api/template-audit-page", method = RequestMethod.POST)
    @ResponseBody
    public Page<DataTemplateDeatil> getTemplateAuditPage(@RequestBody TemplateSearchVo seach,
                                                    @PageableDefault Pageable pageable) {
        Page<DataTemplateDeatil> list = dataTemplateService.getTemplateAuditPage(seach, pageable);
        return list;
    }

    @RequestMapping(value = "/api/template-audit",method =  RequestMethod.POST)
    @ResponseBody
    public Result auditTemplate(@RequestBody DataAuditRequestVo auditRequestVo) {
        return dataTemplateService.auditTemplate(auditRequestVo);
    }

    @RequestMapping(value = "/guest/get-json",method =  RequestMethod.GET)
    @ResponseBody
    public List<DataTemplateVo> getJson() {
        return dataTemplateService.getTemplateJson();
    }

//    @GetMapping("/getExcel")
//    public void getExcel(HttpServletRequest request, HttpServletResponse response) {
//        ServletOutputStream out = null;
//
//        try {
//            out = response.getOutputStream();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, true);
//        try {
//            String fileName = new String(("UserInfo " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
//                    .getBytes(), "UTF-8");
//            Sheet sheet1 = new Sheet(1, 0, SysMuserModel.class);
//            sheet1.setSheetName("用户表");
//            response.setContentType("multipart/form-data");
//            response.setCharacterEncoding("utf-8");
//            response.setHeader("Content-disposition", "attachment;filename="+fileName+".xlsx");
//            // writer.write(getListString(), sheet1);
//
//            out.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            writer.finish();
//            try {
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

}
