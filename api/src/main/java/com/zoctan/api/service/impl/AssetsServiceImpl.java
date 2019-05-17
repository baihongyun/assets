package com.zoctan.api.service.impl;

import com.zoctan.api.core.service.AbstractService;
import com.zoctan.api.mapper.AssetsMapper;
import com.zoctan.api.model.Assets;
import com.zoctan.api.model.User;
import com.zoctan.api.service.AssetsService;

import javax.annotation.Resource;
import java.util.List;

public class AssetsServiceImpl extends AbstractService<Assets> implements AssetsService {

    @Resource
    private AssetsMapper assetsMapper;

    public List<Assets> findAllAssets() {
        return this.assetsMapper.findAllAssets();
    }
}
