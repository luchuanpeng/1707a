package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Goodskind;

public interface GoodService {

	List<Brand> queryBrandAll();

	boolean addGoods(Goods goods);

	List<Goodskind> queryGoodskind();

	List<Goods> queryGoodsAll(Map<String, Object> map);

}
