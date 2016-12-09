package com.java1234.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.LinkDao;
import com.java1234.entity.Link;
import com.java1234.service.LinkService;

/**
 * ��������Serviceʵ����
 * @author Administrator
 *
 */
@Service("linkService")
public class LinkServiceImpl implements LinkService{

	@Resource
	private LinkDao linkDao;

	public List<Link> list(Map<String, Object> map) {
		return linkDao.list(map);
	}

	
	
	

}
