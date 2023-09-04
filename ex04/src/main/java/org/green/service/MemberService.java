package org.green.service;

import java.util.List;

import org.green.domain.MemberDTO;

public interface MemberService {
	// 등록 
	public void register(MemberDTO mto);
	
	// 조회
	public List<MemberDTO> getList();
	
}
