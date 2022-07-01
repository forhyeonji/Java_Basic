/**
 * 배열
 */
/*
var a=[10,20,30];
var sum=0;
for(var i=0;i<3;i++){
	sum+=a[i];  //sum=sum+a[i];
}
alert(sum);

length
*/
//아래 데이터는 A학교의 학생들의 국어점수 성적입니다.
/*	a : 52
	b : 73
	c : 100
	d : 32
	e : 57
	f : 100
	g : 31
	h : 20
위 학생의 총점과 평균을 구하세요.
*/
	
var a=[52,73,100,32,57,100,31,20];
var sum =0;
for(var i=0;i<a.length;i++){
	sum+=a[i];
}
alert("총점 : "+sum);

alert("평균 : "+ sum/a.length);





var b=[50,70,100,33,59,100,33,29];
var sum =0;
for(var i=0;i<b.length;i++){
	sum+=b[i];
}
alert("총점 : "+sum);

alert("평균 : "+ sum/b.length);




var c=[72,53,89,84,15,90,56,75];
var sum =0;
for(var i=0;i<c.length;i++){
	sum+=c[i];
}
alert("총점 : "+sum);

alert("평균 : "+ sum/c.length);
