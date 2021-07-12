package solo;

public class loopArray {

	public static void main(String[] args) {
		String[] users = new String[3];
		users[0] = "hyeon jun";		//변수명[인덱스값] = 변수값(엘리먼츠)
		users[1] = "yul li";
		users[2] = "hyeon kyu";
		
		for(int i = 0; i < users.length; i++) {
			System.out.println("<li>"+ users[i] + "</li>");
		}
		//자리수를 만들때는 1,2,3 으로 숫자를 세지만
		//불러올때나 읽을때는 0부터 세야한다. (index)
		// 변수명.length : 배열값의 갯수 
	}

}
