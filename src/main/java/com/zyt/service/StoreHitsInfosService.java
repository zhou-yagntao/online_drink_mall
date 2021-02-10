package com.zyt.service;

import com.zyt.entity.StoreHits;

import java.util.List;

/**
 * @ProjectName: online_drink_mall
 * @Package: com.zyt.service
 * @ClassName: StoreHitsInfosService
 * @Author: zhou_yangtao@yeah.net
 * @Description: 店铺点击量服务层
 * @Date: 10:45 2021/2/10
 * @Version: 1.0
 */
public interface StoreHitsInfosService {

    //获得店铺点击量信息
    public List<StoreHits> GetStoreHitsInfos();
}
