package com.hp.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.domain.TOrders;
import com.hp.services.TOrdersServices;

@Controller
@RequestMapping("/TOrder")
public class TOrderController {

	@Resource
	private TOrdersServices tOrdersServices;
	
	
	@RequestMapping("/getAll")
	public String getAll(Model model,HttpServletRequest request)
	{
		int  pageNum = 1;
		try {
		
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
		
		
		} catch (NumberFormatException e) {
			//�����û��ֵ��
			
		}
		
		PageHelper.startPage(pageNum,2);//ǰ��һ�������ǵڼ�ҳ������һ��������ÿҳ��ʾ����
		List<TOrders> orders = tOrdersServices.getAll();
		
		PageInfo<TOrders> list=new PageInfo<>(orders);
		System.out.println(list);
		
		model.addAttribute("orders",list);
		
		return "index";
	}
}
