package xmu.crms.vo;


/**
 * @author CaoXingMei
 * @date 2017-12-5
 */

public class SchoolVO {
	private Long id;
	private String name;
	private String province;
	private String city;
	
	public SchoolVO(String province)
	{
		super();
		this.province = province;
	}

	public SchoolVO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public SchoolVO(Long id, String name, String province, String city) {
		super();
		this.id = id;
		this.name = name;
		this.province = province;
		this.city = city;
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
