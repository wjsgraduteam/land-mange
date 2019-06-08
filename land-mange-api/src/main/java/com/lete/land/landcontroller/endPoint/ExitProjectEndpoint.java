package com.lete.land.landcontroller.endPoint;

import com.lete.land.landdal.Result;
import com.lete.land.landdal.entity.*;
import com.lete.land.landdal.service.ExitProjectService;
import com.lete.land.landdal.vo.exitMange.ExitApplyVo;
import com.lete.land.landdal.vo.exitMange.ExitCompleteVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by WJ on 2019/4/23 0023
 */
@Controller
@RequestMapping(value = "/api/exit-mange")
public class ExitProjectEndpoint {
    @Resource
    private ExitProjectService exitProjectService;

    @PostMapping("/exit-apply")
    @ResponseBody
    public Result exitAply(@RequestBody ExitApplyVo exitApplyVo) {
        return  exitProjectService.saveExitApplyVo(exitApplyVo);
    }

    @GetMapping("/pro-page")
    @ResponseBody
    public Page<ExitProject> getProjectPage(
            @RequestParam(value = "status",required = false)String status,
            @RequestParam(value = "town",required = false)String town,
            @RequestParam(value = "village",required = false)String village,
            @PageableDefault Pageable pageable) {
        return exitProjectService.getProjectPage(status,town,village,pageable);
    }

    @GetMapping("/exit-apply-info")
    @ResponseBody
    public  ExitApplyVo getExitApplyInfo(@RequestParam(name = "id",required = true)String id) {
        return  exitProjectService.getExitApplyInfoByProId(id);
    }

    @GetMapping("/social-change-page")
    @ResponseBody
    public Page<ExitSocialTypeChange> getSocialPage(
            @RequestParam(value = "id",required = true)String proId,
            @PageableDefault Pageable pageable) {
        return exitProjectService.getSocialPage(proId,pageable);
    }

    @GetMapping("/stock-change-page")
    @ResponseBody
    public Page<ExitStockTypeChange> getStockPage(
            @RequestParam(value = "id",required = true)String proId,
            @PageableDefault Pageable pageable) {
        return exitProjectService.getStockPage(proId,pageable);
    }

    @GetMapping("/compensation-page")
    @ResponseBody
    public Page<ExitMoneyCompensate> getCompensationPage(
            @RequestParam(value = "id",required = true)String proId,
            @PageableDefault Pageable pageable) {
        return exitProjectService.getCompensationPage(proId,pageable);
    }

    @PostMapping("/save-compensation")
    @ResponseBody
    public Result saveCompensation(
            @RequestParam(value = "id",required = true)String proId,
            @RequestParam(value = "compensation",required = false)Double compensation) {
        return exitProjectService.saveCompensation(proId,compensation);
    }

    @GetMapping("/anzhi-page")
    @ResponseBody
    public Page<ExitAnzhiShenqing> saveCompensation(
            @RequestParam(value = "id",required = true)String proId,
            @PageableDefault Pageable pageable) {
        return exitProjectService.getAnzhiPage(proId,pageable);
    }

    @PostMapping("/complete-apply")
    @ResponseBody
    public Result completeApply(@RequestBody ExitCompleteVo exitCompleteVo) {
        return exitProjectService.completeApply(exitCompleteVo);
    }

    @PostMapping("/complete-approve")
    @ResponseBody
    public Result completeApprove(@RequestBody ExitCompleteVo exitCompleteVo) {
        return exitProjectService.completeApprove(exitCompleteVo);
    }
}
