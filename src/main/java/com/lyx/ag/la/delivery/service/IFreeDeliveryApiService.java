package com.lyx.ag.la.delivery.service;

import java.util.List;

import com.lyx.ag.la.delivery.bean.DeliveryInfoBean;

/**
 * 
 * @author liyixiang
 * @date 2016年10月30日
 * @use  免费快递查询接口服务
 */
public interface IFreeDeliveryApiService {

	public List<DeliveryInfoBean> findDeliveryInfoByConditions(String type,String id);
	
	
}
