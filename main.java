package string;

import java.util.Scanner;

public class BooleanString {
	static boolean isbooleanstring(String str) {
		boolean res=true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='0' && str.charAt(i)!='1'){
				return false;
				
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(isbooleanstring(str));
		sc.close();
	}

}
