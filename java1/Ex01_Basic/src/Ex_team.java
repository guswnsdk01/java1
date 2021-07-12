import java.util.Scanner;

public class Ex_team {

	public static void main(String[] args) {

		        //[제어문 조별과제]
		        //컴퓨터가 자동으로 나온 가위, 바위, 보에 대해서 사용자가 값을 입력해서 처리하세요
		        //가위=1, 바위=2, 보=3


		        Scanner sc = new Scanner(System.in);
		        int com = (int) (Math.random() * 3) + 1;

		        String result = "";
		        String result2 = "";

		        int human = 0;
		        boolean power = true;

		        while (power) {

		            result = "";
		            System.out.println("(가위=1, 바위=2, 보=3)");
		            System.out.print("당신의 선택은 ?");

		            human = Integer.parseInt(sc.nextLine()); //숫자값..
		            System.out.println();
		            //에러 체크
		            if (human > 3 || human < 0) {
		                System.out.println("잘못된 값을 입력하셨습니다!");
		                continue;
		            }

		            //판단
		            if (com == human) {
		                System.out.println("비겼다!");

		            } else if (com == 1) {
		                result = (human == 2) ? "이겼다" : "졌다";

		            } else if (com == 2) {
		                result = (human == 3) ? "이겼다" : "졌다";

		            } else {
		                result = (human == 1) ? "이겼다" : "졌다";
		            }
		            System.out.println();
		            System.out.println(result);
		            //다시시작??


		            while (true) {
		                System.out.print("\n게임을 다시하시겠습니까? ( Y / N ) ");

		                result2 = sc.nextLine();

		                if (result2.equals("Y")) {
		                    System.out.println("가위바위보를 다시시작합니다! \n");
		                    System.out.println("-------------------------------------");
		                    break;
		                } else if (result2.equals("N")) {
		                    power = false;
		                    break;
		                } else {
		                    System.out.println("잘못된 값을 입력하셨습니다.\n");
		                    System.out.println("------------------------------------------");
		                }
		            }
		            System.out.println();

		        }


		        System.out.println("컴퓨터의 선택 : " + com);
		        System.out.println("게임 종료!");
		        System.out.println("------------------------------------------");

		    }
		}



