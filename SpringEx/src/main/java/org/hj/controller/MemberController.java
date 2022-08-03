
package org.hj.controller;

import org.hj.model.LoginVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	// 회원가입
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String member () {
		return "member/memberin";
	}
	
	// 회원가입서버
	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public String memberPost (LoginVO membervo) {
		System.out.println(membervo);
		return "board/list";
	}
	
	
	
	
	// 로그인
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login () {
		return "member/login";
	}
	
	// 로그인 서버
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost (LoginVO loginvo) {
		System.out.println(loginvo);

		return "board/list";
	}
	
	// 회원관리페이지
	// 회원정보수정 및 삭제
	
}
