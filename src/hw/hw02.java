package hw;
/*
 * Topic: 讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=?
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		while(n>0){
			int m =1;
			sum =sum+m; 
		    m++;
		    
		    System.out.print(m);
		}
		
	}

}
