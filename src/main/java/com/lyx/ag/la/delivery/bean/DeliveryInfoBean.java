package com.lyx.ag.la.delivery.bean;

/**
 * 
 * @author liyixiang
 * @date 2016年10月30日
 * @use  快递信息
 */
public class DeliveryInfoBean {

	private String time;				//当前时间
	private String context;			//快递信息
	private String ftime;			//发出时间
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getFtime() {
		return ftime;
	}
	public void setFtime(String ftime) {
		this.ftime = ftime;
	}
	
}
