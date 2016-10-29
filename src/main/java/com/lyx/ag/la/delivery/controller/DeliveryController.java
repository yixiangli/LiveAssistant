package com.lyx.ag.la.delivery.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lyx.ag.la.delivery.bean.DeliveryApiBean;
import com.lyx.ag.la.delivery.service.IFreeDeliveryApiService;

/**
 * 
 * @author liyixiang
 * @date 2016年10月30日
 * @use 快递查询控制层
 */
@Controller("/delivery")
public class DeliveryController {

	@Resource
	IFreeDeliveryApiService freeDeliveryApiService;
	
	@RequestMapping("/query")
	public ModelAndView queryDeliveryInfo(String com_type,String delivery_id){
		ModelAndView mav = new ModelAndView("/deliveryResult");		
		DeliveryApiBean bean = freeDeliveryApiService.findDeliveryInfoByConditions(com_type, delivery_id);
		mav.addObject("del_bean",bean);
		return mav;
	}
}
