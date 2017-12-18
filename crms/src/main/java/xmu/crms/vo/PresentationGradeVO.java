package xmu.crms.vo;

public class PresentationGradeVO {
	private Long topicId;
	private Integer grade;
	
	public PresentationGradeVO(Long topicId, Integer grade) {
		super();
		this.topicId = topicId;
		this.grade = grade;
	}
	
    @Override
    public String toString() {
        return "PresentationGradeVO{" +
                "topicId=" + topicId +
                ", grade='" + grade +
                '}';
    }
	public Long getTopicId() {
		return topicId;
	}
	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	
}
