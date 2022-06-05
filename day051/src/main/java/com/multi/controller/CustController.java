package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@Controller
@RequestMapping("/cust")
public class CustController {

	@Autowired
	CustBiz biz;

	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left", "cust/left");
		mv.addObject("center", "cust/center");
		return mv;
	}

	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left", "cust/left");
		mv.addObject("center", "cust/register");
		return mv;
	}

	@RequestMapping("/registerimpl")
	public ModelAndView registerimpl(ModelAndView mv, CustVO obj) {
		mv.setViewName("main");
		mv.addObject("left", "cust/left");
		try {
			biz.register(obj);
			mv.addObject("center", "cust/registerok");
			mv.addObject("rcust", obj);
		} catch (Exception e) {
			mv.addObject("center", "cust/registerfail");
			e.printStackTrace();
		}
		return mv;
	}

	@RequestMapping("/select")
	public ModelAndView select(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left", "cust/left");
		List<CustVO> list = null;
		try {
			list = biz.get();
			mv.addObject("center", "cust/select");
			mv.addObject("allcust", list);
		} catch (Exception e) {
			mv.addObject("center", "cust/registerfail");
		}
		return mv;
	}

	@RequestMapping("/detail")
	public ModelAndView detail(ModelAndView mv, String id) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		CustVO c = null;
		try {
			c = biz.get(id);
			mv.addObject("center","cust/detail");
			mv.addObject("dcust", c);
		} catch (Exception e) {
			mv.addObject("center", "cust/registerfail");
		}
		return mv;
	}

	@RequestMapping("/delete")
	public String delete(String id) {
		try {
			biz.remove(id);
		} catch (Exception e) {

		}
		return "redirect:select";
	}

	@RequestMapping("/update")
	public ModelAndView update(ModelAndView mv, String id) {
		CustVO c = null;
		mv.setViewName("main");
		mv.addObject("left", "cust/left");
		try {
			c = biz.get(id);
			mv.addObject("ucust", c);
			mv.addObject("center","cust/update" );
		} catch (Exception e) {

		}
		return mv;
	}

	@RequestMapping("/custupdateimpl")
	public String updateimpl(CustVO c) {
		try {
			biz.modify(c);
		} catch (Exception e) {
		}
		return "redirect:detail?id=" + c.getId();
	}
}
