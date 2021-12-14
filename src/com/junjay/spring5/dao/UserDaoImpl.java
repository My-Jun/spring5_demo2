package com.junjay.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author My
 *	implements 实现 UserDao 接口
 *	
 */
@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public void add() {
		System.err.println("userDao  add.......");
	}

}
