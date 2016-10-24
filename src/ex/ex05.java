package ex;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 105021057 張岳埕
 */
import java.util.*;
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		int data[][]=new int[10][10];
		for(int i =0;i<10;i++){
			for(int j = 0;j<10;j++){
				data[i][j]=ran.nextInt(10);
			}
			System.out.println();
		}
		
		for(int i =0;i<10;i++){
			for(int j = 0;j<10;j++){
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
		int data2[][]=new int[10][10];
		for(int i =0;i<10;i++){
			for(int j = 0;j<10;j++){
				data2[i][j]=data[j][i];
			}
			System.out.println();
		}
		for(int i =0;i<10;i++){
			for(int j = 0;j<10;j++){
				System.out.print(data2[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
