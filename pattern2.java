

import java.util.Scanner;

public class  pattern2{
	public static void main(String[] args) {
		
//Left angle triangle
		int n=1;
		for(int r=1;r<=5;r++) {
			for(int s=5;s>=r;s--) {
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {
				System.out.print(n);
			}
			n++;
			System.out.println();
		}
		
//Right rhombus
		int r,c,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows and columns for rhombus:");
		int n=sc.nextInt();
		for(r=1;r<=n;r++) {
			for(s=n;s>r;s--) {
				System.out.print(" ");
			}
			for(c=1;c<=n;c++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		
//Reverse right angled triangle
		int r,c;
		for(r=1;r<=5;r++) {
			for(c=5;c>=r;c--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
//Alternate_$_and_h
		int r,c;
		for(r=1;r<=5;r++) {
			for(c=1;c<=5;c++) {
				if(c%2!=0) {
					System.out.print("$");
				}
				else {
					System.out.print("h");
				}
			}
			System.out.println();
		}
		
		
		 
		
	} 
}