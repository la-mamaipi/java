package demo;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("ϵͳ����");
		int input = getInput(sc);
		while(input !=0){
			int res = calSayNum(input);
		
		System.out.println("������������" + input+",Ӧ�ñ���"+res);
		input =getInput(sc);
	}
		System.out.println("�˳�ϵͳ");
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
		System.out.print("��������ţ�0��ʾ�˳�ϵͳ����");
		int input = sc.nextInt();
		return input;
	}
}
		