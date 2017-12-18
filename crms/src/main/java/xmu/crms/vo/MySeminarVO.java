package xmu.crms.vo;

public class MySeminarVO {
	private long id;
	private String name;
	private String groupingMethod;
	private String courseName;
	private String startTime;
	private String endTime;
	private int classCalling;
	private Boolean isLeader;
	private Boolean areTopicSeleted;
	public MySeminarVO(long id, String name, String groupingMethod,
			String courseName, String startTime, String endTime,
			int classCalling, Boolean isLeader, Boolean areTopicSeleted) {
		super();
		this.id = id;
		this.name = name;
		this.groupingMethod = groupingMethod;
		this.courseName = courseName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.classCalling = classCalling;
		this.isLeader = isLeader;
		this.areTopicSeleted = areTopicSeleted;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroupingMethod() {
		return groupingMethod;
	}
	public void setGroupingMethod(String groupingMethod) {
		this.groupingMethod = groupingMethod;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getClassCalling() {
		return classCalling;
	}
	public void setClassCalling(int classCalling) {
		this.classCalling = classCalling;
	}
	public Boolean getIsLeader() {
		return isLeader;
	}
	public void setIsLeader(Boolean isLeader) {
		this.isLeader = isLeader;
	}
	public Boolean getAreTopicSeleted() {
		return areTopicSeleted;
	}
	public void setAreTopicSeleted(Boolean areTopicSeleted) {
		this.areTopicSeleted = areTopicSeleted;
	}
	

}
