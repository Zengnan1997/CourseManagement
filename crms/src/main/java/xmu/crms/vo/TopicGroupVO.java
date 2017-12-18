package xmu.crms.vo;

import java.util.List;

/**
 * @author CaoXingMei
 * @date 2017-12-4
 */
public class TopicGroupVO {

	private Long id;
	private String name;
	


	@Override
	public String toString() {
		return "TopicGroupVO [id=" + id + ", name=" + name + "]";
	}

	public TopicGroupVO(Long id, String name)
	{
		this.id = id;
		this.name = name;
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
