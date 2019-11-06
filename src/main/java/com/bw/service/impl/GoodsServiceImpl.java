package com.bw.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Goodskind;
import com.bw.mapper.GoodsDao;
import com.bw.service.GoodService;
@Service
public class GoodsServiceImpl implements GoodService{

	@Resource
	public GoodsDao dao;

	public List<Brand> queryBrandAll() {
		return dao.queryBrandAll();
	}

	public List<Goodskind> queryGoodskind() {
		return dao.queryGoodskind();
	}

	public boolean addGoods(Goods goods) {
		return dao.addGoods(goods)>0?true:false;
	}

	public List<Goods> queryGoodsAll(Map<String, Object> map) {
		return dao.queryGoodsAll(map);
	}

}
