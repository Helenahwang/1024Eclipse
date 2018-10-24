package kr.co.android;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.android.domain.Membership;
import kr.co.android.service.MembershipService;

@RestController
public class MembershipController {
	
	@Autowired
	private MembershipService membershipService;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public Map<String, String> login(HttpServletRequest request) {
		
		Map <String, String> map = new HashMap<String, String>();
		
		//Service 메소드 호출
		Membership membership = membershipService.login(request);
		
		
		if(membership == null){//로그인 실패
			map.put("id", "null");
			
		}else { // 로그인 성공
			map.put("id", membership.getLogid());
			map.put("nickname", membership.getLognick());
		}
		
		return map;
	}

}
