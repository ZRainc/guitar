package com.zyc.guitar.dao;

import java.util.List;

import com.zyc.guitar.pojo.Guitar;


public interface GuitarDao {
	
	
	/**
	 * @method 查询所有吉他
	 * @author mahui
	 * @return List<Guitar>
	 */
	List<Guitar> findAll();
	
	/**
	 * @method 新增吉他
	 * @author mahui
	 * @return void
	 */
	void add(Guitar guitar);
	
	/**
	 * @method 更新吉他
	 * @param guitar
	 * @author mahui
	 * @return void
	 */
	void update(Guitar guitar);
	
	/**
	 * @method 删除吉他
	 * @param guitar
	 * @author mahui
	 * @return void
	 */
	void delete (String id);
	
	/**
	 * @method 查询个数
	 * @param guitar
	 * @author mahui
	 * @return long
	 */
	int count ();
	
}
