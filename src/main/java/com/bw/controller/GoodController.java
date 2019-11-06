package com.bw.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Goodskind;
import com.bw.service.GoodService;
import com.bw.utils.FileUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodController {
	
	@Resource
	public GoodService service;
	
	@RequestMapping("/queryGoodsAll")
	public String queryGoodsAll(@RequestParam(defaultValue="1")Integer pageNum,String gname,Model model){
		Map<String, Object>map=new HashMap<String, Object>();
		PageHelper.startPage(pageNum, 3);
		List<Goods>list=service.queryGoodsAll(map);
		PageInfo<Goods>page=new PageInfo<Goods>(list);
		model.addAttribute("page", page);
		return "list";
	}
	
	@RequestMapping("/querySelect")
	@ResponseBody
	public Map<String, Object> querySelect(){
		Map<String, Object>map=new HashMap<String, Object>();
		List<Brand>brandList=service.queryBrandAll();
		List<Goodskind>kindList=service.queryGoodskind();
		map.put("brandList", brandList);
		map.put("kindList", kindList);
		return map;
	}
	
	@RequestMapping("/addGoods")
	public String addGoods(Goods goods,MultipartFile img) throws Exception, IOException{
		String upload = FileUtils.upload(img);
		goods.setGpic(upload);
		boolean flg = service.addGoods(goods);
		if(flg){
			return "redirect:queryGoodsAll";
		}
		return "add";
	}
	
	@RequestMapping("/lookImg")
	public void lookImg(String path,HttpServletRequest request,HttpServletResponse response){
		FileUtils.lookImg(path, request, response);
	}
}
