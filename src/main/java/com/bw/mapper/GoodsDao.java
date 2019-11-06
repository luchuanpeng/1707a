package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Goodskind;

public interface GoodsDao {

	List<Brand> queryBrandAll();

	List<Goodskind> queryGoodskind();

	int addGoods(Goods goods);

	List<Goods> queryGoodsAll(Map<String, Object> map);

}
