import java.util.Scanner;

public class Ex06_Printf_format {

	public static void main(String[] args) {
//			  Java : System.out.println();
		// C# 언어 : Console.WriteLine();
		
		System.out.println("A"); //줄바꿈( newline)
		System.out.println("B");
		System.out.print("C");
		System.out.print("D"); //CD
		
		int num = 100;
		System.out.println(num);
		System.out.println("num 값은 : " + num + " 입니다");
		//형식(format) >> 화폐단위 >> 1000000 >> $10,000,000
		
		System.out.printf("num 값은 : %d 입니다",num);
		//형식 문자
		// %d (10진수 형식의 정수) >> d 자리에 
		// %f (실수)
		// %s (문자열)
		// %c (한문자)
		// \t > tab , \n > 줄바꿈
		System.out.println();//줄바꿈
		System.out.printf("num 값은 [%d] 입니다 그리고 [%d] 도 있어요 \n",num , 12345);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f 변수값 :%f 입니다 \n",f);
		
		//입력 (콘솔창에 사용자에 입력한 값을 받을 수 있다)
		Scanner sc = new Scanner(System.in);
		
		//여러분이 사용하는 모든 자원은 package 안에 있어요
		//반드시 사용전에 박스를 열고 사용하려는 자원을 꺼내 놓아야 한다
		//import
		
		//default(기본값) : java.lang.* >> import >> lang 안에 있는 자원은 import안하고 사용 가능
		
		//소스의 모든 import 자동화 하기 : ctrl + shift + o
		/*
		System.out.println("값을 입력하세요");
		
		String returnvalue = sc.nextLine();	//값을 입력하지 않으면 영원히 대기
		System.out.println("returnvalue : " + returnvalue);
		
		int number = sc.nextInt();
		System.out.println("정수값 number : " + number);
		
		float fnumber = sc.nextFloat();
		System.out.println("실수값 : number : " + fnumber);
		*/
		
		//주의 사항 
		//이클립스에서 입 출력 작업시 .... nextInt , nextFloat 보다는 nexLine()을 사용 read
		//Today Point
		// [문자열] -> 숫자로 (정수 , 실수)
//		Integer.parseInt("1000") => 1000 숫자 정수
//		Float.parseFloat("3.14") => 3.14 숫자 실수
		
		//웹 화면에서 보면 사용자가 입력하는 모든 값은 문자열 --> 결합 , 연산 (문자열 > 숫자)
		
		System.out.println("숫자 입력하세요");
		int number = Integer.parseInt(sc.nextLine());
		int result = number + 1000;
		System.out.printf("number > %d : result > %d",number , result);
		
	}

}
