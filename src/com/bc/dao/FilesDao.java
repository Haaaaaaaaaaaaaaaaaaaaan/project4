package com.bc.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.bc.dao.mapper.FilesMapper;
import com.bc.frame.Dao;
import com.bc.vo.FilesVO;

public class FilesDao implements Dao<FilesVO,String>{

	@Autowired
	FilesMapper mapper;
	
	@Override
	public void insert(FilesVO t) throws Exception {
		mapper.insert(t);
	}

	@Override
	public void update(FilesVO t) throws Exception {
		mapper.update(t);
	}

	@Override
	public void delete(String v) throws Exception {
		mapper.delete(v);
	}

	@Override
	public FilesVO select(String v) throws Exception {
		return mapper.select(v);
	}

	@Override
	public ArrayList<FilesVO> selectall() throws Exception {
		return mapper.selectall();
	}

}
