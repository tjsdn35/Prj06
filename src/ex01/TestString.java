package ex01;

public class TestString {

	public static void main(String[] args) {
		String name1 = "이순신";
		String name2 = "이순신";
		String name3 = new String("이순신"); // new Heap 새로 메모리 생성
		String name4 = new String("이순신"); // new Heap 새로 메모리 생성
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		//같은 이름인가 -> 틀린 표현 : 문자열 비교는 == 사용금지
		if( name1 == name2 )  // 주소비교 : heap 의 위치
			System.out.println("같은 이름");
		else
			System.out.println("다른 이름");
		
		if( name3 == name4 ) // 주소
			System.out.println("같은 이름");
		else
			System.out.println("다른 이름");
		
		// data 비교 -> 정상적인 문자열 비교 ( equals() )
		if( name1.equals(name2) )
			System.out.println("같은 이름");
		else
			System.out.println("다른 이름");
		
		if( name3.equals(name4) )
			System.out.println("같은 이름");
		else
			System.out.println("다른 이름");
		
		// 문자열의 >, < 비교 : 문자열 순서 - 정렬 ABCD 순(오름차순), 내림차순
		// name5 > name6 // 자바에서 이 비교 불가능
		String name5 = "이순신";
		String name6 = "이이";
		//if( name5 > name6 ) // 에러 : 문자열 > 롤 비교 불가능
		if( name5.compareTo(name6) > 0 ) { // name5 > name6
			System.out.println("이순신가 크다");
		}else {
			if(name5.compareTo(name6) == 0) { // name5 == name6
				System.out.println("같은 이름이다");
			}else {
				if(name5.compareTo(name6) < 0) {
					System.out.println("이순신이 작다");
				}
			}
		}
	}

}
