package com.lete.land.landcontroller.endPoint;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataConLandInformation;
import com.lete.land.landdal.entity.DataLandUseType;
import com.lete.land.landdal.entity.DataRegPopulation;
import com.lete.land.landdal.service.DataConLandInformationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/api/data-conLand-information")
public class DataConLandInformationEndpoint {
    @Resource
    private DataConLandInformationService dataConLandInformationService;

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Page<DataConLandInformation> getDataConLandInformationPage(
            @RequestParam(value = "townId", required = false) String townId,
            @RequestParam(value = "village", required = false) String village,
            @RequestParam(value = "year", required = false) String year,
            @PageableDefault Pageable pageable) {
        return dataConLandInformationService.getDataConLandInformationPage(townId, village, year, pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result save(@RequestBody DataConLandInformation dataConLandInformation) {
        return dataConLandInformationService.save(dataConLandInformation);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result deleteRegPopulation(@RequestParam(value = "id") String id) {
        return dataConLandInformationService.delete(id);
    }
}
