package com.petcare.web.domain;

import java.sql.Timestamp;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Faq {
	private int bno;
	
	@NonNull
	private String title;
	@NonNull
	private String content;
	@NonNull
	private String username;
	private Timestamp regdate;
}