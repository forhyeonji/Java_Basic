package org.hj.service;

import java.util.ArrayList;

import org.hj.mapper.BoardAttachMapper;
import org.hj.mapper.BoardMapper;
import org.hj.model.AttachFileVO;
import org.hj.model.BoardVO;
import org.hj.model.CriteriaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

	@Service
	public class BoardServiceImpl implements BoardService {
		
		@Autowired
		BoardMapper bm;
		
		@Autowired
		BoardAttachMapper bam;
		
		
		// BoardService 에서 설계되어진 write 추상메서드를 구현
		public void write(BoardVO board) {
			// BoardMapper에 있는 write메서드를 호출
			// 메서드의 매개변수를 통해 BoardVO 값을
			// BoardMapper의 write 메서드로 전달
			bm.write(board);
			
			board.getAttach().forEach(attach->{
				
			// AttachFileVOdml bno에 board의 bno를 저장해라 
				attach.setBno(board.getBno());
				
				bam.insert(attach);
			});
			
			
		}
		
	
		// BoardService에서 설계되어진 list추상메서드를 구현
		public ArrayList<BoardVO> list(CriteriaVO cri) {
			System.out.println(cri);
			return bm.list(cri);
		}
	
		
		@Transactional
		public BoardVO detail(BoardVO board) {
			// 상세페이지 조회 할 때
			// 조회수+1 업데이트 해라
			bm.cntup(board);
			return bm.detail(board);
		}
		
		
	
		
		// BoardService에서 설계되어진 modify 추상메서드를 구현
		public void modify(BoardVO board) {
			bm.modify(board);
		}
		
		
		// BoardService에서 설계되어진 remove 추상메서드를 구현
		public void remove(BoardVO board) {
			bm.remove(board);
		}
		
		
		// BoardService에서 설계되어진 total 추상메서드를 구현
		public int total(CriteriaVO cri) {
			return bm.total(cri);
		}
		
		
		// 첨부파일 조회 구현
		public ArrayList<AttachFileVO> attachlist (int bno){
			return bam.attachlist(bno);
		}
		
	
}
