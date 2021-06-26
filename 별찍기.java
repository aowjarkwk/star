
public class º°Âï±â {

	public static void main(String[] args) {
		int n = 5;
//		-----
//		-----
//		-----
//		-----
//		-----
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("-");
			}System.out.println();
		}
		
//		+
//		++
//		+++
//		++++
//		+++++
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("-");
			}System.out.println();
		}
		
		
//		xxxxx
//		xxxx
//		xxx
//		xx
//		x
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("x");
			}System.out.println();
		}
		
//		    ¡Ù
//		   ¡Ù¡Ù
//		  ¡Ù¡Ù¡Ù
//		 ¡Ù¡Ù¡Ù¡Ù
//		¡Ù¡Ù¡Ù¡Ù¡Ù
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int g=1;g<=i; g++) {
				System.out.print("1");
			}
			System.out.println();
		}
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		for(int i=1; i<=n; i++) {
			for(int g=1;g<i; g++) {
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
//		  &
//		 &&&
//		&&&&&
		int mid = n/2+1;
		for(int i=1; i<=mid; i++) {//³ôÀÌ 3
			for(int j=mid; j>i; j--) { // ºóÄ­ 3 2 1 0 ÀÌÁ¦ 135 ´Ã¾î³ª±â..
				System.out.print(" ");
			}
			for(int h=3; h<=i*2+1; h++) { // h=3 h<3 h3 h<=5
				System.out.print("8");
			}System.out.println();
					
		}
		
//		*****
//		*   *
//		*   *
//		*   *
//		*****
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1||i==n) {
					System.out.print("*");
				}else {
					if(j==1||j==n) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}System.out.println();
		}
		
	}

}

