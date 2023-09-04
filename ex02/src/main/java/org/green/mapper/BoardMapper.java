package org.green.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.green.domain.BoardVO;
import org.green.domain.Criteria;

public interface BoardMapper {
	// 추상메소드 
	@Select("Select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	// create -> insert 처리
	public void insert(BoardVO vo);
	
	// read -> select 처리
	public BoardVO read(Long bno);
	
	// delete -> delete 처리 
	public int delete(Long bno);
	
	// update -> update 처리 
	public int update(BoardVO board);
	
	// 페이징 사용해서 조회 
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	// 전체 데이터 개수 
	public int getTotalCount(Criteria cri);
	
	// insert 메소드2 -> 등록된 번호 받기
	public void insertSelectKey(BoardVO vo);
	
	// 검색 연습 
	// Map<key: String, value: Map 타입>
	public List<BoardVO> searchTest(Map<String, Map<String, String>> map);
	
}
