
public class Ex04_Operation {

	public static void main(String[] args) {
		
		int result = 100/100;
		System.out.println(result);
		
		result = 13/2; //몫
		System.out.println(result);

		//나머지를 구하는 연산자 ( % )
		result = 13%2;
		System.out.println(result);
		
		//증가감 연산자 (증가 , 감소 : 1씩 증가 , 1씩 감소)
		//++ , --
		int i = 10;
		++i; //전치증가
		System.out.println("전치 : " + i);
		
		i++; //후치증가
		System.out.println("후치 :" + i);
		//위 단독 사용 변수는 전치 , 후치 증가 ....
		
		//POINT (연산자 결합 : 전치 , 후치)
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println("전치 result2 : " + result2 + " j2 : " + j2);
		
		result2 = i2 + j2++;
		System.out.println("후치 result2 : " + result2 + " j2 : " + j2);
		
		//전치 후치는 단독으로는 의미 x , 단독이 아닐때는 전치가 붙은 값은 먼저 1증가후 나머지 연산
		// 후치가 붙은 값은 나머지 연산을 먼저 하고 나서 나중에 1증가
		
		
		
		byte b = 100;
		byte c = 1;
		
//		byte d = (byte)b + c;
		//byte d = (byte)b + c; 데이터 손실
		int d = b + c; //
		System.out.println();
		
		
		//Today Point
		//자바의 [연산] 규칙
		//정수의 모든 연산은 내부적으로 컴파일러가 [int] 타입으로 변환 처리
		
		//byte + short => 컴파일러가 >>  int +int
		//char + char  => 컴파일러가 >> int + int
		//[정수연산]에서 처리시 [int] 보다 [작은 타입]은 [int로 변환]
		//long 제외
		//byte, char, short 연산시 >> int 변환 연산
		
		//byte + short -> int + int
		//char + int -> int + int
		//int + long -> long + long 
		
		//정수 + 실수 >> 타입 크기와 상관없이 >> 실수 승자
		long ln = 100000000000L;
		float f1 = 1.2f;
		long lnresult = (long)f1 + ln;
		System.out.println("lnresult : " + lnresult);
		//결과는 나오지만 손실 발생
		
		float num2 = 10.45f;
		int num3 = 20;
		float result5 = num2 + num3;
		System.out.println("result5 :" + result5);
		//받는 쪽을 큰 타입으로 설정하니 손실이 발생하지 않아요
		
		//아스키 코드표 (char 정수 호환 : 10진수)
		char c2 = '!';
		char c3 = '!';
		
		//c2 + c3
		int result6 = c2 + c3;
		System.out.println("result6 : " + result6); //십진수 값으로 계산 33+33
		System.out.println((char)result6); // 아스키코드 66은 B
		
		
		//제어문 (중소기업 시험문제) 구구단 출력 > 별찍기 > 삼각형 > 연습
		
		int sum = 0;
		for(int j = 1; j <= 100; j++) {
			//System.out.println("j: " + j);
			//같은 것 반복 ,,,, 여러번 나오면 ,,,, 
			//sum = sum + j;
			//+= , -=
			//sum+=j; // sum = sum+j
			if(j%2 == 0) { //1~100 짝수의 합
				sum+=j;
			}
		}
		System.out.println("sum : " + sum);
		
		
		// == 연산자 (값을 비교하는 연산자)
		if(10 == 10.0f) { // ==는 타입을 비교하지 않는다. 값을 비교
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		// ! 부정 연산자 (부정적인 질문...)
		if ('A' != 65) { //같지 않니
			System.out.println("어 같지 않아");
		} else {
			System.out.println("어 같은데");
		}
		//Today Point
		//연산자 (제어문 비슷 (if))
		//삼항연산자
		int p = 10;
		int k = -10;
		int result8 =(p == k)? p : k ;
		System.out.println("result8 : " + result8);
		
		if (p == k ) {
			result8 = p;
		} else {
			result8 = k;
		}
		
		//진리표
		//논리
		// 0	false
		// 1	true
		
		// 0 , 1 조합 (순서가 다름을 인정)
		
		/*
		 		 OR		 AND	
		 0  0	 0		  0	
		 0  1	 1		  0
		 1  0	 1		  0
		 1  1	 1		  1
		 
		 Oracle (소프트웨어 : 데이터 저장) : CRUD (insert, select, update, delete)
		 언어 : SQL (자연어)
		 
		 
		 연산자 (비트)
		 
		 | or 연산자
		 & and 연산자
		 
		 연산자 (논리)
		 || 논리연산(or)
		 && 논리연산(and)
		 
		 
		 
		 */
		
		int x = 3;
		int y = 5;
		System.out.println("x | y : " + (x | y));
		System.out.println("x & y : " + (x & y));
		/*
		 3 십진수
		 5 십진수
		 -> 3 -> 2진수
		 -> 5 -> 2진수
		 
		 128 64 32 16 8 4 2 1 
		 			0 0 0 1 1 >> 3의 2진수 : 0011
		 			  0	1 0 1 >> 5의 2진수 : 0101
		 			  1	0 0 0 >> 8의 2진수 : 1000
		 			  즉. 8의 2진수는 2로 8을 만들수 있으니 8에 1. / 4 2 1 은 8보다 작아서 못만드니 0	
		 0011			  
		 0101
	OR   0111  > 4+2+1 >> 십진수 >> 7
	AND	 0001  > 1	   >> 십진수 >> 1
	
	Today Point ( && (and)	, || (or))
	if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1 ...... 조건 10개) {실행문}else{}
	if(10 > 0 || -1 > 1 || 100 > 2 || 1 > -1 ...... 조건 10개) {실행문}else{}
	
		*/
		
		int data = 80;
		switch(data) {
			case 100 :	System.out.println("100 입니다");
				break;	
			case 90  :	System.out.println("90 입니다");
				break;
			case 80	 :	System.out.println("80 입니다");
				break;
			default : 	System.out.println("default 입니다");
		}
		
		//switch 에서 break 는 문법적으로 강제하지는 않는다 (선택적으로)
		int month = 12;
		String res=""; //빈무자열로 초기화
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:	res = "31";
				break;
			case 4:
			case 6:
			case 9:
			case 11:	res = "30";
				break;
			case 2:		res = "29";
				break;
			default : res = "월 데이터가 아닙니다";
		}
		System.out.println(month + " 달의 일수는 " + res);
		
		System.out.println("Math.random()" + Math.random());
		//0.3021663769076396
		//같은 값이 나올 수 있다
		System.out.println("Math.random()*10" + (Math.random()*10));
		
		System.out.println("(int)Math.random()*10 + 1 " + ((int)(Math.random()*10)+1)); //0~9
		
//		int resultNum = (int)(Math.random()*900+100);
//		if(resultNum == 1000) {
//			System.out.println("경품 : TV, NoteBook, 냉장고 , 한우세트 , 휴지");
//		} else if (resultNum == 900) {
//			System.out.println("경품 : NoteBook, 냉장고 , 한우세트 , 휴지");
//		} else if(resultNum == 800) {
//			System.out.println("경품 : 냉장고 , 한우세트 , 휴지");
//		} else if(resultNum == 700) {
//			System.out.println("경품 :  한우세트 , 휴지");
//		  else if() 
//		}
//		
		int jumsu = ((int)(Math.random()* 10) +1)*100;
		System.out.println("추첨번호 : " + jumsu);
		String msg=""; // 초기화
		msg+= "고객님의 점수는 :" + jumsu + " 이고 상품은 : ";
		switch(jumsu) {
		case 1000:msg+="Tv";
		case 900:msg+="NoteBook";
		case 800:msg+="냉장고";
		case 700:msg+="한우세트";
		case 600:msg+="휴지";
			break;
		default : msg +="칫솔";
		}
		System.out.println(msg);
		
		
		

	}
	
	//난수 (랜덤값 : 임의의 추출값)
	//https://docs.oracle.com/javase/8/docs/api/index.html
	//구조 (의미있는 폴더 구조 : package)
	//어떤 자원을 사용하려면 폴더를 열어서 : import 
	//ex) java.lang.System >> import java.lang.System 사용가능
	//당신이 많이 쓰는 자원은 java.lang 폴더 있어요
	//눈에 안보이지만 페이지 상단에 import java.lang.* (* = 모든것)
	
	//Math 클래스 (수학 관련된 여러가지 자원 : static ) >> new 하지 않고도 사용 가능
	//Math.Random()
	//a positive sign, greater than or equal to 0.0 and less than 1.0.
	//결과 : double 실수 return 0.0 <= random < 1.0
	
	//if 문은 조건없이 boolean형, switch문은 정수형(byte, short, int)과 [문자형(char)], [문자열(String)]
	//long, boolean, float, double형 사용 불가
	
	
	

}
