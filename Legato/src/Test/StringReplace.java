package Test;

public class StringReplace {

	public static void main(String[] args) {
		String str[]= {"This is a paragraph where "
				+ "every character is to be converted to I"};
		
		for(int i=0;i<str.length;i++) {
			 
			String w=str[i];
			for(int j=0;j<w.length();j++) {
				if(w.charAt(j)==' ') {
					System.out.println(" ");
				}
				else {
				w= w.replace(w.charAt(j), 'I');
				
			}
			str[i]=w;
		}
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

}
