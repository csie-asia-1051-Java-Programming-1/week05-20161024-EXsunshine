package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		double sum = 0;
		for(int a = n;a>0;a--){
			sum=sum+(double)Math.pow(a,2);
		}
		System.out.println(sum);
	}

}
