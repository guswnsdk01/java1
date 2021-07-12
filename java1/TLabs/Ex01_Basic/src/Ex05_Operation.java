
public class Ex05_Operation {
	public static void main(String[] args) {
		int sum = 0;
		//대입연산자 : += , -= , *= , /=
		sum += 1; // sum = sum + 1
		sum -= 1; // sum = sum - 1
		System.out.println("sum : " + sum);
		
		//간단한 학점 계산기
		//학점 :A+, A-, B+, B- .... F
		//데이터 점수 : 94점
		
		//판단의 기준 : 90점 이상 >> A인데 판단 >> 95점 이상이면 A+ >> 아니면 A-
		
		//if 3종류 
		//if() {}
		//if() {} else {}
		//if() {} else if() {} else {}
		
		int score = 78;
		String grade= ""; //문자열 초기화
		System.out.println("당신의 점수 : " + score);
		
		//로직
		if(score >= 90) {
			grade="A";
			if(score >= 95) {
			grade += "+"; //A+
			}else {
				grade += "-"; //A-
			}
		} else if(score >= 80) {
			grade = "B";
			if(score >= 85) {
				grade += "+"; //B+
				}else {
				grade += "-"; //B-
				}
		}else if(score >= 70) {
			//if를 쓰지 말고 다른 방법으로 동일한 결과
			grade = "C";
			
			grade = (score >= 75) ? (grade += "+"):(grade += "-");
			//삼항연산자 / 조건식 ? (값):(값) = 조건이 되면 콜론 앞. 아니면 뒤.
		}else {
			grade = "F";
		}
		//결과 :
		System.out.println("당신의 학점은 : " + grade);
	}

}
