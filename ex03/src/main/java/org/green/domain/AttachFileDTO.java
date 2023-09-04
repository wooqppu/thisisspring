package org.green.domain;

import lombok.Data;

@Data
// 원본파일 이름, 파일 경로, uuid 값, 이미지 여부 정보를 
// 하나로 묶어서 전달하는 용도  
public class AttachFileDTO {
	private String fileName;
	private String uploadPath;
	private String uuid;
	private boolean image;
	
	
}
