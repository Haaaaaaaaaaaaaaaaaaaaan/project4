package com.bc.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.bc.frame.Dao;
import com.bc.frame.Service;
import com.bc.vo.AnswerVO;

public class AnswerService implements Service<AnswerVO, String>{

	@Resource(name = "adao")
	Dao<AnswerVO, String> adao;
	
	@Override
	public void register(AnswerVO t) throws Exception {
		adao.insert(t);
	}

	@Override
	public void modify(AnswerVO t) throws Exception {
		adao.update(t);
	}

	@Override
	public void remove(String v) throws Exception {
		adao.delete(v);
	}

	@Override
	public AnswerVO get(String v) throws Exception {
		return adao.select(v);
	}

	@Override
	public ArrayList<AnswerVO> get() throws Exception {
		return adao.selectall();
	}

}
