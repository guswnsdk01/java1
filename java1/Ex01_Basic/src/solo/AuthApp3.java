package solo;

public class AuthApp3 {

	public static void main(String[] args) {
//		String[] hunter = {"gon", "kira", "hisoka"};
		String[][] hunter= {
				{"gon","0001"},
				{"kira","0002"},
				{"hisoka","0003"}
		};
		String inputId = "kira";
		String inputPass = "0002";
		
		boolean isLogined = false;
		for(int i=0; i <hunter.length; i++) {
			String[] Current = hunter[i];
			if(
				Current[0].equals(inputId) &&
				Current[1].equals(inputPass)	
			   ) {
				isLogined = true;
				break;
				 }
			}
//			System.out.println("Hi,");
			
			if(isLogined) {
			System.out.println("Hi, " + inputId);
			} else {
			System.out.println("Access imposble.");
			}
		
		
	}

}
