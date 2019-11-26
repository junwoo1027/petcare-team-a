package com.petcare.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petcare.web.domain.Faq;
import com.petcare.web.mapper.FaqMapper;

@Service
public class FaqService {
	
	@Autowired
	private FaqMapper faqMapper;
	
	public List<Faq> faqList(){
		return faqMapper.faqList();
	}
	
	public Faq view(Faq faq) {
		return faqMapper.view(faq);
	}
	
	public Faq modifyView(Faq faq) {
		return faqMapper.modifyView(faq);
	}
	
	public void insert(Faq faq) {
		faqMapper.insert(faq);
	}
	
	public void update(Faq faq) {
		faqMapper.update(faq);
	}
	
	public void delete(Faq faq) {
		faqMapper.delete(faq);
	}
}
