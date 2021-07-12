package solo;

public class Ex_Switch2 {

	public static void main(String[] args) {
		int r = (int)(Math.random()*10 +1);
		String s = "입력된 값 : ";
		String n = "";
		String m = "잘못 입력 되었습니다";
		switch(r) {
		 case 1 : n = "1 입니다. \n";
		 break;
		 case 2 : n = "2 입니다. \n";
		 break;
		 case 3 : n = "3 입니다. \n";
		 break;
		 default : System.out.println(m);;
		}
		System.out.println(n + s + r);
	}

}
