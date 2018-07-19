package com.bc.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.bc.frame.Dao;
import com.bc.frame.Service;
import com.bc.vo.FilesVO;
import com.bc.vo.QuestionThumbsupVO;

public class QuestionThumbsupService implements Service<QuestionThumbsupVO, String>{

	@Resource(name = "qtdao")
	Dao<QuestionThumbsupVO, String> qtdao;

	@Override
	public void register(QuestionThumbsupVO t) throws Exception {
		qtdao.insert(t);
	}

	@Override
	public void modify(QuestionThumbsupVO t) throws Exception {
		qtdao.update(t);
	}

	@Override
	public void remove(String v) throws Exception {
		qtdao.delete(v);
	}

	@Override
	public QuestionThumbsupVO get(String v) throws Exception {
		return qtdao.select(v);
	}

	@Override
	public ArrayList<QuestionThumbsupVO> get() throws Exception {
		return qtdao.selectall();
	}


}
