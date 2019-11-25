package com.petcare.web.mapper;

import java.util.List;

import com.petcare.web.domain.PetVo;
import com.petcare.web.domain.Criteria;

public interface PetMapper {
    
    public void insert(PetVo pet); //동물 등록
    
    public List<PetVo> getList(); //동물 리스트
    
    public List<PetVo> getListWithPaging(Criteria cri); //동물 리스트 페이징
    
    public PetVo read(int petNo); //동물 정보 조회
    
    public int delete(int petNo); //동물정보 삭제
    
    public int update(PetVo pet); //동물 정보 수정
    
    public int getTotalCount(Criteria cri); //전체 글 개수
}
