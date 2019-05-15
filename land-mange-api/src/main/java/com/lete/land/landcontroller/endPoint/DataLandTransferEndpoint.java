package com.lete.land.landcontroller.endPoint;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.DataLandTransfer;
import com.lete.land.landdal.service.DataLandTransferService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/api/land-transfer")
public class DataLandTransferEndpoint {
    @Resource
    private DataLandTransferService dataLandTransferService;
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Page<DataLandTransfer> getLandTransferPage(
            @RequestParam(value = "townId",required = false)String townId,
            @RequestParam(value = "village",required = false)String village,
            @RequestParam(value = "year",required = false)String year,
            @PageableDefault Pageable pageable) {
        return dataLandTransferService.getDataLandTransferPage(townId,village,year,pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result saveLandTransfer(@RequestBody DataLandTransfer dataLandTransfer) {
        return dataLandTransferService.save(dataLandTransfer);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result deleteLandTransfer(@RequestParam(value = "id") String id) {
        return dataLandTransferService.delete(id);
    }
}
