package com.bc.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.bc.dao.mapper.FolderMapper;
import com.bc.frame.Dao;
import com.bc.vo.FolderVO;

public class FolderDao implements Dao<FolderVO,String>{

	@Autowired
	FolderMapper mapper;
	
	@Override
	public void insert(FolderVO t) throws Exception {
		mapper.insert(t);
	}

	@Override
	public void update(FolderVO t) throws Exception {
		mapper.update(t);
	}

	@Override
	public void delete(String v) throws Exception {
		mapper.delete(v);
	}

	@Override
	public FolderVO select(String v) throws Exception {
		return mapper.select(v);
	}

	@Override
	public ArrayList<FolderVO> selectall() throws Exception {
		return mapper.selectall();
	}

}
