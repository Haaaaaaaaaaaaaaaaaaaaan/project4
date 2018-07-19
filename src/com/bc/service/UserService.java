package com.bc.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.bc.frame.Dao;
import com.bc.frame.Service;
import com.bc.vo.UsersVO;

public class UserService implements Service<UsersVO, String>{

	@Resource(name = "udao")
	Dao<UsersVO, String> udao;
	
	@Override
	public void register(UsersVO t) throws Exception {
		udao.insert(t);
	}

	@Override
	public void modify(UsersVO t) throws Exception {
		udao.update(t);
	}

	@Override
	public void remove(String v) throws Exception {
		udao.delete(v);
	}

	@Override
	public UsersVO get(String v) throws Exception {
		return udao.select(v);
	}

	@Override
	public ArrayList<UsersVO> get() throws Exception {
		return udao.selectall();
	}


}
