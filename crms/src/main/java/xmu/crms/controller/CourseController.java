package xmu.crms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.vo.ClassVO;
import xmu.crms.vo.CourseVO;
import xmu.crms.vo.SeminarGradeDetailVO;
import xmu.crms.vo.SeminarVO;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Object getCourses() {
        return new CourseVO[]{
                new CourseVO(1L, "OOAD", 3, 60, "2017-09-01", "2018-01-01"),
                new CourseVO(2L, "J2EE", 1, 60, "2017-09-01", "2018-01-01")
        };
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Object createCourse() {
        return new Object() {
            public Long id = 5L;
        };
    }

    @RequestMapping(value = "/{courseId}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Object getCourse(@PathVariable("courseId") Long courseId) {
        return new CourseVO(courseId, "OOAD", "面向对象分析与设计", "邱明", "mingqiu@xmu.edu.cn");
    }

    @RequestMapping(value = "/{courseId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void modifyCourse(@PathVariable("courseId") int courseId) {
        return;
    }

    @RequestMapping(value = "/{courseId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteCourse(@PathVariable("courseId") int courseId) {
        return;
    }

    @RequestMapping(value = "/{courseId}/class", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Object getClassesOfCourse(@PathVariable("courseId") int courseId) {

        return new ClassVO[]{
        		new ClassVO(45L, "周三1-2节"),
        		new ClassVO(48L, "周三3-4节")
        };
    }

    @RequestMapping(value = "/{courseId}/class", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Object createClassForCourse(@PathVariable("courseId") int courseId) {

        return new Object() {
            public Long id = 5L;
        };
    }

    @RequestMapping(value = "/{courseId}/seminar", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Object getSeminarsOfCourse(@PathVariable("courseId") int courseId) {

        return new SeminarVO[]{
                new SeminarVO(29L, "界面原型设计", "界面原型设计", "fixed", "2017-09-25", "2017-10-09",5),
                new SeminarVO(32L, "概要设计", "模型层与数据库设计", "fixed", "2017-10-10", "2017-10-24",4)
        };
    }

    @RequestMapping(value = "/{courseId}/seminar", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Object createSeminarForCourse(@PathVariable("courseId") int courseId) {

        return new Object() {
            public Long id = 2L;
        };
    }
    
    @RequestMapping(value = "/{courseId}/seminar/current", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Object getCurrentSeminarsOfCourse(@PathVariable("courseId") int courseId) {
    	List<ClassVO> classes=new ArrayList<ClassVO>();
    	classes.add(new ClassVO(45L, "周三1-2节"));
    	classes.add(new ClassVO(56L, "周三3-4节"));
        return new SeminarVO(29L, "界面原型设计", "界面原型设计", "fixed", "2017-09-25", "2017-10-09",classes);
    }

    @RequestMapping(value = "/{courseId}/grade", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Object getSeminarsGrade(@PathVariable("courseId") int courseId) {

        return new SeminarGradeDetailVO[]{
                new SeminarGradeDetailVO("需求分析", "3A2", "张三", 3, 4,4),
                new SeminarGradeDetailVO("界面原型设计", "3A3", "张三", 4, 4,4)
        };
    }
}
