package kr.co.android.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.android.domain.Membership;

@Repository
public class MembershipDAO {
	@Autowired
	private SqlSession sqlSession;
	
	
	//로그인 처리 메소드
	public Membership login(Membership membership) {
		return sqlSession.selectOne("membership.listMembership",membership); // membership 부분은 서비스에서 준다 
	}
}
