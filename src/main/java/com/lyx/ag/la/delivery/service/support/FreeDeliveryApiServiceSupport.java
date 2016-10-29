package com.lyx.ag.la.delivery.service.support;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.lyx.ag.la.delivery.bean.DeliveryApiBean;
import com.lyx.ag.la.delivery.outapi.OutApi;
import com.lyx.ag.la.delivery.service.IFreeDeliveryApiService;
import com.lyx.ag.la.delivery.utils.StringUtils;

@Service("freeDeliveryApiService")
public class FreeDeliveryApiServiceSupport implements IFreeDeliveryApiService {

	//@Override
	public DeliveryApiBean findDeliveryInfoByConditions(String type,String id) {
		// TODO Auto-generated method stub
		String result = "";
		DeliveryApiBean bean = null; 
		
		try {
			result = OutApi.invoke(type, id);
		}catch (Exception e){
			System.out.println("未查到相应快递信息，请确认查询条件");
		}
		
		if(StringUtils.isNotBlank(result)){
			bean = JSON.parseObject(result,DeliveryApiBean.class);
		}
		return bean;
	}

}
