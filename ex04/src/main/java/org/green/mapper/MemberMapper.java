package org.green.mapper;

import java.util.List;

import org.green.domain.MemberDTO;

public interface MemberMapper {
	public List<MemberDTO> getList();
	public void insert(MemberDTO mto);
	
}
