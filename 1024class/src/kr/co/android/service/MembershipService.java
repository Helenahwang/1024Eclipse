package kr.co.android.service;

import javax.servlet.http.HttpServletRequest;

import kr.co.android.domain.Membership;

public interface MembershipService {
	
	//로그인 처리를 위한 메소드
	public Membership login(HttpServletRequest request);
	
}
