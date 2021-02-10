package com.zyt.service.impl;

import com.zyt.entity.StoreHits;
import com.zyt.mapper.StoreHitsMapper;
import com.zyt.service.StoreHitsInfosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: online_drink_mall
 * @Package: com.zyt.service.impl
 * @ClassName: StoreHitsInfosServiceImpl
 * @Author: zhou_yangtao@yeah.net
 * @Description: 商品点击量服务层实现层
 * @Date: 10:46 2021/2/10
 * @Version: 1.0
 */
@Service(value = "storeHitsInfosService")
public class StoreHitsInfosServiceImpl implements StoreHitsInfosService {

    private Logger logger = LoggerFactory.getLogger(StoreHitsInfosServiceImpl.class);

    @Autowired
    private StoreHitsMapper storeHitsMapper;

    /**
     * @Method: GetStoreHitsInfos
     * @Author: zhou_yangtao@yeah.net
     * @Version  1.0
     * @Description:获得店铺点击量信息
     * @Return: java.util.List<com.zyt.entity.StoreHits>
     * @Exception:
     * @Date: 2021/2/10 11:07
     * @Param: * @param
     * @Return: java.util.List<com.zyt.entity.StoreHits>
     */
    @Override
    public List<StoreHits> GetStoreHitsInfos() {
        //获得所有的店铺点击量新
        List <StoreHits> storeHitsList =  this.storeHitsMapper.getStoreHitsInfos() != null ? this.storeHitsMapper.getStoreHitsInfos() : null;
        int [] hitsInfo  = new int[storeHitsList.size()];
        for (int i = 0; i < storeHitsList.size(); i++) {
            hitsInfo[i] = storeHitsList.get(i).getSotreHits();
        }
        //获得店铺点击量数据
        logger.info("获得点击量数据:"+hitsInfo);
        //对评级进行排序
        Arrays.sort(hitsInfo);
        logger.info("排序后获得点击量数据:"+hitsInfo);
        return  null;
    }
}
