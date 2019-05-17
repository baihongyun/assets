package com.zoctan.api.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zoctan.api.core.response.Result;
import com.zoctan.api.core.response.ResultGenerator;
import com.zoctan.api.model.Assets;
import com.zoctan.api.service.AssetsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaobai
 * @date  2019/5/17
 */
@RestController
@RequestMapping("/assets")
@Validated
public class AssetsController {

    @Resource
    private AssetsService assetsService;

    public Result list(@RequestParam final Integer page,
                       @RequestParam final Integer size) {
        PageHelper.startPage(page,size);
        final List<Assets> list = this.assetsService.findAllAssets();
        final PageInfo<Assets> pageInfo = new PageInfo<>(list);
        return ResultGenerator.genOkResult(pageInfo);
    }

}
