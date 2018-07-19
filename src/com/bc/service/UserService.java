package com.bc.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.bc.frame.Dao;
import com.bc.frame.Service;
import com.bc.vo.Users;

public class UserService implements Service<Users, String>{

	@Resource(name = "udao")
	Dao<Users, String> udao;
	
	@Override
	public void register(Users t) throws Exception {
		udao.insert(t);
	}

	@Override
	public void modify(Users t) throws Exception {
		udao.update(t);
	}

	@Override
	public void remove(String v) throws Exception {
		udao.delete(v);
	}

	@Override
	public Users get(String v) throws Exception {
		return udao.select(v);
	}

	@Override
	public ArrayList<Users> get() throws Exception {
		return udao.selectall();
	}


}
