package com.lyx.ag.la.delivery.outapi;

import com.lyx.ag.la.delivery.utils.HttpClientUtils;

/**
 * 
 * @author liyixiang
 * @date 2016年10月30日
 * @use 第三方接口
 */
public class OutApi {

	private static String URL = "http://www.kuaidi100.com/query?";

	public static String invoke(String deliveryType,String deliveryId) throws Exception{
		URL = URL + "type=" + deliveryType + "&" + "postid=" + deliveryId;
		return HttpClientUtils.httpGetRequest(URL);
	}
}
