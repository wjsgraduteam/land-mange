package com.lete.land.landcontroller.endPoint;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataCrInformation;
import com.lete.land.landdal.entity.DataHolderInformation;
import com.lete.land.landdal.service.DataHolderInformationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/api/holder-information")
public class DataHolderInformationEndpoint {
    @Resource
    private DataHolderInformationService dataHolderInformationService;
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Page<DataHolderInformation> getDataHolderInformationPage(
            @RequestParam(value = "town",required = false)String townId,
            @RequestParam(value = "village",required = false)String village,
            @RequestParam(value = "year",required = false)String year,
            @RequestParam(value = "stockType",required = false)Integer stockType,
            @RequestParam(value = "shareholderName",required = false)String shareholderName,
            @PageableDefault Pageable pageable) {
        return dataHolderInformationService.getDataHolderInformationPage(townId,village,year,stockType,shareholderName,pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result save(@RequestBody DataHolderInformation dataHolderInformation) {
        return dataHolderInformationService.save(dataHolderInformation);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") String id) {
        return dataHolderInformationService.delete(id);
    }
}
