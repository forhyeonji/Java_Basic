package org.hj.controller;

import java.util.ArrayList;

import org.hj.model.ReplyVO;
import org.hj.model.SampleVO;
import org.hj.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReplyController {

	@Autowired
	ReplyService rs;
	
	
	// 댓글쓰기
	@RequestMapping(value="/replies/new", method=RequestMethod.POST)
	public ResponseEntity<String> replywrite(@RequestBody ReplyVO reply){
		
		// insert가 성공했으면 result 변수에 1 저장
		// insert가 실패했으면 result 변수에 0 저장
		int result = rs.rewrite(reply);   // Mapper에서 1또는 0의 값이 와서 저장
		
		System.out.println(reply);
		
		// result가 1이면 HttpStatus.OK
		// result가 0이면 HttpStatus.INTERNAL_SERVER_ERROR
		return result==1?new ResponseEntity<>("success", HttpStatus.OK)
						:new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}	
	
	// 댓글 목록 리스트
	@RequestMapping(value="/replies/{bno}", method=RequestMethod.GET)	
	public ResponseEntity<ArrayList<ReplyVO>> getList(@PathVariable int bno){
		System.out.println(bno);
		
		
		
		return new ResponseEntity<>(rs.list(bno), HttpStatus.OK);
	}
	
	
	
}
