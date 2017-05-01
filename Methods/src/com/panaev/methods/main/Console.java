package com.panaev.methods.main;

public class Console {

	public static void main(String[] args) {
//		System.out.println("args.lengs:" + args.length);
//		if(args.length <=0){
//			System.out.println("No arguments");
//			return;
//		}
//		for (int i = 0; i < args.length; i++) {
//			System.out.println("args[" + i + "]=" + args[i]);
//		}
		String str = new String("one");
		String str2 = new String("one");
		String str3 = "one";
		String str4 = "one";
		
		if(str == str2){
			System.out.println("True:" + "str = str2");
		}else{
			System.out.println("False 1");
		}
		if(str.equals(str2)){
			System.out.println("True:" + "str = str2");
		}else{
			System.out.println("False 2");
		}
		
		if(str3.equals(str4)){
			System.out.println("True:" + "str3 = str4");
		}else{
			System.out.println("False 3");
		}
		if(str3 == str4){
			System.out.println("True:" + "str3 = str4");
		}else{
			System.out.println("False 4");
		}
		
		
	}

}
