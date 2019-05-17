package com.zoctan.api.mapper;

import com.zoctan.api.core.mapper.MyMapper;
import com.zoctan.api.model.Assets;

import java.util.List;

public interface AssetsMapper extends MyMapper<Assets> {
    /**
     * @return 资产列表
     */
    List<Assets> findAllAssets();
}
