package xmu.crms.vo;

import java.util.List;

public class GroupGradeVO {
	private List<PresentationGradeVO> presentationGrade;
	private Integer reportGrade;
	private Integer grade;
	public GroupGradeVO(List<PresentationGradeVO> presentationGrade, Integer reportGrade, Integer grade) {
		super();
		this.presentationGrade = presentationGrade;
		this.reportGrade = reportGrade;
		this.grade = grade;
	}
    @Override
    public String toString() {
        return "GroupGradeVO{" +
                "presentationGrade=" + presentationGrade +
                ", reportGrade='" + reportGrade + '\'' +
                ", grade=" + grade +
                '}';
    }
	public List<PresentationGradeVO> getPresentationGrade() {
		return presentationGrade;
	}
	public void setPresentationGrade(List<PresentationGradeVO> presentationGrade) {
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
