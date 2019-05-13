package com.lete.land.landcontroller.endPoint;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataConLandInformation;
import com.lete.land.landdal.entity.DataCrInformation;
import com.lete.land.landdal.entity.DataLandUseType;
import com.lete.land.landdal.service.DataCrInformationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "api/cr-information")
public class DataCrInformationEndpoint {
    @Resource
    private DataCrInformationService dataCrInformationService;
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Page<DataCrInformation> getCrInformationPage(
            @RequestParam(value = "townId",required = false)String townId,
            @RequestParam(value = "village",required = false)String village,
            @RequestParam(value = "year",required = false)String year,
            @PageableDefault Pageable pageable) {
        return dataCrInformationService.getCrInformationPage(townId,village,year,pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result save(@RequestBody DataCrInformation dataCrInformation) {
        return dataCrInformationService.save(dataCrInformation);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") String id) {
        return dataCrInformationService.delete(id);
    }

}
