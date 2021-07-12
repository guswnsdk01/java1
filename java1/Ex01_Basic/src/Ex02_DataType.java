/*
1. 자바가 제공하는 기본타입(시스템 타입) : 자료형 >> 8가지 
2. 8가지 기본타입 : 값을 저장
3. 숫자 > 정수 (음의정수 , 0 , 양의정수)   >> byte (1byte) (-128 ~ 127)
										   >> char (한문자를 표현) >> 'A'   '가' , 'AB'(x)
											>>> 영문자, 특수문자, 공백 : 1byte
											>>> 한글 1자 : 2byte
											>>> 합의 char(2byte) 한글자(한문자) 
											>>> 국가간 합의 (unicode) : 2,3Byte >>> 아스키 코드표
											>>> 문자 A -> 십진수 65 	a -> 십진수 97
										  >>short (c언어 호환성 2byte)
										  >>int (4byte : -21억 ~ 21억) *** java 정수 연산 기본 타입 ***
										  
		> 실수 							  >> float (4byte)
										  >> double (8byte) : 정밀도 (표현 범위가 크다)	***java 연산의 기본 타입***
		
   논리 > 참,거짓(true,false)			  >>boolean (프로그램의 논리적인 흐름제어) 판단의 조건

***문자열 표현 (" ") >> "홍길동" , "HELLO"
String name = "홍길동" >> String 은 클래스(참조타입)

 그럼에도 불구하고 
 별도의 이야기를 하기 전까지 String 9가지 기본 타입
 int , double 과 동일하게 사용하세요 (그렇지 않으면 삶이 힘들어짐)

자바는 크게
1. 값 타입					: 8가지 기본타입 : int i = 100;		+ String
2. 주소 타입(객체의 주소)	: 클래스 , 배열 등등 .... 변수에 값이 저장되는 것이 아니고 주소값이 저장
							  되는 참조 타입

*/

//참조타입	(클래스 == 설계도 == 타입(큰타입))
class Car{
	String color;
	int window;
}


public class Ex02_DataType {

