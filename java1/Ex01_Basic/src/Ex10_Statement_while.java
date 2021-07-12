import java.util.Scanner;

public class Ex10_Statement_while {

	public static void main(String[] args) {
		
		boolean auto = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(auto) {
			System.out.println("***************************************");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("***************************************");
			
			System.out.println("선택");
			int input = Integer.parseInt(sc.nextLine());
			
			switch(input) {
		
			case 1 : System.out.println("예금");
						 balance += Integer.parseInt(sc.nextLine());
						 break; //switch 탈출
				case 2 : System.out.println("출금");
				 		 balance += Integer.parseInt(sc.nextLine());
				 		 break; //switch 탈출
				case 3 : System.out.println("잔고 : " + balance);
				 		 balance += Integer.parseInt(sc.nextLine());
				 		 break; //switch 탈출
				case 4 : System.out.println("종료");
				 		 auto = false; //논리를 이용해서 while(false) 탈출
				 		 break; //switch 탈출
				 		 
				default :  System.out.println("올바른 메뉴를 선택하세요");
			}
			
		}

	}

}
