package com.bc.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.bc.frame.Dao;
import com.bc.frame.Service;
import com.bc.vo.FolderVO;

public class FolderService implements Service<FolderVO, String>{

	@Resource(name = "fddao")
	Dao<FolderVO, String> fddao;

	@Override
	public void register(FolderVO t) throws Exception {
		fddao.insert(t);
	}

	@Override
	public void modify(FolderVO t) throws Exception {
		fddao.update(t);
	}

	@Override
	public void remove(String v) throws Exception {
		fddao.delete(v);
	}

	@Override
	public FolderVO get(String v) throws Exception {
		return fddao.select(v);
	}

	@Override
	public ArrayList<FolderVO> get() throws Exception {
		return fddao.selectall();
	}


}