	public static void main(String[] args) {
		
		int age = 100;
		System.out.println("age : " + age); //변수가 값을 가지고 있다
		
		Car c = new Car();
		c.color = "blue";
		c.window = 2;
		System.out.println("c.window 개수 : " + c.window);
		System.out.println("c 라는 Car 타입 변수 : " + c); //Car@53bd815b
		
		//변수 
		//선언과 초기화 
		//선언과 초기화 분리
		int i = 10;
		
		int j; //선언
		j = 100; //초기화
		System.out.println(j);
		
		int k;
		k= j; // POINT (값 할당)
		System.out.println("k :" + k);
		k = 300;
		System.out.println("k :" + k);
		System.out.println("j :" + j);
		
//		int p, g , q;
//		p = 1;
//		g = 2;
//		q = 3;
		//같은 타입의 변수 3개를 만드시고 값을 넣으세요
		//int p , g , q;
		//int[] arr = new int[3] 정답
		
		//int (-21 ~21)
		//TODAY POINT
		//literal >> 있는 그대로 >> 소스 코드에서 개발자가 직접 입력한 값
		//정수 리터럴 [***** 정수 기본값 (default) int 범위]
		int p = 1000000;
		//long l = 10000000000; (x) 
		//입력하는 정수값은 기본적인 그릇의 크기가 4byte .... 
		long l = 10000000000L; //강제로 그릇의 크기를 8byte로 늘림.
		
		//int p2 = 10000L; //작은 그릇에 큰 그릇을 넣을 수 없다.
		int p2 = (int) 10000L;
		//문제가 없다 , 문제가 있다
		System.out.println(p2);
		
		int p3 = (int) 1000000000000L; // 버려지는 값이 발생 .... 
		System.out.println(p3);
		
		long p4 = 1000000000000L;  
		System.out.println(p4);
		
		//정수 리터럴의 기본 타입은 int POINT
		
		
		//char : 2Byte : 한문자를 저장할 수 있는 타입 : 내부적으로 정수값을 가지고 있다
		//한문자 : 'A' , '가' : char ch = 'A'; char ch2 = '가'
		//문자열 : "A" , "홍길동" , "ABC" : String str = "홍길동";
		
		char single = '가';
		System.out.println(single);
		char ch = 'A';
		System.out.println(ch);
		//char는 문자를 저장하지만 내부적으로는 정수값을 가지고 있다
		int intch = 'A';	//내부적으로 자동 형변환
		System.out.println("intch :" + intch);
		System.out.println("intch : " + (char)intch);
		
		//char 와 정수(int) 서로 호환가능
		//문자 -> 숫자 , 숫자(char) -> 문자
		
		char ch2 = 'a';
		//정수값을 출력하세요
		int intch2 = (int)ch2; //암시적인데 강제로 변환작업
		System.out.println(intch2);
		
		int intch3 = 65;
		//char ch3 = intch3;
		// why ? 
		//속지말자 : 값을 보지말고 값이 가지는 타입을 보자
		//강제적 형변환 (명시적)
		
		char ch3 = (char)intch3;
		System.out.println("ch3 : " + ch3);
		
		//발생할 수 있는 문제점
		//key point : 65라는 숫자가 char 타입에 속하는 경우 (데이터 손실 없이)
		//int intch3 = 99999999;
		//큰것을 작은 것에 강제 (데이터 손실)
		
		int intch4 = ch3; //형변환 자동화 컴파일러 
		//내부적으로 컴파일러는 
		//int intch4 = (int)ch3; 코드 재생산 실행
		
		
		/*
		 Today Point
		 1. 할당에서 변수가 가지고 있는 값을 보지말고 변수의 타입을 보자
		 1.1 정수 리터럴의 기본 타입은 int
		 2. 변수가 가지는 타입을 확인하자
		 3. 큰 타입에는 작은 타입을 넣을 수 있다 (자동 형변환)
		 4. 작은 타입에는 큰 타입을 넣을 수 없다 (하고 싶다면 : 강제적 형변환)
		 
		 	ex)
		 	char <-- int  	>>>>>> char <-- (char)int 데이터 손실은 책임은 여러분이
		 	int	 <-- char   >>>>>> 컴파일러가  int  <---  (int)char 작업 ...
		 	 
		 */
//		 int intvalue = 1015569;
//		 byte bytevalue = (byte)intvalue;
//		 System.out.println(bytevalue); //원하지 않는 쓰레기 값 ..... 고민 ^^
		
		 int intvalue = 10;
		 byte bytevalue = (byte)intvalue;
		 System.out.println(bytevalue); //데이터 손실 잘 쓰고 있죠..... 언젠가는 ....
		 
		 //String (문자열)
		 String name = "hello world";
		 System.out.println(name);
		
		 String name2 = name + "방가방가";
		 System.out.println(name2); //문자열 + 문자열 (결합)
		 
		 //자바 : + (산술 , 결합)
		 //Oracle :  + 산술	 , || 결합연산자 >> '안녕' || '방가' >> '안녕방가'
		 
		 //Tip) java 에서 특수문자
		 //이스케이프 문자 >> 특정한 문자 앞에 \
		 char sing = '\'';
		 //역슬러시 (\) 결합하면 문자로 인정
		 System.out.println(sing);
		 
		 //홍"길"동 라는 String 변수에 담아서 출력
		 String hong = "홍\"길\"동";
		 System.out.println(hong);
		 
		 String str3 = "1000";
		 String str4 = "10";
		 String result = str3 + str4;
		 System.out.println(result); //100010
		 
		 //형변환 ( + 산술 , 결합 )
		 System.out.println("100"+100);
		 System.out.println(100+"100");
		 System.out.println(100+100+"100");
		 System.out.println(100+(100+"100"));
		 System.out.println(100+"100"+100);
		 
		 //C:\temp  문자열을 String 변수에 넣고 출력하세요
		 String path = "C:\\temp";
		 System.out.println("path : " + path);
		 //	\t >> tab	\n	>> new line
		 String path2 = "\ta\ta\na";
		 System.out.println(path2);
		 
		 //실수형 (부동 소수점)
		 //float (4byte)
		 //double(8byte)   ***실수 리터럴의 기본 타입 : double ***
//		 float f = 3.14; //3.14 리터럴은 default double
//		 float f = 3.14F; //1. 접미사 (f , F) float
		 float f = (float)3.14;
		 System.out.println("f : " + f);
		 
		 float f2 = 1.123456789f;
		 System.out.println("f2 : " + f2);
		 //f2 : 1.1234568
		 //소수이하 대략 7자리 
		 //default 반올림
		 
		 double d = 1.123456789123456789;
		 System.out.println("d :" + d);
		 //대략 소수이하 16자리
		 //default 반올림
		 
		 //float 추후에 2진 , ....
		 
		 System.out.println((byte)129);
		 // byte > 8bit > -128 ~ 127 
		 // overflow 시 순환 ...
		 
		 byte by = (byte)129;
		 System.out.println("순환 : overflow : " + by);
		 
		 double d2 = 100; //암시적 형변환 (double)100
		 System.out.println(d2); //100.0
		 
		 //Quiz
		 double d3 = 100;
		 int i5 = 100;
		 double result2 = d3 + i5;
		 System.out.println(result2);
		 
		 //Today Point
		 //작은 타입 + 큰 타입  >> 큰 타입
		 //명시적 형변환 고민 (casting) 손실분 고민
		 
		 int i6 = 100;
		 byte b2 = (byte)i6; //명시적 형변환 (손실)
		 System.out.println(b2);
		 
		int Npoint = (int)(Math.random()*10+1)*100;
		System.out.println("추첨번호 :" + Npoint);
		String n = "";
		n += "점수는 " + Npoint + "이고 경품은 : ";
		switch(Npoint) {
		  case 1000:n+="TV " ;
		  case 900:n+="NoteBook " ;
		  case 800:n+="냉장고 ";
		  case 700:n+="한우 ";
		  case 600:n+="휴지 ";
		  break;
		  default : n+="칫솔";
		  
		}
		System.out.println(n);
		 
		 
	}

}
