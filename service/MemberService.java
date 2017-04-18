package com.lsn.web.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lsn.web.dao.MemberDao;
import com.lsn.web.entity.Member;

@Service
public class MemberService {

	@Resource(name="memberDaoImpl")
    private MemberDao memberDao;
     
    public void setMemberDao(MemberDao memberDao)
    {
       this.memberDao = memberDao;
    }
      
    public void add(Member member){
        memberDao.add(member);
    }
     
    public void delete(String id){
        memberDao.delete(id);
    }
     
    public Member get(String id)
    {
        return memberDao.get(id);
    }
}
