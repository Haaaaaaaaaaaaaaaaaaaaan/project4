package com.bc.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.bc.frame.Dao;
import com.bc.frame.Service;
import com.bc.vo.QuestionVO;

public class QuestionService implements Service<QuestionVO, String>{

	@Resource(name = "qdao")
	Dao<QuestionVO, String> qdao;
	
	@Override
	public void register(QuestionVO t) throws Exception {
		qdao.insert(t);
	}

	@Override
	public void modify(QuestionVO t) throws Exception {
		qdao.update(t);
	}

	@Override
	public void remove(String v) throws Exception {
		qdao.delete(v);
	}

	@Override
	public QuestionVO get(String v) throws Exception {
		return qdao.select(v);
	}

	@Override
	public ArrayList<QuestionVO> get() throws Exception {
		return qdao.selectall();
	}

}
