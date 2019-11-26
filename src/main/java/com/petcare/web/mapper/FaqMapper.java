package com.petcare.web.mapper;

import java.util.List;
import com.petcare.web.domain.Faq;

public interface FaqMapper {
	List<Faq> faqList();
	Faq view(Faq faq);
	Faq modifyView(Faq faq);
	void insert(Faq faq);
	void update(Faq faq);
	void delete(Faq faq);
}
