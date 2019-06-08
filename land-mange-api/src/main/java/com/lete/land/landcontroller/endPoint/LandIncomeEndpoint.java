package com.lete.land.landcontroller.endPoint;

import com.lete.land.landdal.entity.DataNetIncomeStatistics;
import com.lete.land.landdal.entity.DataResidenceIncome;
import com.lete.land.landdal.service.LandIncomeService;
import com.lete.land.landdal.vo.business.FarmChartVO;
import com.lete.land.landdal.vo.business.FarmTypeChartVO;
import com.lete.land.landdal.vo.business.FarmTypeVO;
import com.lete.land.landdal.vo.business.YearAnalysisChartVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by WJ on 2019/5/18 0018
 */
@Controller
@RequestMapping(value = "/api/land-income")
public class LandIncomeEndpoint {
    @Resource
    private LandIncomeService landIncomeService;

    @GetMapping("/farm-type/page")
    @ResponseBody
    public Page<FarmTypeVO> getFarmTypePage(@RequestParam(value = "town")String townId,
                                             @RequestParam(value = "village")String village,
                                             @RequestParam(value = "year")String year,
                                             @PageableDefault Pageable pageable){
        return landIncomeService.getFarmTypePage(townId,village,year,pageable);
    }

    @GetMapping("/net-income/page")
    @ResponseBody
    public Page<DataNetIncomeStatistics> getNetIncomePage(@RequestParam(value = "town")String townId,
                                             @RequestParam(value = "village")String village,
                                             @RequestParam(value = "year",required = false)String year,
                                             @RequestParam(value = "plotNumber",required = false)String plotNumber,
                                             @PageableDefault Pageable pageable){
        return landIncomeService.getNetIncomePage(townId,village,year,plotNumber,pageable);
    }

    @GetMapping("/farm-type-chart")
    @ResponseBody
    public FarmChartVO chartList(@RequestParam(value = "town",required = false)String townId,
                                 @RequestParam(value = "village",required = false)String village,
                                 @RequestParam(value = "year", required = false)String year) {
        return landIncomeService.getFarmTypeChartList(townId, village, year);
    }

    @GetMapping("/year-income-change-chart")
    @ResponseBody
    public List<YearAnalysisChartVO> getYearAnalysisChart(@RequestParam(value = "town",required = false)String townId,
                                                          @RequestParam(value = "village",required = false)String village,
                                                          @RequestParam(value = "year", required = false)String year) {
        return landIncomeService.getYearAnalysisList(townId, village, year);
    }

    @GetMapping("/residence-chart")
    @ResponseBody
    public List<DataResidenceIncome> getResidenceChart(@RequestParam(value = "town",required = false)String townId,
                                                       @RequestParam(value = "village",required = false)String village
                                                       ) {
        return landIncomeService.getResidenceChart(townId,village);
    }

}
