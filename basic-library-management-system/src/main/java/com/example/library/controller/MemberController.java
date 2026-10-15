package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.Member;
import com.example.library.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	MemberService ms;

	@PostMapping("member")
	String addMember(@RequestBody Member m) {
		ms.addMember(m);
		return "Member Added";
	}

	@GetMapping("member/{id}")
	Member getMemberById(@PathVariable int id) {
		return ms.getMemberById(id);
	}

	@DeleteMapping("member/{id}")
	String deleteMemberById(@PathVariable int id) {
		ms.deleteMemberById(id);
		return "Member Deleted";
	}

	@DeleteMapping("member")
	String deleteAllMember() {
		ms.deleteAllMember();
		return "All member deleted";
	}

}
