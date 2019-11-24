package com.petcare.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.petcare.web.domain.Criteria;
import com.petcare.web.domain.ReviewVo;

public interface ReviewMapper {

	public int insert(ReviewVo review);
	
	public List<ReviewVo> getList(@Param("cri") Criteria cri, @Param("hospitalid") String hospitalid);
	
	public int getCountByHospitalid(@Param("hospitalid") String hospitalid);
	
	public int delete(int reviewNo);
}
