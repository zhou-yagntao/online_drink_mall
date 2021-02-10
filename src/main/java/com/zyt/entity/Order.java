package com.zyt.entity;

import java.util.Date;

/**
 * @ProjectName: online_drink_mall
 * @Package: com.zyt.entity
 * @ClassName: Order
 * @Author: zhou_yangtao@yeah.net
 * @Description: 订单详情实体类
 * @Date: 10:10 2021/2/7
 * @Version: 1.0
 */
public class Order {
    private  Integer CorderId;
    private String CorderName;
    private Integer CustomerId;
    private String OrderProduct;
    private String OrderProdType;
    private String OrderProdStore;
    private Integer OrderProdCounts;
    private String OrderPayType;
    private Integer OrderPayMoney;
    private String OrderAcceptAddr;
    private String CustomerPhone;
    private Date OrderTime;
    private boolean IsFinishDeliver;
    private boolean IsFinishSend;
    private boolean IsFinishChargeback;
    private boolean IsEvaluate;

    public Order(){super();}

    public Order(Integer corderId, String corderName, Integer customerId, String orderProduct, String orderProdType, String orderProdStore, Integer orderProdCounts, String orderPayType, Integer orderPayMoney, String orderAcceptAddr, String customerPhone, Date orderTime, boolean isFinishDeliver, boolean isFinishSend, boolean isFinishChargeback, boolean isEvaluate) {
        CorderId = corderId;
        CorderName = corderName;
        CustomerId = customerId;
        OrderProduct = orderProduct;
        OrderProdType = orderProdType;
        OrderProdStore = orderProdStore;
        OrderProdCounts = orderProdCounts;
        OrderPayType = orderPayType;
        OrderPayMoney = orderPayMoney;
        OrderAcceptAddr = orderAcceptAddr;
        CustomerPhone = customerPhone;
        OrderTime = orderTime;
        IsFinishDeliver = isFinishDeliver;
        IsFinishSend = isFinishSend;
        IsFinishChargeback = isFinishChargeback;
        IsEvaluate = isEvaluate;
    }

    public Integer getCorderId() {
        return CorderId;
    }

    public void setCorderId(Integer corderId) {
        CorderId = corderId;
    }

    public String getCorderName() {
        return CorderName;
    }

    public void setCorderName(String corderName) {
        CorderName = corderName;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer customerId) {
        CustomerId = customerId;
    }

    public String getOrderProduct() {
        return OrderProduct;
    }

    public void setOrderProduct(String orderProduct) {
        OrderProduct = orderProduct;
    }

    public String getOrderProdType() {
        return OrderProdType;
    }

    public void setOrderProdType(String orderProdType) {
        OrderProdType = orderProdType;
    }

    public String getOrderProdStore() {
        return OrderProdStore;
    }

    public void setOrderProdStore(String orderProdStore) {
        OrderProdStore = orderProdStore;
    }

    public Integer getOrderProdCounts() {
        return OrderProdCounts;
    }

    public void setOrderProdCounts(Integer orderProdCounts) {
        OrderProdCounts = orderProdCounts;
    }

    public String getOrderPayType() {
        return OrderPayType;
    }

    public void setOrderPayType(String orderPayType) {
        OrderPayType = orderPayType;
    }

    public Integer getOrderPayMoney() {
        return OrderPayMoney;
    }

    public void setOrderPayMoney(Integer orderPayMoney) {
        OrderPayMoney = orderPayMoney;
    }

    public String getOrderAcceptAddr() {
        return OrderAcceptAddr;
    }

    public void setOrderAcceptAddr(String orderAcceptAddr) {
        OrderAcceptAddr = orderAcceptAddr;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        CustomerPhone = customerPhone;
    }

    public Date getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(Date orderTime) {
        OrderTime = orderTime;
    }

    public boolean isFinishDeliver() {
        return IsFinishDeliver;
    }

    public void setFinishDeliver(boolean finishDeliver) {
        IsFinishDeliver = finishDeliver;
    }

    public boolean isFinishSend() {
        return IsFinishSend;
    }

    public void setFinishSend(boolean finishSend) {
        IsFinishSend = finishSend;
    }

    public boolean isFinishChargeback() {
        return IsFinishChargeback;
    }

    public void setFinishChargeback(boolean finishChargeback) {
        IsFinishChargeback = finishChargeback;
    }

    public boolean isEvaluate() {
        return IsEvaluate;
    }

    public void setEvaluate(boolean evaluate) {
        IsEvaluate = evaluate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "CorderId=" + CorderId +
                ", CorderName='" + CorderName + '\'' +
                ", CustomerId=" + CustomerId +
                ", OrderProduct='" + OrderProduct + '\'' +
                ", OrderProdType='" + OrderProdType + '\'' +
                ", OrderProdStore='" + OrderProdStore + '\'' +
                ", OrderProdCounts=" + OrderProdCounts +
                ", OrderPayType='" + OrderPayType + '\'' +
                ", OrderPayMoney=" + OrderPayMoney +
                ", OrderAcceptAddr='" + OrderAcceptAddr + '\'' +
                ", CustomerPhone='" + CustomerPhone + '\'' +
                ", OrderTime=" + OrderTime +
                ", IsFinishDeliver=" + IsFinishDeliver +
                ", IsFinishSend=" + IsFinishSend +
                ", IsFinishChargeback=" + IsFinishChargeback +
                ", IsEvaluate=" + IsEvaluate +
                '}';
    }
}
