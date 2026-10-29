package ex04;

import java.util.Objects;

class Member {
	
	//Fields
	private String name;
	private String phone;
	private int bYear;
	
	// Constructor
	public Member() {
		
	}
	
	public Member(String name, String phone, int bYear) {
		super();
		this.name = name;
		this.phone = phone;
		this.bYear = bYear;
	}
	
	// Getter
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public int getbYear() {
		return bYear;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + ", bYear=" + bYear + "]";
	}
	
	// mArr[0] (this) == m (other)
	// mArr[0].equals( m )
	@Override
	public boolean equals(Object obj) {      
		Member other = (Member) obj;
		//return this.bYear == other.bYear 
		//			&& Objects.equals(name, other.name) 
		//			&& Objects.equals(phone, other.phone);
		return name.equals(other.name);
	}
	
	
	
}

public class TestMember {

	public static void main(String[] args) {
		
		// 객체 배열
		Member [] mArr = new Member[3];  // 반드시 배열을 먼저 만들어야 한다
		mArr[0] = new Member("강호동", "010", 1980);
		mArr[1] = new Member("서장훈", "011", 1983);
		mArr[2] = new Member("김연아", "012", 1990);
		
		System.out.println("전체 목록");
		for (int i = 0; i < mArr.length; i++) {
			System.out.println(mArr[i]);
		}
//		System.out.println(mArr[0]);
//		System.out.println(mArr[1]);
//		System.out.println(mArr[2]);
		
		// 김연아 를 찾아서 정보를 출력해줘
		Member m = new Member("서장훈", null, 1990); // 찾을 data
		System.out.println("찾은 정보:");
		for (int i = 0; i < mArr.length; i++) {
			if(mArr[i].equals(m) )
				System.out.println(mArr[i]);
		}
		

	}

}
