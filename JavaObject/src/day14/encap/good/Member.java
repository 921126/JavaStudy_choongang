package day14.encap.good;

public class Member {
	
	//회원정보 저장
	private String id;
	private String pw;
	private String name;
	private String email;
	private String addr;
	private int age;
	
	//기본 생성자 자동완성 ctrl + space + enter
	public Member() {
	}
	
	//생성자 자동완성 단축키 alt + shift + s > using fields

 
	//메서드 getter,setter 자동완성 단축키 alt + shift+ s
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
