package org.hj.model;

public class AttachFileVO {

	// 1. 파일이 저장되어 있는 경로
	private String uploadPath;
	// 2. 업로드된 파일명
	private String fileName;
	// 3. uuid 정보
	private String uuid;
	// 4. 업로드된 파일이 이미지 파일인지 아닌지 대한 정보
	private boolean image;
	// 외래키 역할의 bno
	private int bno;
	
	
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getUploadPath() {
		return uploadPath;
	}
	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public boolean isImage() {
		return image;
	}
	public void setImage(boolean image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "AttachFileVO [uploadPath=" + uploadPath + ", fileName=" + fileName + ", uuid=" + uuid + ", image="
				+ image + ", bno=" + bno + "]";
	}
	
	
	
}
