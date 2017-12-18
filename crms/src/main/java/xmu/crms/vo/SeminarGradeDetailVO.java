package xmu.crms.vo;

public class SeminarGradeDetailVO {
	private String seminarName;
	private String groupName;
	private String leaderName;
	private Integer presentationGrade;
	private Integer reportGrade;
	private Integer grade;

    public SeminarGradeDetailVO(String seminarName, String groupName, String leaderName, Integer presentationGrade,
			Integer reportGrade, Integer grade) {
		super();
		this.seminarName = seminarName;
		this.groupName = groupName;
		this.leaderName = leaderName;
		this.presentationGrade = presentationGrade;
		this.reportGrade = reportGrade;
		this.grade = grade;
	}
    
	@Override
    public String toString() {
        return "SeminarGradeDetailVO{" +
                "seminarName=" + seminarName +
                "groupName=" + groupName +
                ", leaderName='" + leaderName + '\'' +
                ", presentationGrade=" + presentationGrade +
                ", reportGrade='" + reportGrade + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
	
	
	public String getSeminarName() {
		return seminarName;
	}

	public void setSeminarName(String seminarName) {
		this.seminarName = seminarName;
	}

	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getLeaderName() {
		return leaderName;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	public Integer getPresentationGrade() {
		return presentationGrade;
	}
	public void setPresentationGrade(Integer presentationGrade) {
		this.presentationGrade = presentationGrade;
	}
	public Integer getReportGrade() {
		return reportGrade;
	}
	public void setReportGrade(Integer reportGrade) {
		this.reportGrade = reportGrade;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
}
