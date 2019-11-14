package com.petcare.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.petcare.web.domain.Faq;
import com.petcare.web.service.FaqService;

@Controller
public class FaqController {
	
	@Autowired
	private FaqService faqService;
	
	//글 목록
	@GetMapping("/faqList")
	public String FaqList(Model model) {
		List<Faq> faqList = faqService.faqList();
		model.addAttribute("faqList", faqList);
		
		return "faqList";
	}
	
	//글쓰기 페이지
	@GetMapping("/faqForm")
	public String FaqForm(Model model) {
		model.addAttribute("faq", new Faq());
		return "faqForm";
	}
	
	//글쓰기
	@PostMapping("/faqInset")
	public String Insert(@ModelAttribute Faq faq){
		faqService.insert(faq);
		return "redirect:faqList";
	}
	
	//글 보기 페이지
	@PostMapping("/faqView")
	public String View(@ModelAttribute Faq faq, HttpServletRequest request, Model model){
		int bno = Integer.parseInt(request.getParameter("bno"));
		faq.setBno(bno);
		
		Faq FaqView = faqService.view(faq);
		model.addAttribute("view", FaqView);
		
		return "faqView";
	}
	
	//글 삭제 페이지
	@PostMapping("/faqDelete")
	public String Delete(@ModelAttribute Faq faq, Model model){
		faqService.delete(faq);
		return "redirect:faqList";
		
	}

}
