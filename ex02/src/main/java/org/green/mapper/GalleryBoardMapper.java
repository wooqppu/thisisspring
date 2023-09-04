package org.green.mapper;

import java.util.List;

import org.green.domain.GalleryBoardVO;

public interface GalleryBoardMapper {
	
	// read -> all select 처리 
	public List<GalleryBoardVO> getList();
	
	// create -> insert 처리 
	public void insert(GalleryBoardVO gvo);
	
	// read -> select 처리 
	public GalleryBoardVO read(int gno);
	
	// delete -> delete 처리 
	public int delete(int gno);
	
	// update -> update 처리 
	public int update(GalleryBoardVO gvo);
}
