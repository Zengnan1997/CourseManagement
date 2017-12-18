package xmu.crms.vo;

public class CourseVO {
    private Long id;
    private String name;
    private Integer numClass;
    private Integer numStudent;
    private String startTime;
    private String endTime;
    private String description;
    private String teacherName;
    private String teacherEmail;
    
    public CourseVO(Long id, String name, Integer numClass, Integer numStudent, String startTime, String endTime) {
		super();
		this.id = id;
		this.name = name;
		this.numClass = numClass;
		this.numStudent = numStudent;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public CourseVO(Long id, String name, String description, String teacherName, String teacherEmail) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.teacherName = teacherName;
		this.teacherEmail = teacherEmail;
	}

	public CourseVO(Long id, String name, Integer numClass, Integer numStudent, String startTime, String endTime,
			String description, String teacherName, String teacherEmail) {
		super();
		this.id = id;
		this.name = name;
		this.numClass = numClass;
		this.numStudent = numStudent;
		this.startTime = startTime;
		this.endTime = endTime;
		this.description = description;
		this.teacherName = teacherName;
		this.teacherEmail = teacherEmail;
	}

	@Override
    public String toString() {
        return "CourseVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numClass=" + numClass +
                ", numStudent=" + numStudent +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", description='" + description + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherEmail='" + teacherEmail + '\'' +
                '}';
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

    public Integer getNumClass() {
        return numClass;
    }

    public void setNumClass(Integer numClass) {
        this.numClass = numClass;
    }

    public Integer getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(Integer numStudent) {
        this.numStudent = numStudent;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
}
