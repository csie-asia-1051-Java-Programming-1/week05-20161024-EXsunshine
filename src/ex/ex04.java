﻿package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形 (請利用迴圈，不要直接用 printf 方式直接輸出)。
 * Date: 2016/10/24
 * Author: 105021057 張岳埕
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int a = 0;a<=n;a++){
			for(int b = 0;b<=n;b++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
