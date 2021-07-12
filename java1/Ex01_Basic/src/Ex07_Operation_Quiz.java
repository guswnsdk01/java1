import java.util.Scanner;

public class Ex07_Operation_Quiz {

	public static void main(String[] args) {
		// == (값을 비교)
		// 문자열 또는 문자 값을 비교
//		String str = "+";
		//if (str == "+") {System.out.println("같아요");} 틀린방법
		
		//정상방법
		//Today Point
		//if(str.equals("+")) {System.out.println("정답");}
		
		// if (조건값 >> true, false)

		Scanner sc = new Scanner(System.in);
		System.out.println("입력값 : ");
		int num = Integer.parseInt(sc.nextLine());
		String a = sc.nextLine();
		int num2 = Integer.parseInt(sc.nextLine());
		
		if(a.equals("+")) {
			System.out.printf("연산결과 : %d",  num + num2);
		} else if(a.equals("-")) {
			System.out.printf("연산결과 : %d", num - num2);
		} else if(a.equals("*")) {
			System.out.printf("연산결과 : %d",  num * num2);
		} else if(a.equals("/")) {
			System.out.printf("연산결과 : %d",  num / num2);
		} else {
			System.out.println("지원하지 않는 연산자 입니다");
			//key point (여기서는 main 함수)
			//return 키워드 : [함수단위]의 종결자 > main 함수 탈출 > 종료
			return;

			//System.exit(0); // 강제적인 프로그램 종료
		}
		
		//1.
		
		// switch 조건 (char , String) ****************************
		
//		switch(a) {
//		case "+" : System.out.printf("연산결과 : %d", num + num2);
//		break;
//		case "-" : System.out.printf("연산결과 : %d", num - num2);
//		break;
//		case "*" : System.out.printf("연산결과 : %d", num * num2);
//		break;
//		case "/" : System.out.printf("연산결과 : %d", num / num2);
//		break;
//		default : System.out.println("지원하지 않는 연산자 입니다");
//		
//		2. switch 조건 (char , String) **************************
		//Scanner sc = new Scanner (System.in);
		//String ch = sc.nextLine();
		
//		switch (ch) {
//		case "+" : System.out.println("+ 입니다");
//		break;
//		default: System.out.println("다른 문자 입니다");
//		break;
//		}
		
//		}
	}

}
