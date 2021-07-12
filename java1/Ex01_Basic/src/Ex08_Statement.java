
public class Ex08_Statement {

	public static void main(String[] args) {
		/*
		 암기 
		 조건문 : if 3가지 , switch(조건){case 값 ... break}
		 반복문 : for(반복횟수 명확) , while(조건 true,false) {} , do{} ~while()
		 분기문 : break (블럭 탈출) , continue(아래 구문 skip)
		 */
		
//		int count = 0;
//		if(count < 1) System.out.println("true"); // { 실행블럭 생략 단일 if }
//		
//		if(count < 1) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//		
//		char data = 'A';
//		switch (data) {
//		case 'A' : System.out.println("문자비교");
//			break;
//		default : System.out.println("나머지 모든것");
//		}
//		
		//for (1~ 100 합을 출력)
		//그 합을 sum 변수에 담아서 출력
//		int sum = 0;
//		//for (int i = 1; i<= 100 ; i++) 이쁜것 쓰세요
//		for(int i = 1 ; i <= 100 ; i++) {
////			sum = sum + i;
//			sum += i;
//			
//		}
//		System.out.println("sum : " + sum);
//		
//		// 1 ~ 5 까지의 합
//		//문제) 수학 공식 (반복문 쓰지 말고 공식 계산)
//		// n * (a + 1) / 2
//		//개수 * (시작 + 끝) / 2
//		sum = 5*(1+5) /2;
//		System.out.println("sum : " + sum);
		
		//공식을 원리 이해 .. 논리적 해결 ...
		//for 문을 쓰는 것이 아무 문제 없다
		
		//for 문을 사용해서 1~10까지 홀수의 합을 구해보세요
		int sum2 = 0;
		for(int i=1; i < 10; i+=2) { // i= i + 2
			sum2+=i;
			//sum2 = 0 + 1;
			//sum2 = 1 + 3
			
		}
		System.out.println("sum2 : " + sum2);
		//for문이 이해가 안되는분은
		//cafe.naver.com/bit202107/54 참고
		
		// 1~100까지의 짝수 합
		int sum3 = 0;
		for(int i = 0; i <= 100; i+=2) {
//			if(i % 2 == 0) {
				sum3+=i;
//			}
		}
		System.out.println("1~100 까지 짝수 합 : " + sum3);
		
		//입사시험(중소)
		//구구단 출력하기(중첩 for)
		//행 열 ....
		// 2 ~ 9
		// 1 ~ 9 수행
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++ ) {
//				System.out.println(i + " * " + j + " = " + i*j + "\t");
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
			}
			System.out.println();
		}
		
		//분기문 (continue , break)
		//Today Point : continue(skip 아래 구문) , break(for 블럭 , while 블럭)
		System.out.println("****************************************************");
		for(int i = 2; i <= 9 ; i++) {
			for(int j = 1; j <= 9; j++) {
				if (i == j) {
					break;
				}
				System.out.printf("%S","*");
			}
			System.out.println();
		}
		
		System.out.println("****************************************************");
		for(int i = 2; i <= 9 ; i++) {
			for(int j = 1; j <= 9; j++) {
				if (i == j) {
					continue;
					//즉 i=j가 같을때는 continue로 그 값만 스킵되고 나머지는 출력된다.
					//break는 i=j가 같을때 멈춤.
				}
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
				System.out.printf("%S","*");
			}
			System.out.println();
		}
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j < i ; j++) { // 조건식 : j < i
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 100 ; i >= 0 ; i--) { // 큰값부터 ....
			System.out.println(i);
		}
		
		//피보나치 수열
		
		/*
		 1
		 1
		 2
		 3
		 5
		 8
		 13
		 
		 */
		
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i = 0; i < 10; i ++) {
			a = b;
			b = c;
			c = a + b;
			System.out.printf("a[%d] , b[%d], c[%d]" , a, b, c);
			System.out.println(" " + c);
		}
	}
	

}
