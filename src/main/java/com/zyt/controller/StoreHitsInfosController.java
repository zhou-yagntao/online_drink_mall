package com.zyt.controller;

import com.zyt.entity.Result;
import com.zyt.entity.StoreHits;
import com.zyt.service.StoreHitsInfosService;
import com.zyt.service.StoreProductInfosService;
import org.elasticsearch.action.ValidateActions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.PipedOutputStream;

/**
 * @ProjectName: online_drink_mall
 * @Package: com.zyt.controller
 * @ClassName: StoreHitsInfosController
 * @Author: zhou_yangtao@yeah.net
 * @Description: 商品点击量controller层
 * @Date: 10:44 2021/2/10
 * @Version: 1.0
 */
@Controller
@RequestMapping("/storeHitsInfos")
public class StoreHitsInfosController {

    private Logger logger = LoggerFactory.getLogger(StoreProductInfosController.class);

    @Autowired
    private StoreHitsInfosService storeHitsInfosService;

    @RequestMapping(value = "/getStoreHitsInfos")
    @ResponseBody
    public Result GetStoreHitsInfos(){
        this.storeHitsInfosService.GetStoreHitsInfos();
        logger.info("店铺点击");
        return  null;
    }

}
