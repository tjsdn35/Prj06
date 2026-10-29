package ex05;

import java.text.MessageFormat;
import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		//            01234
		String str = "Hello";
		System.out.println("문자열길이:" + "Hello".length() );		 // 5
		System.out.println("문자열길이:" + "안녕하세요".length() );	 // 5
		
		// 			   012345 6 7 8 9
		String str1 = "Java 프로크래밍";
		System.out.println("1위치의 글자:" + str1.charAt(1));
		System.out.println("5위치의 글자:" + str1.charAt(5));
		
		//			   01234567890
		String str2 = "Hello World";
		System.out.println("" + str2.substring(0, 4+1) ); // 0~4
		System.out.println("" + str2.substring(6) );	  // 6~끝까지(10+1)
		//			   012345
		String str3 = "banana";
		System.out.println("문자(a)의 위치" +str3.indexOf("a"));  	 // 1
		System.out.println("문자(a)의 위치" +str3.indexOf("a",2));   // 3
		System.out.println("문자(a)의 위치" +str3.lastIndexOf("a")); // 3
		
		// ~를 포함하는 : 시작, 중간, 끝
		String str4 = "apple pie";
		System.out.println("pie 문자열을 포함하는가?" + str4.contains("pie"));
		
		// ~로 시작하는
		String str5 = "filename.java";
		System.out.println("file 이 포함:" + str5.startsWith("file"));
		System.out.println("file 이 위치:" + str5.indexOf("file")); 
		
		// ~로 끝나는
		System.out.println(".java로 끝나는:" + str5.endsWith(".java"));
		
		// 문자열 비교
		String str6 = "Java";
		String str7 = "java";
		System.out.println(str6.equals(str7)); 				// 
		System.out.println(str6.equalsIgnoreCase(str7));	// 대소문자 무시
		
		// 대소문자 변환
		System.out.println(str6.toUpperCase());
		System.out.println(str6.toLowerCase());
		
		//앞뒤의 공백 제거
		String str8 = "    짱구    ";
		System.out.println(str8);
		System.out.println(str8.length() );
		
		System.out.println(str8.trim());
		System.out.println(str8.trim().length());
		
		// 문자열 교체
		String str9 = "I like Java";
		System.out.println(str9);	// I like Java
		String str9x = str9.replace("Java", "Python");	// I like Python 출력 x
		System.out.println(str9x);	// I like Python 출력
		System.out.println(str9); 	// I like Java
		str9 = str9.replace("Java", "Anaconda");	// I like Anaconda
		System.out.println(str9);	// I like Anaconda
		
		//문자열 분리 -> 문자열 배열
		String str10 = "red,green,blue";
		System.out.println(str10);		// red,green,blue
		String[] coloArr = str10.split(",");
		System.out.println(coloArr);	// [Ljava.lang.String;@8bcc55f
		
		
		System.out.println(Arrays.toString(coloArr)); // [red,green,blue]
		System.out.println(coloArr[0]);	// red
		System.out.println(coloArr[1]);	// green
		System.out.println(coloArr[2]);	// blue
		
		String empty = "";		// 빈문자열   : length() : 0
		String blank = "   ";	// 공백문자열 : length() : 1
		
		System.out.println(empty.isEmpty()); // 빈문자열
		System.out.println(blank.isBlank()); // 공백문자열 : java 11
		
		String name = "Alice";
		int	   age  = 22;
		String msg = String.format("이름:%s 나이:%d" ,
			   name, age);
		System.out.println( msg );
		
		String msg2 = MessageFormat.format("이름:{0}, 나이:{1}"
				, name, age);
		System.out.println(msg);
		
		String result = String.join("-", coloArr);
		System.out.println(result);
		
		String result2 = String.join("-", "2026", "10", "29");
		System.out.println(result2);
		
		String star = "*";
		System.out.println(star.repeat(5)); // java 11
				
				
	
	}

}
