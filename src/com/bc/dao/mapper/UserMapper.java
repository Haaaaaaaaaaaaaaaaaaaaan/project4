package com.bc.dao.mapper;

import java.util.ArrayList;

import com.bc.vo.Users;

public interface UserMapper {
	public void insert(Users obj);
	public void delete(String obj);
	public void update(Users obj);
	public Users select(String obj);
	public ArrayList<Users> selectall();
}
