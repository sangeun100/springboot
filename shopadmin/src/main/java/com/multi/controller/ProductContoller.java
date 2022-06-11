package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.biz.ProductBiz;
import com.multi.frame.Util;
import com.multi.vo.CateVO;
import com.multi.vo.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductContoller {

	@Autowired
	ProductBiz biz;
	
	@Autowired
	CateBiz cbiz;
	
	@RequestMapping("add")
	public String add(Model m) {
		List<CateVO> list = null;
		try {
			list = cbiz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "product/add");
		return "/index";
	}
	@RequestMapping("/select")
	public String select(Model m) {
		List<ProductVO> list = null;
		try {
			list = biz.get();
			m.addAttribute("plist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "product/select");
		return "/index";
	}
	
	@RequestMapping("addimpl")
	public String addimpl(Model m, ProductVO p) {
		// name, price, cid, mf(->imgname)
		System.out.println(p);
		String imgname = p.getMf().getOriginalFilename();
		p.setImgname(imgname);
		
		try {
			biz.register(p);
			Util.saveFile(p.getMf());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:select";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, int id) {
		ProductVO obj = null;
		List<ProductVO> list = null;
		try {
			obj = biz.get(id);
			list = biz.get();
			m.addAttribute("p", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "product/detail");
		return "/index";
	}
	
	@RequestMapping("/update")
	public String update(Model m, ProductVO p) {
//		System.out.println(p);
//		String imgname = p.getMf().getOriginalFilename();
//		p.setImgname(imgname);
		try {
			biz.modify(p);
//			Util.saveFile(p.getMf());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+p.getId();
		
	}
	
	@RequestMapping("delete")
	public String delete(int id, Model m) {
		try {
			biz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
			m.addAttribute("msg", "삭제 할 수 없습니다.");
			return "redirect:detail?id="+id;
		}
		return "redirect:select";
	}
	
	
}













