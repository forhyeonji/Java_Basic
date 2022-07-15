package inheritance;
// 부모클래스(조상클래스)
public class Tv {
	// 속성(변수)
	// 화면 크기
	int wide;
	// 채널
	int channel;
	// 볼륨
	int volum;
	
	// 기능(메서드)
	// 채널 up
	void channelUp() {channel++;}
	// 채널 down
	void channelDown() {channel--;}
	// 볼륨 up
	void volumUp() {volum++;}
	// 볼륨 down
	void volumDown() {volum--;}
	
}
