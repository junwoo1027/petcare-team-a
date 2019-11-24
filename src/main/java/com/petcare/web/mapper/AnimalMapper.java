package com.petcare.web.mapper;

import java.util.List;

import com.petcare.web.domain.AnimalVo;
import com.petcare.web.domain.Criteria;

public interface AnimalMapper {
    
    public void insert(AnimalVo animal); //동물 등록
    
    public List<AnimalVo> getList(); //동물 리스트
    
    public List<AnimalVo> getListWithPaging(Criteria cri); //동물 리스트 페이징
    
    public AnimalVo read(int ano); //동물 정보 조회
    
    public int delete(int ano); //동물정보 삭제
    
    public int update(AnimalVo animal); //동물 정보 수정
    
    public int getTotalCount(Criteria cri); //전체 글 개수
}
