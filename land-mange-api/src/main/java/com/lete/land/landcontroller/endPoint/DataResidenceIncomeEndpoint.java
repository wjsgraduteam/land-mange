package com.lete.land.landcontroller.endPoint;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataResidenceIncome;
import com.lete.land.landdal.service.DataResidenceIncomeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/api/residence-income")
public class DataResidenceIncomeEndpoint {
    @Resource
    private DataResidenceIncomeService dataResidenceIncomeService;

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Page<DataResidenceIncome> getDataResidenceIncomePage(
            @RequestParam(value = "townId", required = false) String townId,
            @RequestParam(value = "village", required = false) String village,
            @RequestParam(value = "year", required = false) String year,
            @PageableDefault Pageable pageable) {
        return dataResidenceIncomeService.getDataResidenceIncomePage(townId, village, year, pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result save(@RequestBody DataResidenceIncome dataResidenceIncome) {
        return dataResidenceIncomeService.save(dataResidenceIncome);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") String id) {
        return dataResidenceIncomeService.delete(id);
    }
}
