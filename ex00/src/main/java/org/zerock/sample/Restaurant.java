package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Component
@Data
// @AllArgsConstructor	// 생성자 주입
@RequiredArgsConstructor
public class Restaurant {
	// 의존성 주입 (필드 주입)
	// @Setter(onMethod_ = {@Autowired}) // 세터 주입	
	private final Chef chef;	// chef=new Chef()와 똑같은 역할 
}
