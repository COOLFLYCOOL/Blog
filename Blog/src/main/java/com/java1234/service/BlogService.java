package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Blog;

/**
 * ����Service�ӿ�
 * @author Administrator
 *
 */
public interface BlogService {

	/**
	 * �������ڷ��·����ѯ
	 * @return
	 */
	public List<Blog> countList();
	
	/**
	 * ��ҳ��ѯ����
	 * @param map
	 * @return
	 */
	public List<Blog> list(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
}
