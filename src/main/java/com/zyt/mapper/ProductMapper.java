package com.zyt.mapper;

import com.zyt.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: online_drink_mall
 * @Package: com.zyt.mapper
 * @ClassName: ProductMapper
 * @Author: zhou_yangtao@yeah.net
 * @Description: 商品信息管理持久层
 * @Date: 12:48 2021/1/25
 * @Version: 1.0
 */
@Mapper
@Repository(value = "productMapper")
public interface ProductMapper {
     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:新的商品入驻
      * @Return:
      * @Exception:
      * @Date: 2021/1/25 12:50
      * @Param: * @param null
      * @Return:
      */
    public int addNewStoreProduct(Product product);

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:查询所有商品信息
      * @Return:
      * @Exception:
      * @Date: 2021/2/1 10:53
      * @Param: * @param null
      * @Return:
      */
    //public List<Product> getAllProductRelationInfos(@Param("start") int start,@Param("end") int end,@Param("storeName") String storeName);
    public List<Product> getAllProductRelationInfos(@Param("start") int start,@Param("end") int end);

    /**
     * @Method:
     * @Author: zhou_yangtao@yeah.net
     * @Version  1.0
     * @Description: 查询当前店铺下商品信息总数
     * @Return:
     * @Exception:
     * @Date: 2021/2/1 10:55
     * @Param: * @param null
     * @Return:
     */
    //public int allProductCountsCurrentStore(@Param("storeName") String storeName);
    public int allProductCountsCurrentStore();


    /**
     * @Method:
     * @Author: zhou_yangtao@yeah.net
     * @Version  1.0
     * @Description:根据查询商品系信息
     * @Return:
     * @Exception:
     * @Date: 2021/2/1 14:50
     * @Param: * @param null
     * @Return:
     */
    public List<Product> getProductInfosByItems(@Param("start") int start,@Param("end") int end,@Param("productName") String productName,@Param("storeName") String storeName,@Param("prodBrandId") Integer prodBrandId);

    /**
     * @Method:
     * @Author: zhou_yangtao@yeah.net
     * @Version  1.0
     * @Description:根据条件查询商品数量
     * @Return:
     * @Exception:
     * @Date: 2021/2/1 14:50
     * @Param: * @param null
     * @Return:
     */
    public int getProductInfoCountsBYItems(@Param("productName") String productName,@Param("storeName") String storeName,@Param("prodBrandId") Integer prodBrandId);

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:删除商品信息
      * @Return:
      * @Exception:
      * @Date: 2021/2/1 17:35
      * @Param: * @param null
      * @Return:
      */
    public int deleteProductByProdId(@Param("productId") int productId);

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:修改商品信息
      * @Return:
      * @Exception:
      * @Date: 2021/2/1 17:56
      * @Param: * @param null
      * @Return:
      */
    public int updateProductCoupleState(@Param("productId") int productId,@Param("coupleState") String coupleState);

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:修改商品信息
      * @Return:
      * @Exception:
      * @Date: 2021/2/1 17:56
      * @Param: * @param null
      * @Return:
      */

    public int updateProductIntegeral(@Param("productId") int productId,@Param("integralState") String integralState);

    /**
     * @Method:
     * @Author: zhou_yangtao@yeah.net
     * @Version  1.0
     * @Description: 获得当前编号所有商品信息
     * @Return:
     * @Exception:
     * @Date: 2021/2/5 14:17
     * @Param: * @param null
     * @Return:
     */
    public List<Product> getProductInfoByProdId(@Param("productId") int productId);

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description: 修改商品是否上架状态
      * @Return:
      * @Exception:
      * @Date: 2021/2/5 20:06
      * @Param: * @param null
      * @Return:
      */
    public int updateProductIsOnSheleves(@Param("productId") int productId,@Param("flag")String flag);

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:根据条件查询商品的信息
      * @Return:
      * @Exception:
      * @Date: 2021/2/6 10:04
      * @Param: * @param null
      * @Return:
      */
    public List<Product> searchProInfoByItems(@Param("start") int start,@Param("end") int end,@Param("params")String params);

    /**
     * @Method:
     * @Author: zhou_yangtao@yeah.net
     * @Version  1.0
     * @Description: 根据条件查询商品的数量
     * @Return:
     * @Exception:
     * @Date: 2021/2/6 9:57
     * @Param: * @param null
     * @Return:
     */
    public int searchProInfoCountsByItems(@Param("params")String params);

     /**
      * @Method:
      * @Author: zhou_yangtao@yeah.net
      * @Version  1.0
      * @Description:获得商品信息进行前台渲染
      * @Return:
      * @Exception:
      * @Date: 2021/2/10 16:55
      * @Param: * @param null
      * @Return:
      */
    public List<Product> getAllProductInfos();
}
