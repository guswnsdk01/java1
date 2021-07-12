/*
클래스는 설계도이다 , 클래스는 타입이다
클래스 == 설계도 == 타입

클래스(설계도) 구체화를 통해서 사용 (집을 짓는 행위)
프로그램 세계에서는 메모리에 올리는 행위 
(new 연산자를 통해서 memory를 생성 >> 만들어 진 것을 (객체:인스턴스)

설계도 종류 2가지
1. main 함수가 있는  >> 독자적으로 실행이 가능 

2. main 함수가 없는  >> 도와주는 역할 >> 라이브러리(lib)

class Atp {}

class Program {static void main(String[] args{}}

*/

//class Apt {	 //The type Apt is already defined (같은 폴더 안에 같은 이름 클래스)
//	
//	
//}
class Apt2{
	int door = 10;	//instance variable // 범용적 : member field
	int window = 20;
}

public class Ex03_RefType {

	public static void main(String[] args) {
		// Apt2 설계도 >> 구체화 >> 메모리에 올려야 >> new 연산자
		Apt2 lgapt = new Apt2();
		//lgapt (참조변수 , 객체변수 : 주소를 가지는 변수(참조값))
		System.out.println(lgapt); //Apt2@76ccd017 (주소값)
		
		
		Apt2 ssapt; //객체를 참조... new 말고도 할당이 있습니다
		ssapt = lgapt; //할당을 통해서도 주소를 가질 수 있다
		ssapt.door = 100;
		System.out.println(lgapt.door);
	}
//
}
/*
문제를 풀어 보세요
	--3분 또는 2분이 같이 풀어보세요
	--문제를 푸시면 지금까지 배운 것 이해 하고 있으신 거죠
	우리는 백화점 경품 시스템을 만들려고 한다
	경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
	
	경품 추첨시 1000 점수가 나오면
	경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
	
	경품 추첨시 900 점수가 나오면
	경품으로  NoteBook , 냉장고 , 한우세트 , 휴지
	
	경품 추첨시 800 점수가 나오면
	경품으로  냉장고 , 한우세트 , 휴지
	
	경품 추첨시 700 점수가 나오면
	경품으로  한우세트 , 휴지
	
	경품 추첨시 600 점수가 나오면
	경품으로  휴지
	
	그외 점수는 100 ~ 500 까지는 칫솔 
	
	경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
	사용자가 경품 시스템을 사용시 
사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
*/
