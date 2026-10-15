package com.example.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.entity.Member;
import com.example.library.repository.MemberRepo;

@Service
public class MemberService {
	
	@Autowired
	MemberRepo mr;
	
	//addMember
	public void addMember(Member m)
	{
		mr.save(m);
	}
	
	
	//getMemberById
	public Member getMemberById(int id)
	{
		return mr.findById(id).get();
	}
	
	//deleteMemberById
	public void deleteMemberById(int id)
	{
		mr.deleteById(id);
		
	}
	
	//deleteAllMember
	public void deleteAllMember()
	{
		mr.deleteAll();
	}

}
