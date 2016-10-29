package com.lyx.ag.la.delivery.service.support;

import java.util.List;

import com.lyx.ag.la.delivery.bean.DeliveryInfoBean;
import com.lyx.ag.la.delivery.outapi.OutApi;
import com.lyx.ag.la.delivery.service.IFreeDeliveryApiService;
import com.lyx.ag.la.delivery.utils.StringUtils;

public class FreeDeliveryApiServiceSupport implements IFreeDeliveryApiService {

	@Override
	public List<DeliveryInfoBean> findDeliveryInfoByConditions(String type,String id) {
		// TODO Auto-generated method stub
		String result = "";
		try {
			result = OutApi.invoke(type, id);
		}catch (Exception e){
			System.out.println("未查到相应快递信息，请确认查询条件");
		}
		
		if(StringUtils.isNotBlank(result)){
			
		}
		System.out.println(result);
		return null;
	}

}
