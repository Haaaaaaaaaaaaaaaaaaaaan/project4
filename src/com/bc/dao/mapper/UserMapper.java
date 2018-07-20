package com.bc.dao.mapper;

import java.util.ArrayList;
import com.bc.vo.UsersVO;

public interface UserMapper {
	public void insert(UsersVO obj);
	public void delete(String obj);
	public void update(UsersVO obj);
	public UsersVO select(String obj);
	public UsersVO selectFind(UsersVO obj); //이름과 이메일로 유저 검색
	public ArrayList<UsersVO> selectall();
}
