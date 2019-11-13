package com.petcare.web.mapper;

import java.util.List;
import java.util.Map;

import com.petcare.web.dto.AnimalDTO;
import com.petcare.web.dto.ReserveDTO;

public interface ReserveMapper {

	String getTime();
	
	List<AnimalDTO> getAniList(String id);
	
	int insertReserv(ReserveDTO reserveDTO);
	
	List<ReserveDTO> getReserv();
}
