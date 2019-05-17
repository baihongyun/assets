package com.zoctan.api.service;

import com.zoctan.api.core.service.Service;
import com.zoctan.api.model.Assets;

import java.util.List;

/**
 *Assets 服务类
 */
public interface AssetsService extends Service<Assets> {

    /**
     *
     * @return 所有资产信息
     */
    List<Assets> findAllAssets();
}
