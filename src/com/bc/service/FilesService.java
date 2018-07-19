package com.bc.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.bc.frame.Dao;
import com.bc.frame.Service;
import com.bc.vo.AnswerVO;
import com.bc.vo.FilesVO;





public class FilesService implements Service<FilesVO, String>{

	@Resource(name = "fdao")
	Dao<FilesVO, String> fdao;

	@Override
	public void register(FilesVO t) throws Exception {
		fdao.insert(t);
	}

	@Override
	public void modify(FilesVO t) throws Exception {
		fdao.update(t);
	}

	@Override
	public void remove(String v) throws Exception {
		fdao.delete(v);
	}

	@Override
	public FilesVO get(String v) throws Exception {
		return fdao.select(v);
	}

	@Override
	public ArrayList<FilesVO> get() throws Exception {
		return fdao.selectall();
	}


}
