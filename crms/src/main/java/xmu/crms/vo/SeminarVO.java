package xmu.crms.vo;

import java.util.List;

/**
 * @author ZengNan
 * @date 2017-12-4
 */
public class SeminarVO {

    private Long id;
    private String name;
    private String description;
    private String groupingMethod;
    private String startTime;
    private String endTime;
    private List<TopicVO> topics;
    private ProportionsVO proportions;
    private List<ClassVO> classes;
    private Integer grade;

	public SeminarVO(Long id, String name, String description, String groupingMethod, String startTime, String endTime,
			List<TopicVO> topics, ProportionsVO proportions, List<ClassVO> classes, Integer grade) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.groupingMethod = groupingMethod;
		this.startTime = startTime;
		this.endTime = endTime;
		this.topics = topics;
		this.proportions = proportions;
		this.classes = classes;
		this.grade = grade;
	}

	public SeminarVO(Long id, String name, String description, String groupingMethod, String startTime, String endTime,
			List<ClassVO> classes) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.groupingMethod = groupingMethod;
		this.startTime = startTime;
		this.endTime = endTime;
		this.classes = classes;
	}

	public SeminarVO(Long id, String name, String description, String groupingMethod, String startTime, String endTime,
			Integer grade) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.groupingMethod = groupingMethod;
		this.startTime = startTime;
		this.endTime = endTime;
		this.grade = grade;
	}

	public SeminarVO(Long id, String name, String description,
			String groupingMethod, String startTime, String endTime,
			List<TopicVO> topics, ProportionsVO proportions) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.groupingMethod = groupingMethod;
		this.startTime = startTime;
		this.endTime = endTime;
		this.topics = topics;
		this.proportions = proportions;
	}

	@Override
    public String toString() {
        return "SeminarVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", groupingMethod='" + groupingMethod + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", topics='"+ topics + '\'' +
                ", ProportionsVO='"+ proportions + '\'' +
                ", ClassVO='"+ classes + '\'' +
                ", grade='"+ grade + '\'' +
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupingMethod() {
        return groupingMethod;
    }

    public void setGroupingMethod(String groupingMethod) {
        this.groupingMethod = groupingMethod;
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
    
    public List<TopicVO> getTopics()
    {
    	return this.topics;
    }
    
    public void setTopics(List<TopicVO> topics)
    {
    	this.topics = topics;
    }
    
    public ProportionsVO getProportions()
    {
    	return proportions;
    }
    
    public void setProportions(ProportionsVO proportions)
    {
    	this.proportions = proportions;
    }

	public List<ClassVO> getClasses() {
		return classes;
	}

	public void setClasses(List<ClassVO> classes) {
		this.classes = classes;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}
}
