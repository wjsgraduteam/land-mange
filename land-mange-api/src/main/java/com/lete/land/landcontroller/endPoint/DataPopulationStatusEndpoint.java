package com.lete.land.landcontroller.endPoint;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataPopulationStatus;
import com.lete.land.landdal.service.DataPopulationStatusService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/api/population-status")
public class DataPopulationStatusEndpoint {
    @Resource
    private DataPopulationStatusService dataPopulationStatusService;

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Page<DataPopulationStatus> getDataPopulationStatusPage(
            @RequestParam(value = "townId", required = false) String townId,
            @RequestParam(value = "village", required = false) String village,
            @RequestParam(value = "year", required = false) String year,
            @PageableDefault Pageable pageable) {
        return dataPopulationStatusService.getDataPopulationStatusPage(townId, village, year, pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result savePopulation(@RequestBody DataPopulationStatus dataPopulationStatus) {
        return dataPopulationStatusService.save(dataPopulationStatus);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result deletePopulation(@RequestParam(value = "id") String id) {
        return dataPopulationStatusService.delete(id);
    }
}
