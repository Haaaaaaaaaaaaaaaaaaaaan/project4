package com.bc.dao.mapper;

import java.util.ArrayList;

import com.bc.vo.TagVO;


public interface TagMapper {
	public void insert(TagVO obj);
	public void delete(String obj);
	public void update(TagVO obj);
	public TagVO select(String obj);
	public ArrayList<TagVO> selectall();
}
