package studentManagement.been;

public class StudentManagementbeen {
	private int id;
	private String name;
	private String Email;
	private String password;
	private String roolNo;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoolNo() {
		return roolNo;
	}

	public void setRoolNo(String roolNo) {
		this.roolNo = roolNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentManagementbeen [id=" + id + ", name=" + name + ", Email=" + Email + ", password=" + password
				+ ", roolNo=" + roolNo + ", address=" + address + "]";
	}

	
	

}
