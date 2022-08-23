package org.hj.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	
	@RequestMapping(value="/uploadForm", method=RequestMethod.GET)
	public void uploadForm() {
		
	}

	
		
	@RequestMapping(value="/uploadFormAction", method=RequestMethod.POST)
	public void uploadFormPost(MultipartFile[] uploadFile) {
		
		// 폴더 경로
		String uploadFolder="D:\\upload";
		
		
		
		// for(변수명:배열명)
		
		for(MultipartFile multipartFile : uploadFile) {
			
		System.out.println(multipartFile.getOriginalFilename());
		System.out.println(multipartFile.getSize());
		
		
		// 파일 저장
		//						어느 폴더(D:\\upload)에,	어떤 파일이름으로 저장할건지(mainlogo_new.jpg)
		File saveFile = new File(uploadFolder, multipartFile.getOriginalFilename());
		
		
				//						D:\\upload\\mainlogo_new.jpg 에 파일을 전송하는 메서드(transferTo)
				try {	// transferTo() 메서드에 문제가 있으면
						
					multipartFile.transferTo(saveFile);
				
				} catch(Exception e) {	// 예외를 처리하라.
						
					System.out.println(e.getMessage());
					
				} //catch
	
		}// for

		
	}
	
	
	
	@RequestMapping(value="/uploadAjax", method=RequestMethod.GET)
	public void uploadAjax() {
		
	}
	
	
	@RequestMapping(value="/uploadAjaxAction", method=RequestMethod.POST)
	public void uploadAjaxPost(MultipartFile[] uploadFile) {
		
		//폴더경로
		String uploadFolder="D:\\upload";
		
		// for(변수명:배열명)
		
				for(MultipartFile multipartFile : uploadFile) {
					
				System.out.println(multipartFile.getOriginalFilename());
				System.out.println(multipartFile.getSize());
				
				
				// 파일 저장
				//						어느 폴더(D:\\upload)에,	어떤 파일이름으로 저장할건지(mainlogo_new.jpg)
				File saveFile = new File(uploadFolder, multipartFile.getOriginalFilename());
				
				
						//						D:\\upload\\mainlogo_new.jpg 에 파일을 전송하는 메서드(transferTo)
						try {	// transferTo() 메서드에 문제가 있으면
								
							multipartFile.transferTo(saveFile);
						
						} catch(Exception e) {	// 예외를 처리하라.
								
							System.out.println(e.getMessage());
							
						} //catch
			
				}// for

		
		
	}
	
	
	
	
}




