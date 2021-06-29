package introduction;

public class Pr_12 {
	
	public static void main(String[] args) {
		String str="sahhs  sahhs  shhs  shs shsfllf f dlld";
		String[] arr=str.split(" ");
		String newstr="";
		
		for (String string : arr) {
			newstr=newstr+string;
		}
		
		System.out.println(newstr);
		
		String s="hshdh sdhhsd  sdhhsd";
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				System.out.print(c);
			}
		}
	}
	
	
	
}
