package com.lete.land.landcontroller.endPoint;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataBusinessEntityInformation;
import com.lete.land.landdal.service.DataBusinessEntityInformationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/api/business-entity-information")
public class DataBusinessEntityInformationEndpoint {
    @Resource
    private DataBusinessEntityInformationService dataBusinessEntityInformationService;
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Page<DataBusinessEntityInformation> getBusinessEntityInformationPage(
            @RequestParam(value = "townId",required = false)String townId,
            @RequestParam(value = "village",required = false)String village,
            @RequestParam(value = "year",required = false)String year,
            @PageableDefault Pageable pageable) {
        return dataBusinessEntityInformationService.getDataBusinessEntityInformation(townId,village,year,pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result saveBusinessEntityInformation(@RequestBody DataBusinessEntityInformation dataBusinessEntityInformation) {
        return dataBusinessEntityInformationService.save(dataBusinessEntityInformation);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result deleteBusinessEntityInformation(@RequestParam(value = "id") String id) {
        return dataBusinessEntityInformationService.delete(id);
    }
}
