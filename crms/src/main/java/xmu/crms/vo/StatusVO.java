package xmu.crms.vo;

public class StatusVO {
	private int numPresent;
	private int numStudent;
	private String status;
	private String group;
	public StatusVO(int numPresent, int numStudent, String status, String group) {
		super();
		this.numPresent = numPresent;
		this.numStudent = numStudent;
		this.status = status;
		this.group = group;
	}
	public int getNumPresent() {
		return numPresent;
	}
	public void setNumPresent(int numPresent) {
		this.numPresent = numPresent;
	}
	public int getNumStudent() {
		return numStudent;
	}
	public void setNumStudent(int numStudent) {
		this.numStudent = numStudent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	

}
