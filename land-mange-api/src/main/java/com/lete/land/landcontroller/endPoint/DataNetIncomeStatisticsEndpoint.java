package com.lete.land.landcontroller.endPoint;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataNetIncomeStatistics;
import com.lete.land.landdal.service.DataNetIncomeStatisticsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/api/net-income-statistics")
public class DataNetIncomeStatisticsEndpoint {
    @Resource
    private DataNetIncomeStatisticsService dataNetIncomeStatisticsService;
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Page<DataNetIncomeStatistics> getNetIncomeStatisticsPage(
            @RequestParam(value = "townId",required = false)String townId,
            @RequestParam(value = "village",required = false)String village,
            @RequestParam(value = "year",required = false)String year,
            @PageableDefault Pageable pageable) {
        return dataNetIncomeStatisticsService.getDataNetIncomeStatisticsPage(townId,village,year,pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result saveNetIncomeStatistics(@RequestBody DataNetIncomeStatistics dataNetIncomeStatistics) {
        return dataNetIncomeStatisticsService.save(dataNetIncomeStatistics);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result deleteNetIncomeStatistics(@RequestParam(value = "id") String id) {
        return dataNetIncomeStatisticsService.delete(id);
    }
}
