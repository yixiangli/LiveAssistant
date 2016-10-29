package com.lyx.ag.la.delivery.service;

import com.lyx.ag.la.delivery.bean.DeliveryApiBean;

/**
 * 
 * @author liyixiang
 * @date 2016年10月30日
 * @use  免费快递查询接口服务
 */
public interface IFreeDeliveryApiService {

	public DeliveryApiBean findDeliveryInfoByConditions(String type,String id);
	
	
}
