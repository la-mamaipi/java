package demo;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("系统启动");
		int input = getInput(sc);
		while(input !=0){
			int res = calSayNum(input);
		
		System.out.println("您输入的序号是" + input+",应该报："+res);
		input =getInput(sc);
	}
		System.out.println("退出系统");
	}
	private static int calSayNum(int input) {
		int remainder=input%3;
		int res;
		if(remainder ==0){
			res=3;
		}else{
			res=remainder;
		}
		return res;
	}

	private static int getInput(Scanner sc) {
		System.out.print("请输入序号（0表示退出系统）：");
		int input = sc.nextInt();
		return input;
	}
}
		