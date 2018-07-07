package scpc;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.math.*;

public class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(new FileInputStream("D:\\__Java\\scpc\\src\\scpc\\input.txt"));
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			 Answer = 0;
			 int N = sc.nextInt();
			 int K = sc.nextInt();
			 ArrayList<Integer> abil = new ArrayList<Integer>();
			 for(int i = 0; i < N; i++) {
				 abil.add(sc.nextInt());
			 }
			 
			 if(abil.size()!=1) {
				 while(abil.size() > 0) {
					 for(int i = 1; i < abil.size(); i++) {
						 if(Math.abs((int)abil.get(0)-(int)abil.get(i)) > K){
							 abil.remove(i);
						 }
					 } 
					 abil.remove(0);
					 Answer++;
				 }
			 }
			 else
				 Answer = 1;
			 
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}