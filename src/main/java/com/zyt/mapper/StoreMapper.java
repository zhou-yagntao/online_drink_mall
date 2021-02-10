package com.zyt.mapper;

import com.zyt.entity.Store;
import com.zyt.entity.StoreBrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: online_drink_mall
 * @Package: com.zyt.mapper
 * @ClassName: StoreMapper
 * @Author: zhou_yangtao@yeah.net
 * @Description: 店铺信息持久层
 * @Date: 17:54 2021/1/18
 * @Version: 1.0
 */
@Mapper
@Repository(value = "storeMapper")
public interface StoreMapper {

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description: 店铺入驻
      * @Return:
      * @Exception:
      * @Date: 2021/1/24 12:28
      * @Param: * @param null
      * @Return:
      */
    public int storeSettled(Store store);

     /**
      * @Method:
      * @Author: Justin
      * @Version  1.0
      * @Description:获取店铺详细信息
      * @Return:
      * @Exception:
      * @Date: 2021/1/24 12:28
      * @Param: * @param null
      * @Return:
      */
    public List<Store> getStoreDetailInfos(@Param("start") int start, @Param("end") int end);

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:获取店铺的总数量
      * @Return:
      * @Exception:
      * @Date: 2021/1/24 12:28
      * @Param: * @param null
      * @Return:
      */
    public int getStoreTotalCounts();

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:修改商品的信息
      * @Return:
      * @Exception:
      * @Date: 2021/1/24 12:28
      * @Param: * @param null
      * @Return:
      */
    public int updateStoreInfos(Store store);

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:删除商品信息
      * @Return:
      * @Exception:
      * @Date: 2021/1/24 12:28
      * @Param: * @param null
      * @Return:
      */
    public int deleteStoreInfosByStoreId(@Param("storeId") Integer storeId);

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:
      * @Return:
      * @Exception:
      * @Date: 2021/1/26 15:24
      * @Param: * @param null
      * @Return:
      */
    public String getStoreNameByOwnerName(@Param("storeOwnerName") String storeOwnerName);

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:
      * @Return:
      * @Exception:
      * @Date: 2021/1/26 15:24
      * @Param: * @param null
      * @Return:
      */
    public Integer  getStoreIdByStoreName(@Param("storeName") String storeName);
     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:根据店铺名称查询店铺信息
      * @Return:
      * @Exception:
      * @Date: 2021/2/6 16:55
      * @Param: * @param null
      * @Return:
      */
    public Store getStoreInfosByStoreName(@Param("storeName")String storeName);

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:根据店铺拥有者姓名查询店铺编号
      * @Return:
      * @Exception:
      * @Date: 2021/2/6 20:09
      * @Param: * @param null
      * @Return:
      */
    public int getStoreIdByStoreOwnerName(@Param("storeOwner") String storeOwner);

}
