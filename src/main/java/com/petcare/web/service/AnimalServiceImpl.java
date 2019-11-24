package com.petcare.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petcare.web.domain.AnimalVo;
import com.petcare.web.domain.Criteria;
import com.petcare.web.mapper.AnimalMapper;

import lombok.extern.log4j.Log4j;

@Service
public class AnimalServiceImpl implements AnimalService{
	
	@Autowired
	private AnimalMapper animalMapper;

	//동물 등록
	@Override
	public void register(AnimalVo animal) {
		animalMapper.insert(animal);
	}

	//동물 리스트
	@Override
	public List<AnimalVo> getList(Criteria cri) {
		return animalMapper.getListWithPaging(cri);
	}

	//동물 정보 조회
	@Override
	public AnimalVo get(int ano) {
		return animalMapper.read(ano);
	}

	//동물 정보 삭제
	@Override
	public boolean remove(int ano) {
		return animalMapper.delete(ano) == 1;
	}

	//동물 정보 수정
	@Override
	public boolean modify(AnimalVo animal) {
		return animalMapper.update(animal) == 1;
	}

	//전체 글 개수
	@Override
	public int getTotal(Criteria cri) {
		return animalMapper.getTotalCount(cri);
	}
	
}
