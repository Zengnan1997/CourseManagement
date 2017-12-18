package xmu.crms.vo;
/**
 * @author ZhangChuBing
 * @date 2017-12-3
 */
public class ClassVO {
    private Long id;
    private String name;
    private int numStudent;
    private String time;
    private String site;
    private int calling;
    private String roster;
    private ProportionsVO proportions;
    private String courseName;
    private String courseTeacher;
    
    public ClassVO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ClassVO(Long id, String name, int numStudent, String time, String site, String courseName, String courseTeacher) {
        this.id = id;
        this.name = name;
        this.numStudent = numStudent;
        this.time = time;
        this.site = site;
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
    }

    public ClassVO(Long id, String name, int numStudent, String time, String site, int calling, String roster, ProportionsVO proportions) {
        this.id = id;
        this.name = name;
        this.numStudent = numStudent;
        this.time = time;
        this.site = site;
        this.calling = calling;
        this.roster = roster;
        this.proportions = proportions;
    }

    public ClassVO(Long id, String name, int numStudent, String time, String site, int calling, String roster, ProportionsVO proportions, String courseName, String courseTeacher) {
        this.id = id;
        this.name = name;
        this.numStudent = numStudent;
        this.time = time;
        this.site = site;
        this.calling = calling;
        this.roster = roster;
        this.proportions = proportions;
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
    }



    @Override
	public String toString() {
		return "ClassVO [id=" + id + ", name=" + name + ", numStudent=" + numStudent + ", time=" + time + ", site="
				+ site + ", calling=" + calling + ", roster=" + roster + ", proportions=" + proportions
				+ ", courseName=" + courseName + ", courseTeacher=" + courseTeacher + "]";
	}

	public int getCalling() {
        return calling;
    }

    public void setCalling(int calling) {
        this.calling = calling;
    }

    public String getRoster() {
        return roster;
    }

    public void setRoster(String roster) {
        this.roster = roster;
    }

    public ProportionsVO getProportions() {
        return proportions;
    }

    public void setRule(ProportionsVO proportions) {
        this.proportions = proportions;
    }

    public int getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(int numStudent) {
        this.numStudent = numStudent;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
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
