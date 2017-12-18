package xmu.crms.controller;

/**
 * @author ZhangChuBing
 * @date 2017-12-3
 */
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.vo.ClassVO;
import xmu.crms.vo.GroupVO;
import xmu.crms.vo.MemberVO;
import xmu.crms.vo.ProportionsVO;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {

//获取与当前用户相关的或者符合条件的班级列表
    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List getClassList(){
        List<ClassVO> classes=new ArrayList<ClassVO>();
        classes.add(new ClassVO(23L,"周三1-2节",60,"周三1-2、周五1-2","公寓405","OOAD","邱明"));
        classes.add(new ClassVO(42L,"一班",60,"周三34节、周五12节","海韵202",".Net平台开发","杨律青"));
        return classes;
    }
//按ID获取班级详情
    @RequestMapping(value = "/{classId}",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Object getClass(@PathVariable("classId") Long classId){
        String name="周三1-2节";
        int numStudent=120;
        String time="周三1-2";
        String site="公寓405";
        int calling=-1;
        String roster="/roster/周三12班.xlsx";
        ProportionsVO proportions=new ProportionsVO(50,50,20,60,20);
        return new ClassVO(23L,name,numStudent,time,site,calling,roster,proportions);
    }
//按ID修改班级
    @RequestMapping(value = "/{classId}",method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void modifyClass(@PathVariable("classId") Long classId){
        return;
    }
//按ID删除班级
    @RequestMapping(value = "/{classId}",method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteClass(@PathVariable("classId") Long classId){
        return;
    }
//按班级ID查找学生列表
    @RequestMapping(value = "/{classId}/student",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List studentClassList(@PathVariable("classId") Long classId){
        List<MemberVO>members=new ArrayList<MemberVO>();
        members.add(new MemberVO(5324L,"李四","23320152202443"));
        members.add(new MemberVO(5678L,"王五","23320152202433"));
        return members;
    }
//学生按ID选择班级
    @RequestMapping(value = "/{classId}/student",method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public String studentChooseClass(@PathVariable("classId") Long classId){
        return("{\"url\":\"/class/"+34+"/student/"+2757+"\"}");
    }
//学生按ID取消选择班级
    @RequestMapping(value = "/{classId}/student/{studentId}",method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void studentCancelClass(@PathVariable("classId") Long classId){
        return;
    }
//按ID获取自身所在班级小组
    @RequestMapping(value = "/{classId}/classgroup",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Object getClassGroup(@PathVariable("classId") Long classId){
        MemberVO leader=new MemberVO(8888L,"张三","24320152202333");
        List<MemberVO> members=new ArrayList<MemberVO>();
        members.add(new MemberVO(5324L,"李四","23320152202443"));
        members.add(new MemberVO(5678L,"王五","23320152202433"));
        return new GroupVO(leader,members);
    }
//班级小组组长辞职
    @RequestMapping(value = "/{classId}/classgroup/resign",method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void resign(){
        return;
    }
//成为班级小组组长
    @RequestMapping(value = "/{classId}/classgroup/assign",method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void assign(){
        return;
    }
//添加班级小组成员
    @RequestMapping(value = "/{classId}/classgroup/add",method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void add() {
        return;
    }
//移除成员
    @RequestMapping(value = "/{classId}/classgroup/remove",method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void remove(){
        return;
}
}
