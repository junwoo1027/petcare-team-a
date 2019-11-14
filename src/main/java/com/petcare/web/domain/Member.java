package com.petcare.web.domain;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Member {
	private Long uId;
	
	@NonNull
	private String username;
	@NonNull
	private String password;

}
