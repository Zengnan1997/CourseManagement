package xmu.crms.vo;

public class MemberVO {
	private Long id;
	private String name;
	private String number;

	public MemberVO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public MemberVO(Long id, String name, String number) {
		this.id = id;
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "MemberVO{" +
				"id=" + id +
				", name='" + name + '\'' +
				", number='" + number + '\'' +
				'}';
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
