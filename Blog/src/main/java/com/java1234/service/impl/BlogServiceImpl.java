package com.java1234.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.BlogDao;
import com.java1234.entity.Blog;
import com.java1234.service.BlogService;

/**
 * 博客Service实现类
 * @author Administrator
 *
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService{

	@Resource
	private BlogDao blogDao;
	
	public List<Blog> countList() {
		return blogDao.countList();
	}

	public List<Blog> list(Map<String, Object> map) {
		return blogDao.list(map);
	}

	public Long getTotal(Map<String, Object> map) {
		return blogDao.getTotal(map);
	}

}
