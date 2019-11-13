package com.petcare.web.controller;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.petcare.web.dto.AnimalDTO;
import com.petcare.web.dto.ReserveDTO;
import com.petcare.web.dto.UserDTO;
import com.petcare.web.service.ReserveService;


@Controller
@RequestMapping("/reserve")
public class ReserveController {

	@Autowired
	private ReserveService reserveService;

	@GetMapping("/reserveview")
	public String reserveview(HttpSession session) {
		
		UserDTO userDTO = new UserDTO();
		userDTO.setId("jiyoung");
		// 삭제예정
		System.out.println(userDTO+"!!!!!!!!!!!!!");
		List<AnimalDTO> animalDTOs = reserveService.getAniList(userDTO.getId());
		System.out.println("animalDTOs"+animalDTOs);
		session.setAttribute("userAnims", animalDTOs);
		session.setAttribute("loginUser", userDTO);
		// 삭제예정
		
		List<ReserveDTO> reserveList = new ArrayList<>();
		reserveList = reserveService.getReserv();
		//공통 소스 이용하여 리스트를 list<map>으로 변경
		List<Map<String, Object>> resultList = convertListToMap(reserveList);
		
		JSONObject json = new JSONObject();
		
		//list<map>을 json 형태로 변형
		
		
		System.out.println("**********"+resultList);
		return "reserve/reserve";
	}
	
	//달력 보일 때 ajax로 ??
	@GetMapping("/result")
	@ResponseBody
	public List<Map<String, Object>> result() {
		List<ReserveDTO> reserveList = new ArrayList<>();
		reserveList = reserveService.getReserv();
		//공통 소스 이용하여 리스트를 list<map>으로 변경
		List<Map<String, Object>> resultList = convertListToMap(reserveList);
		System.out.println("############################");
		return resultList;
	}
	
	@GetMapping("/reserveview1")
	public String reserveview1() {
		 
		return "reserve/reserve1";
	}
	
	@PostMapping("/getReser")
	public @ResponseBody List<AnimalDTO> getPets(@ModelAttribute UserDTO userDTO) {
		
		//userDTO = new UserDTO();
		System.out.println("userDTO @@@@@@@@@@@2: "+userDTO);
		List<AnimalDTO> animalDTOs = reserveService.getAniList(userDTO.getId());
		
		return animalDTOs;
	}
	
	@PostMapping("/insertReserv")
	@ResponseBody
	public void insertReserv(@RequestBody ReserveDTO reserveDTO) {
		System.out.println("=====S==========="+ "reserveDTO"+reserveDTO);
		reserveService.insertReserv(reserveDTO);
		
	}
	
	
	//공통 소스
	public static <T> List<Map<String, Object>> convertListToMap(Collection<T> target) {
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		for (T element : target) {
			Map<String,Object> resultMap = new HashMap<String,Object>();
			Field[] fieldList = element.getClass().getDeclaredFields();
			if (fieldList != null && fieldList.length > 0) {
				try {
					for (int i = 0; i < fieldList.length; i++) {
						String curInsName = fieldList[i].getName();
						Field field = element.getClass().getDeclaredField(curInsName);
						field.setAccessible(true);
						Object targetValue = field.get(element);
						resultMap.put(curInsName, targetValue);
					}
					resultList.add(resultMap);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return resultList;
	}
	
}
