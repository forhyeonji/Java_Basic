package org.hj.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.hj.model.AttachFileVO;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import net.coobird.thumbnailator.Thumbnailator;

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
	
	
	// 년/월/일 폴더 생성하는 메서드 선언
	private String getFolder() {
		
		// 현재날짜 추출 (Thu Aug 24 09:23:12 KST 2022)
		Date date = new Date();
		System.out.println("No Format="+date);
		// format()을 통해 우리가 원하는 양식으로 바꿀 수 있음
		// Thu Aug 24 09:23:12 KST 2022 -> 2022-08-24
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		// 현재날짜와 날짜형식을 연결
		String str=sdf.format(date); // 2022-08-24
		System.out.println("Format="+str);
		
		
		// 2022-08-24 -> 2022\08\24 로 변경
		return str.replace("-", "\\");
		
	}
	
	
	
	// 내가 올리고자하는 파일이 이미지 파일인지 아닌지 구분하는 메서드 선언
	//		반환타입  메소드명		  	타입   변수명
	private boolean checkImageType(File file) {
		// probeContentType(실제 파일경로) : 파일경로에 있는 파일타입을 알아내는 메서드
		
		try {
				String contentType = Files.probeContentType(file.toPath());
				System.out.println("contentType=" + contentType);
				
				// 파일타입이 image이면 true, 그 외는 false
				return contentType.startsWith("image");	// startsWith는 boolean 타입임

				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
		
			return false;
			
		}	
		
	
	
	
	@RequestMapping(value="/uploadAjaxAction", method=RequestMethod.POST)
	public ResponseEntity<ArrayList<AttachFileVO>> uploadAjaxPost(MultipartFile[] uploadFile) {
		
		// AttachFileVO 클래스 포함
		ArrayList<AttachFileVO> list = new ArrayList<>();
		
		// 폴더경로
		String uploadFolder="D:\\upload";
		
		// 서버 업로드 경로와 getFolder메서드의 날짜문자열을 이어서 하나의 폴더 생성
		File uploadPath = new File(uploadFolder, getFolder());
		
		// 폴더생성(D:\\upload\\현재날짜)
		if(uploadPath.exists()==false) {// uploadPath가 존재하지 않으면, 
		uploadPath.mkdirs();
		}
		
		
		// for(변수명:배열명)
		
				for(MultipartFile multipartFile : uploadFile) {
					
						// AttachFileVO 클래스의 새로운 주소를 반복적으로 생성하여
						// ArrayList에 저장
						AttachFileVO attachvo = new AttachFileVO();
					
					
						System.out.println(multipartFile.getOriginalFilename());
						System.out.println(multipartFile.getSize());
						
						// 실제 파일명(multipartFile.getOriginalFilename())
						// UUID 적용(UUID_multipartFile.getOriginalFilename());
						UUID uuid = UUID.randomUUID();
						System.out.println("UUID="+uuid.toString());
						
				
						// AttachFileVO의 uploadPath 변수에 저장()
						attachvo.setUploadPath(getFolder());
						
						// AttachFileVO의 fileName 변수에 저장()
						attachvo.setFileName(multipartFile.getOriginalFilename());
						
						// AttachFileVO의 uuid 변수에 저장()
						attachvo.setUuid(uuid.toString());
						
						// AttachFileVO의 image 변수에 저장()
						
						
						
						
						
						
						
						
						
						
						
						
						
						// 파일 저장
						// 실제 파일 
						//						어느 폴더(D:\\upload\\현재날짜)에,	어떤 파일이름으로 저장할건지(UUID.random_mainlogo_new.jpg)
						File saveFile = new File(uploadPath, uuid.toString()+"_"+multipartFile.getOriginalFilename());
				
				
				//						D:\\upload\\mainlogo_new.jpg 에 파일을 전송하는 메서드(transferTo)
				try {	// transferTo() 메서드에 문제가 있으면
								
					
					
							multipartFile.transferTo(saveFile); // 문제 없으면 서버로 원본파일 전송
							
							// 내가 서버에 올리고자 하는 파일이 이미지이면,
							if(checkImageType(saveFile)) {
								
								// AttachFileVO의 image 변수에 저장()
								attachvo.setImage(true);
								
								
								// 파일 생성
								FileOutputStream thumnail = new FileOutputStream(new File(uploadPath, "s_"+uuid.toString()+"_"+multipartFile.getOriginalFilename()));
			
								// 썸네일 형식의 파일생성
								Thumbnailator.createThumbnail(multipartFile.getInputStream(),thumnail,100,100);
								
								thumnail.close();
							} // checkImageType 메서드 끝
							
							// AttachFileVO에 저장된 데이터를 배열에 추가
							list.add(attachvo);
						
						} catch(Exception e) {	// 예외를 처리하라.
								
							System.out.println(e.getMessage());
							
						} //catch
			
				}// for문 끝
				
				return new ResponseEntity<>(list,HttpStatus.OK);

	} // uploadAjax 끝
	
	// 이미지 주소 생성
	@RequestMapping(value="/display", method=RequestMethod.GET)
	public ResponseEntity<byte[]> getFile(String fileName){
		
		File file = new File ("D:\\upload\\"+fileName);
		
		ResponseEntity<byte[]> result = null;
		
		HttpHeaders headers = new HttpHeaders();
		try {
			
			headers.add("Content-Type", Files.probeContentType(file.toPath()));
			result = new ResponseEntity<>(FileCopyUtils.copyToByteArray(file),
					headers, HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	} // getFile 끝
	
	
	// 다운로드 주소 생성
	@RequestMapping(value="/download", method=RequestMethod.GET)
	public ResponseEntity<Resource> downloadFile(String fileName){
		
		Resource resource = new FileSystemResource("D:\\upload\\"+fileName);
		
		// 다운로드 시 파일의 이름을 처리
		String resourceName = resource.getFilename(); 
		
		HttpHeaders headers = new HttpHeaders();
		
		try {
			
			// 다운로드 파일이름이 한글일 때, 깨지지 않게 하기 위한 설정
			headers.add("Content-Disposition", "attachment;filename="+new String (resourceName.getBytes("utf-8"),"ISO-8859-1"));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(resource, headers, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
