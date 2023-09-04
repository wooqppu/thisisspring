package org.green.service;

import java.util.List;

import org.green.domain.MemberDTO;
import org.green.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {

	@Setter(onMethod_ = {@Autowired})
	private MemberMapper mapper;
	
	@Override
	public void register(MemberDTO mto) {
		log.info("등록하기 : " + mto);
		mapper.insert(mto);
	}

	@Override
	public List<MemberDTO> getList() {
		log.info("리스트 출력");
		return mapper.getList();
	}

}
