package com.bc.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.bc.frame.Dao;
import com.bc.frame.Service;
import com.bc.vo.AnswerThumbsupVO;

public class AnswerThumbsupService implements Service<AnswerThumbsupVO, String>{
	
	@Resource(name = "atdao")
	Dao<AnswerThumbsupVO, String> atdao;

	@Override
	public void register(AnswerThumbsupVO t) throws Exception {
		atdao.insert(t);
	}

	@Override
	public void modify(AnswerThumbsupVO t) throws Exception {
		// TODO Auto-generated method stub
		atdao.update(t);
	}

	@Override
	public void remove(String v) throws Exception {
		// TODO Auto-generated method stub
		atdao.delete(v);
	}

	@Override
	public AnswerThumbsupVO get(String v) throws Exception {
		// TODO Auto-generated method stub
		return atdao.select(v);
	}

	@Override
	public ArrayList<AnswerThumbsupVO> get() throws Exception {
		// TODO Auto-generated method stub
		return atdao.selectall();
	}


	
	
}
