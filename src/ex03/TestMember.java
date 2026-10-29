package ex03;

import java.util.Objects;

// 자바의 모든 class 는 기본으로 Object class 상속받는다
class A extends Object {}
// == class A  {}
// equals()   : 객체비교
//  문자열을 비교하면 값을 비교하도록 재정의(override)되어 있다
//  일반객체에서 equals() 사용해도 주소을 비교 ( == 와 같은 일을 한다)
// toString() : 객체이름을 출력
// hashCode() : 객체의 heap 의 위치
// getClass() : 클래스 정보가지고 온다


class Member extends Object {
	//Fields
	private String name;
	private String phone;
	
	// Constructor
	public Member() {
		System.out.println("Member class 입니다");
	}
	public Member(String name, String phone) {
		this(); // Member 기본생성자 호출한다
		// super(); // super Object() 부모클래스 기본 생성자 호출
		this.name  = name;
		this.phone = phone;
	}
	
	//Getter / Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//method
	public void info() {
		System.out.println("이름:" + name + "전화:" + phone);
	}
	
	// override
	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}
	
	// m1.equals(m)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
}

public class TestMember {

	public static void main(String[] args) {
		
		Member m0 = new Member();
		m0.setName("이승우");
		m0.info();
		
		Member m1 = new Member("손흥민", "010-1111-1111");
		Member m2 = new Member("안정환", "010-2222-2222");
		Member m3 = new Member("차범근", "010-3333-3333");
		
		m1.info();
		m2.info();
		m3.info();
		
		// 손흥민 이름, 전화
		Member m = new Member("손흥민", "010-1111-1111");
		//객체(인스턴스)비교 == 주소로 비교
		System.out.println( m1 == m ); // false, 원칙
		
		
		// 비교가능하게 만들어줘 -> 값을 비교 equals 를 재정의
		// 비교를 값으로 이름과 전화를 비교하도록 재정의
		System.out.println( m1.equals(m) ); // false -> true
		
		A a = new A();
		//a.equals(a)
		
		System.out.println("======================");
		System.out.println(m1);              //ex03.Member@14dad5dc
			// Member [name=손흥민, phone=010-1111-1111]
		System.out.println(m1.toString());   //ex03.Member@14dad5dc
			// Member [name=손흥민, phone=010-1111-1111]
		System.out.println(m1.hashCode());   //349885916
		System.out.println(m1.getClass());   //class ex03.Member
		
		System.out.println( m );             //ex03.Member@18b4aac2

	}

}
