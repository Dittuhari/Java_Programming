package ForLoopNumberPattern;

public class DiamondPattern {

	public static void main(String[] args) {
		int n=5,sp=n/2,st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("1");
			}
			if(i<=n/2) {
				sp--;
				st=st+2;
			}
			else {
				sp++;
				st=st-2;
			}
			System.out.println("");
		}
	}

}
