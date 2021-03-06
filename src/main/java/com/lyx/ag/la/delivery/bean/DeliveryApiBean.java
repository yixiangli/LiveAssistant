package com.lyx.ag.la.delivery.bean;

import com.alibaba.fastjson.JSONArray;

public class DeliveryApiBean {

	//运单编号
	private String nu;
	//快递消息
	private String message;
	//是否确认
	private String ischeck;
	//快递公司
	private String com;
	//更新时间
	private String updatetime;
	//接口状态
	private String status;
	//条件
	private String condition;
	//状态
	private String state;	
	//快递详情
	private JSONArray data;
	
	public String getNu() {
		return nu;
	}
	public void setNu(String nu) {
		this.nu = nu;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getIscheck() {
		return ischeck;
	}
	public void setIscheck(String ischeck) {
		this.ischeck = ischeck;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public JSONArray getData() {
		return data;
	}
	public void setData(JSONArray data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DeliveryInfo [nu=" + nu + ", message=" + message + ", ischeck=" + ischeck + ", com="
		+ com + ", updatetime=" + updatetime + ", status=" + status + ", condition=" + condition + ", state="
		+ state + ",data" + data +"]";
	}
	
}
