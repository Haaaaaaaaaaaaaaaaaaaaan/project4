package com.bc.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.bc.dao.mapper.QuestionMapper;
import com.bc.frame.Dao;
import com.bc.vo.QuestionVO;

public class QuestionDao implements Dao<QuestionVO,String>{

	@Autowired
	QuestionMapper mapper;
	
	@Override
	public void insert(QuestionVO t) throws Exception {
		mapper.insert(t);
	}

	@Override
	public void update(QuestionVO t) throws Exception {
		mapper.update(t);
	}

	@Override
	public void delete(String v) throws Exception {
		mapper.delete(v);
	}

	@Override
	public QuestionVO select(String v) throws Exception {
		return mapper.select(v);
	}

	@Override
	public ArrayList<QuestionVO> selectall() throws Exception {
		return mapper.selectall();
	}

}
