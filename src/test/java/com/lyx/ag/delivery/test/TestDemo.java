package com.lyx.ag.delivery.test;

import com.lyx.ag.la.delivery.service.support.FreeDeliveryApiServiceSupport;

public class TestDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FreeDeliveryApiServiceSupport s = new FreeDeliveryApiServiceSupport();
		s.findDeliveryInfoByConditions("ems", "9890223241026");
		
		//System.out.println(OutApi.invoke("ems", "9890223241026"));
	}

}
