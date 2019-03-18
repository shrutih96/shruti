public class New {
	public static void main(String[] args) {
	
	
	int p=0;
	sequence(p);
	}
public static void sequence(int q) {
		int a[]=new int[5];
		for(int i=0;i<5;i++) {
			if(q%2==0) {
			 a[i]=++q;
			System.out.println(a[i]);
				
		}
		}
	 q=0;int b[]=new int[5];
	 
			for(int j=0;j<5;j++) {
				if(q%2==1)
					b[j]=q;
				System.out.println(b[j]);
				q=q++;}
}
}
