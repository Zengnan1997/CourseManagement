package xmu.crms.vo;

import java.util.List;

public class GroupVO {
	private Long id;
	private String name;
	private MemberVO leader;
	private List<MemberVO> members;
	private List<TopicVO> topics;
	private String report;

	public GroupVO(MemberVO leader, List<MemberVO> members) {
		this.leader = leader;
		this.members = members;
	}
	
	public GroupVO(Long id, String name, MemberVO leader, List<MemberVO> members, 
			List<TopicVO> topics, String report)
	{
		super();
		this.id = id;
		this.name = name;
		this.leader = leader;
		this.members = members;
		this.topics = topics;
		this.report = report;
	}

	public GroupVO(Long id, MemberVO leader, List<MemberVO> members, List<TopicVO> topics, String report) {
		super();
		this.id = id;
		this.leader = leader;
		this.members = members;
		this.topics = topics;
		this.report = report;
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
	
	public MemberVO getLeader() {
		return leader;
	}

	public void setLeader(MemberVO leader) {
		this.leader = leader;
	}

	public List<MemberVO> getMembers() {
		return members;
	}

	public void setMembers(List<MemberVO> members) {
		this.members = members;
	}

	public List<TopicVO> getTopics() {
		return topics;
	}

	public void setTopics(List<TopicVO> topics) {
		this.topics = topics;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}
}
