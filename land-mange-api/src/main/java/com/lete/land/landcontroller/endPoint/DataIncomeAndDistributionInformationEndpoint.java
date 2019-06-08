package com.lete.land.landcontroller.endPoint;


import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataHolderInformation;
import com.lete.land.landdal.entity.DataIncomeAndDistributionInformation;
import com.lete.land.landdal.service.DataIncomeAndDistributionInformationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "api/income-distribution")
public class DataIncomeAndDistributionInformationEndpoint {
    @Resource
    private DataIncomeAndDistributionInformationService dataIncomeAndDistributionInformationService;
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Page<DataIncomeAndDistributionInformation> getDataIncomeAndDistributionInformationPage(
            @RequestParam(value = "townId",required = false)String townId,
            @RequestParam(value = "village",required = false)String village,
            @RequestParam(value = "year",required = false)String year,
            @PageableDefault Pageable pageable) {
        return dataIncomeAndDistributionInformationService.getDataIncomeAndDistributionInformationPage(townId,village,year,pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result save(@RequestBody DataIncomeAndDistributionInformation dataIncomeAndDistributionInformation) {
        return dataIncomeAndDistributionInformationService.save(dataIncomeAndDistributionInformation);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") String id) {
        return dataIncomeAndDistributionInformationService.delete(id);
    }
}
