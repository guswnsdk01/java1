import kr.or.bit.Emp;
// 라인 주석
/*
 	블럭 주석 (해석되지 않는 자원)
	만든날짜 : 2021 7 
 	만든이 : 홍길동
 	클래스 사용 방법 :
 	
 	public class Ex01	>> Ex01 클래스	>> 설계도	>> 데이터 타입
 	
 	클래스 == 설계도 == 타입(여러개의 작은 타입을 큰 타입) 이다
 	
 	종류 :
 	1. class Test { }	>> 독자적인 실행이 불가능	>> 다른 클래스 도와주는 클래스	>> main() 없다	>> lib
 	2. class Test { public static void main(String[] args){} }	>> 독립적인 실행 가능 클래스
 	2.1 static void main(String[] args)	 >> main 이라는 이름을 가지고 함수. static	>>
 		>> 프로그램 시작점 , 진입점	 >> 실행 가능 하다	 >> 약속

 	Tip)
 	C#) static void Main(){} 
 	--한달 동안 ... 서점가서 C# 70% 이해간다..
 	
 	변수 : variable
 	데이터(자료) 담을 수 있는 공간의 이름
 	변수는 공간의 크기를 갖고 있어야함.(데이터 타입(자료형))
 	데이터 타입  변수명	>> int i = 100; 
 	
 	변수 선언되는 위치 (scope : 유효범위)
 	1. instance variable : 객체변수	 >> class Person{ int age; }
 	2. local variable : 지역변수 (지역 : 함수 내부)  >> class Person{ void run(){ int speen }  }
 	3. 함수안에 제어블럭(if , for) 안에 있는 변수 (블럭변수)  >>
 	class Person { void run(){ for(int i = 0...} }
 	4. static variable : 공유자원 (객체간)
 	
 	개발자 입장에서 : 3년 개발 이직 .... 개발해 놓은 코드는 수정해서 처리 ... : 유지보수 
 */


//클래스 == 설계도 == 타입(사용자 정의 타입)

class Apt{		// 독자적인 실행이 불가능
	int iv = 100;	
	//객체변수 (instance variable)
	//초기화 (변수에 처음으로 값을 넣는 행위)
	//객체변수 (내부적으로 default (기본값) 이 설정되있음)
	int window; //기본값(default) >> int의 기본값은 0
	
	//초기화 : 변수가 처음으로 값을 갖는 것 (할당을 통해서)
	//질문 : why window변수는 초기화를 하지않아도 사용가능할까?
	//설계자의 의도 : 당신이 만드는 아파트마다 창문의 개수는 당신이 원하는 대로...
	//창문의 개수는 다를수 있다.
	
	Apt() { 
		//함수 (생성자 함수 : 특수한 목적의 ... : 함수의 이름이 클래스 이름과 동일)
		//아파트가 지어질때 제일 먼저 실행되는 기능
		//객체가 생성될때 자동으로 호출되는 함수 >> 객체 생성과 동시에 호출되는 함수
		//default constructor
		
	}
	
	Apt(int data){	//함수 오버로딩 (overloading) : 하나의 이름으로 여러가지 기능을 수행
		this.window = data;
	}
	
	void write() { //기능 행위(method)
				   //함수 (호출하지 않으면 실행이 안된다) call 하면 실행
		int num=111;   //local variable(지역변수) 함수가 끝나면 사라진다.
		System.out.println(num); //지역변수는 반드시 초기화를 통해 사용할수 있다.
		//The local variable num may not have been initialized
		//당신이 만약 지역 변수를 사용하고 싶다면 반드시 사용전에 초기화를 해라
		//default는 정해져있는 기본값. 초기화는 변수에 값을 최초로 정하는 것.
	}
	
}

class Car2{
	int window=2;
	
	void move() {
		System.out.println("gogo");
	}
}




public class Ex01 {		//독자적인 실행 가능

	public static void main(String[] args) {
//		Test test = new Test();		// 설계도 (new 연산자) >> 구체화(땅위에 아파트를 짓는다) >> 프로그램 (메모리 통해서 구현)
//		test.iv = 100;
//		System.out.println(test.iv);
		
		int i = 100; // local variable (지역변수)
		System.out.println("i 지역변수 : " + i);	//ctrl + F11 (실행 : 컴파일(javac) >> 실행(java)
		
		Apt apt = new Apt(); //집을 짓는 행위 (메모리에 올리는 행위)
		apt.window = 2;
		Apt apt2 = new Apt();
		apt.window = 6;
		Apt apt3 = new Apt();
		System.out.println(apt3.window);
		
		Apt apt4= new Apt(100); //창문 100개 초기화 통해서
		System.out.println(apt4.window);
		
		Apt apt5 = new Apt();
		apt5.write();
		
		// 사원을 1명 만들기
		Emp emp; //Emp (타입) emp (변수)
		emp = new Emp(); //
		System.out.println(emp);
		
		Emp emp2 = emp;
		
		//진실 (두 녀석은 같은 집을 바라볼까)
		System.out.println(emp == emp2);
		
		//Emp 클래스 구매
		//메모리에 올려서 사용
		// >> javac emp.java 컴파일  >>  Emp.class(실행파일)
		// >> java Emp 엔터
		// JRE > JVM > OS (땅) > JVM(메모리의 영역 구성 : stack , heap) > 메모리 자원 할당
		// > main 함수가 실행할 코드가 없으면 > 프로그램 종료 > JVM (메모리 반환) > OS
		
		// 이런 모든 작업은 : 이클립스라는 툴을 통해서 한방에 (실행 : ctrl + F11)
		
		
	}

	
	

}
