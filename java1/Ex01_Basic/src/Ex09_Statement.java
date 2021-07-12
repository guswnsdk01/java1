import java.util.Scanner;

public class Ex09_Statement {

	public static void main(String[] args) {
		// 반복문 (while , do~while)
		// while(true) {
		// System.out.println("바보");
		//}
		//증가감 논리를 반드시 명시 하자
		
		int i = 10;
		while(i >= 10) {
			
//			System.out.println("i : " + i);   >> i:10 한개 출력
			i--;
//			System.out.println("i : " + i);  // >> i:9 한개 출력
			
		}
		
		//while 1~100까지 합
		int sum = 0;
		int j = 1;
		while(j <= 100) {
			// j++; 그 결과값 : sum : 5150
			sum += j; //sum = sum+j
			j++; // 그 결과값 : sum : 5050
		}
		System.out.println("sum : " + sum);
		
		//while 구구단
		//while() {   while(){} }
		int k = 2;
		int p = 1;
		while(k <= 9) {
			//두번째 while 실행시 ... while 문 (p=10)
			p = 1;
			while(p <= 9) {
				System.out.printf("[%d]*[%d]=[%d]\t", k, p, k*p);
				p++;
			}
			System.out.println();
			k++;
		}
		
		
		//하지만 위 같은 상황이라면 while >> for문이 편하다
		// 강제로 프로그램 유지 (while(true) { if (true) break;)}
		
		// do {  실행문  } while(조건)
		// 강제적으로 한번 수행 ... 그 다음 조건을 보겠다
		//메뉴구성
		//1. 인사
		//2. 회계
		//선택
		//당신이 원하는 업무 번호를 선택하세요 >> do{ 강제코드 값을 받는 코드} while(){}
		//입력값 : 3 >> while (판단)
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.println("숫자 : 0 ~ 9");
			inputdata = Integer.parseInt(sc.nextLine());
		} while(inputdata >= 10); //조건이 true 이면 do 계속 실행
								  //조건이 false 이면 탈출
		System.out.println("당신이 입력한 숫자는 : " + inputdata);
		
	}

}
