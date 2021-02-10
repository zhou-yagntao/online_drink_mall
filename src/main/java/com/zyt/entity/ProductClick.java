package com.zyt.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ProjectName: online_drink_mall
 * @Package: com.zyt.entity
 * @ClassName: ProductClick
 * @Author: zhou_yangtao@yeah.net
 * @Description: 商品点击量表
 * @Date: 12:35 2021/1/25
 * @Version: 1.0
 */
public class ProductClick implements Serializable {
    private Integer ProClickId;
    private Integer ProClickProId;
    private Integer ProClickCounts;
    private Date ProClickTime;

    public ProductClick() {
       super();
    }

    public ProductClick(Integer proClickId) {
        ProClickId = proClickId;
    }

    public ProductClick(Integer proClickId, Integer proClickProId, Integer proClickCounts, Date proClickTime) {
        ProClickId = proClickId;
        ProClickProId = proClickProId;
        ProClickCounts = proClickCounts;
        ProClickTime = proClickTime;
    }

    public Integer getProClickId() {
        return ProClickId;
    }

    public void setProClickId(Integer proClickId) {
        ProClickId = proClickId;
    }

    public Integer getProClickProId() {
        return ProClickProId;
    }

    public void setProClickProId(Integer proClickProId) {
        ProClickProId = proClickProId;
    }

    public Integer getProClickCounts() {
        return ProClickCounts;
    }

    public void setProClickCounts(Integer proClickCounts) {
        ProClickCounts = proClickCounts;
    }

    public Date getProClickTime() {
        return ProClickTime;
    }

    public void setProClickTime(Date proClickTime) {
        ProClickTime = proClickTime;
    }
}
