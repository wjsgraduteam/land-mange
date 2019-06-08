package com.lete.land.landcontroller.endPoint;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataBusinessEntityInformation;
import com.lete.land.landdal.entity.DataLandUseType;
import com.lete.land.landdal.service.DataBusinessEntityInformationService;
import com.lete.land.landdal.vo.business.BusinessAnalysisChartVO;
import com.lete.land.landdal.vo.business.SummaryAnalysisVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
}
