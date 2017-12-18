package xmu.crms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import xmu.crms.vo.CourseVO;
import xmu.crms.vo.GroupGradeVO;
import xmu.crms.vo.GroupVO;
import xmu.crms.vo.MemberVO;
import xmu.crms.vo.PresentationGradeVO;
import xmu.crms.vo.TopicVO;

/**
 * @author YangYouran
 * @date 2017-12-4
 */

@RestController
@RequestMapping("/group")
public class GroupController {

    @RequestMapping(value = "/{groupId}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Object getGroup(@PathVariable("groupId") Long groupId) {
    	MemberVO leader=new MemberVO(8888L,"张三");
    	List<MemberVO> members=new ArrayList<MemberVO>();
    	members.add(new MemberVO(5324L,"李四"));
    	members.add(new MemberVO(5678L,"王五"));
    	List<TopicVO> topics=new ArrayList<TopicVO>();
    	topics.add(new TopicVO(257L,"领域模型"));
    	return new GroupVO(1L,leader,members,topics,"report");
    }

    @RequestMapping(value = "/{groupId}/resign", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void resign(@PathVariable("groupId") Long groupId) {
    	return;
    }
    
    @RequestMapping(value = "/{groupId}/assign", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void assign(@PathVariable("groupId") Long groupId) {
        return;
    }
    
    @RequestMapping(value = "/{groupId}/add", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addMember(@PathVariable("groupId") Long groupId) {
        return;
    }
    
    @RequestMapping(value = "/{groupId}/remove", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeMember(@PathVariable("groupId") Long groupId) {
        return;
    }
    
    @RequestMapping(value = "/{groupId}/topic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public String chooseTopic(@PathVariable("groupId") Long groupId) {
        return "{\"url\": \"/group/"+27+"/topic/"+23+"\"}";
    }

    @RequestMapping(value = "/{groupId}/topic/{topicId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteTopic(@PathVariable("groupId") Long groupId,
                              @PathVariable("topicId") Long topicId) {
        return;
    }
    
    @RequestMapping(value = "/{groupId}/grade", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Object getGrade(@PathVariable("groupId") Long groupId) {
    	List<PresentationGradeVO> presentationGradeList=new ArrayList<PresentationGradeVO>();
    	presentationGradeList.add(new PresentationGradeVO(257L,4));
    	presentationGradeList.add(new PresentationGradeVO(258L,5));
    	GroupGradeVO groupGrade=new GroupGradeVO(presentationGradeList,3,4);
    	return groupGrade;
    }
    
    @RequestMapping(value = "/{groupId}/grade/report", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void setReportGrade(@PathVariable("groupId") Long groupId) {
        return;
    }
    
    @RequestMapping(value = "/{groupId}/grade/presentation/{studentId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void setPresentationGrade(@PathVariable("groupId") Long groupId,
    									@PathVariable("studentId") Long studentId) {
        return;
    }

}
