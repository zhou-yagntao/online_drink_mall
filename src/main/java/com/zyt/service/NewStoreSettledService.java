package com.zyt.service;

import com.zyt.entity.Store;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @ProjectName: online_drink_mall
 * @Package: com.zyt.service
 * @ClassName: NewStoreSettledService
 * @Author: zhou_yangtao@yeah.net
 * @Description: 店铺入驻服务
 * @Date: 17:38 2021/1/18
 * @Version: 1.0
 */
public interface NewStoreSettledService {

    //添加数据
    public  int NewStoreSettled(MultipartFile file, String storeName, String storeOwner, String addressDetails, String longitude, String latitude, String settledDate, String storeDesc);
    //获取所有店铺信息
    public List<Store> GetStoreDetailInfos(String currPage, String limit);
    //获得所有店铺的数量
    public int GetAllStoreCounts();
    //修改店铺数据
    public int UpdateStoreInfos(String storeId,String storeName,String storeAddress,String longitude,String lattitude,String storeDescrible);
    //删除商品信息
    public int DeleteStoreInfosByStoreId(String storeId);
    //根据店铺名称查询店铺信息
    public Store GetStoreInfosByStoreName(String storeName);
    //根据店铺拥有者名字查询店铺编号
    public int GetStoreIdByStoreOwnerName(String storeOwner);


}
