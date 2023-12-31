package org.green.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class BoardVO {
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regidate;
	private Date updatedate;
	private String rnum;
	
	private List<BoardAttachVO> attachList;
}
