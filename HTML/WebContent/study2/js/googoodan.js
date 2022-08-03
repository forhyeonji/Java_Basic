/**
 * 
 */

/*
	for(i=1; i<=3; i++){
		
			for(j=1; j<=9; j++){
				var sum=i*j;
				document.write("<br>");
				document.write(i+"x"+j+"="+sum);
				
			}
	}
*/
/*
for(j=1; j<=9; j++){
	for(i=1; i<=3; i++){
		var sum=i*j
		document.write(" "+i+"x"+j+"="+sum)
	}
	
	document.write("<br>")
	
}
document.write("<br>")
for(j=1; j<=9; j++){
	for(i=4; i<=6; i++){
		var sum=i*j
		document.write(" "+i+"x"+j+"="+sum)
	}
	
	document.write("<br>")
	
}
document.write("<br>")
for(j=1; j<=9; j++){
	for(i=7; i<=9; i++){
		var sum=i*j
		document.write(" "+i+"x"+j+"="+sum)
	}
	
	document.write("<br>")
	
}
*/


//============
	
	
for (k=0; k<10; k+=3){
	for(j=1; j<=9; j++){
		for (i=1; i<4; i++){
			document.write(i+k + 'x' + j + '=' + (i+k)*j + '&nbsp');
		}
		document.write('<br>');
	}
	document.write('<br>');
}
		
		
		