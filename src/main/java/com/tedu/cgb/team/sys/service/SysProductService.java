package com.tedu.cgb.team.sys.service;

import java.util.Map;

import com.tedu.cgb.team.common.entity.Product;
import com.tedu.cgb.team.common.vo.Page;

public interface SysProductService {
	
	/**
	 * 根据context字段查找数据并封装到Page对象，
	 * 当context为null或空串时查询所有记录
	 * @param name
	 * @return
	 */
	Page<Map<String, Object>> findPage(String context, Integer pageCurrent);

	/**
	 * 根据product的id属性更新数据库对应的记录
	 * @param product
	 * @return 
	 */
	int updateObject(Product product);

	/**
	 * 根据id查找对应的记录
	 * @param id
	 * @return
	 */
	Product findObjectById(Integer id);

	/**
	 * 存入一条新纪录
	 * @param product
	 */
	int saveObejct(Product product);

}
