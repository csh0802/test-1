package com.example.demo.vo;

public class MemberVO {
	
	private String id,pw,phone,email,gender,age;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", phone=" + phone + ", email=" + email + ", gender=" + gender
				+ ", age=" + age + "]";
	}

	public MemberVO(String id, String pw, String phone, String email, String gender, String age) {
		super();
		setId(id);
		setPw(pw);
		setPhone(phone);
		setEmail(email);
		setGender(gender);
		setAge(age);
	}
	
	

	

}
