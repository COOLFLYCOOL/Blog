package com.java1234.dao;

import com.java1234.entity.Blogger;

/**
 * 博主Dao接口
 * @author Administrator
 *
 */
public interface BloggerDao {

	/**
	 * 通过用户名查询用户
	 * @param userName
	 * @return
	 */
	public Blogger getByUserName(String userName);
	
	/**
	 * 查询博主信息
	 * @return
	 */
	public Blogger find();
}
