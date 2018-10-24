package kr.co.android.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.android.dao.MembershipDAO;
import kr.co.android.domain.Membership;

@Service
public class MembershipServiceImpl implements MembershipService {
	@Autowired
	private MembershipDAO membershipDao;

	@Override
	public Membership login(HttpServletRequest request) {
		//파라미터 읽기
		String id = request.getParameter("logid");
		String pw = request.getParameter("logpw");
		
		
		//필요한 로직 수행 

		//DAO 파라미터 만들고 
		
		Membership membership1 = new Membership();
		membership1.setLogid(id);
		membership1.setLogpw(pw);
	
		
		//DAO 메소드 호출
		Membership m = membershipDao.login(membership1);
		
		
		//리턴할 결과 만들기
		return m; 
		
		
	}

}
