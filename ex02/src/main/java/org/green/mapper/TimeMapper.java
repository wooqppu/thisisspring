package org.green.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
//	@Select("Select sysdate from dual")
	@Select("Select * from tbl_board")
	public String getTime();
	public String getTime2();
}
