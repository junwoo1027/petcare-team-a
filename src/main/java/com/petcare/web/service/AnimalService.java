package com.petcare.web.service;

import java.util.List;

import com.petcare.web.domain.AnimalVo;
import com.petcare.web.domain.Criteria;

public interface AnimalService {

	public void register(AnimalVo animal); //동물 등록
	
	//public List<AnimalVo> getList(); //동물 리스트
	
	public List<AnimalVo> getList(Criteria cri);
	
	public AnimalVo get(int ano); //동물정보 조회
	
	public boolean remove(int ano); //동물정보 삭제
	
	public boolean modify(AnimalVo animal); //동물정보 수정
	
	public int getTotal(Criteria cri); // 전체 글 개수
}
