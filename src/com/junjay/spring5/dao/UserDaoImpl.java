package com.junjay.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author My
 *	implements ʵ�� UserDao �ӿ�
 *	
 */
@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public void add() {
		System.err.println("userDao  add.......");
	}

}
