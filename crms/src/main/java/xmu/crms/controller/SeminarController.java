package xmu.crms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import xmu.crms.vo.GroupVO;
import xmu.crms.vo.MemberVO;
import xmu.crms.vo.MySeminarVO;
import xmu.crms.vo.ProportionsVO;
import xmu.crms.vo.SeminarDetailVO;
import xmu.crms.vo.SeminarVO;
import xmu.crms.vo.StatusVO;
import xmu.crms.vo.TopicVO;

@RestController
@RequestMapping("/seminar")
public class SeminarController {
	/*按ID获取讨论课*/
	@RequestMapping(value = "/{seminarId}",method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public Object getSeminar(@PathVariable("seminarId") int seminarId)
	{
		List<TopicVO> topics = new ArrayList<TopicVO>();
		topics.add(new TopicVO((long) 257,"A","领域模型和模块","Domain model与模块划分",
				5,6,2));
		ProportionsVO proportions = new ProportionsVO(50,50,20,60,20);
		return new SeminarVO((long) 32,"概要设计","模型层与数据库设计","fixed",
				"2017-10-10","2017-10-24",topics,proportions);
	}
	/*按ID修改讨论课*/
	@RequestMapping(value = "/{seminarId}",method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public Object ModifySeminar(@PathVariable("seminarId") int seminarId)
	{
		return null;
	}
	/*按ID删除讨论课*/
	@RequestMapping(value = "/{seminarId}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public Object DeleteSeminar(@PathVariable("seminarId") int seminarId)
	{
		return null;
	}
	/*按ID获取与学生有关的讨论课信息*/
	@RequestMapping(value = "/{seminarId}/my", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public MySeminarVO GetSeminarAboutStudent(@PathVariable("seminarId") int seminarId)
	{
		
		return new MySeminarVO(32,"概要设计","random","OOAD","2017-10-11","2017-10-24",23,
				true,true);
	}
	/*按ID获取讨论课详情*/
	@RequestMapping(value = "/{seminarId}/detail", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public SeminarDetailVO GetSeminarDetail(@PathVariable("seminarId") int seminarId)
	{
		return new SeminarDetailVO(32,"概要设计","2017-10-10","2017-10-24","海韵201"
				,"邱明","mingqiu@xmu.edu.cn");
	}
	
	/*
	 * 按ID获取讨论课的话题*/
	@RequestMapping(value = "/{seminarId}/topic", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<TopicVO> GetSeminarTopics(@PathVariable("seminarId") int seminarId)
	{
		List<TopicVO> topics = new ArrayList<TopicVO>();
		topics.add(new TopicVO((long) 257, "A", "领域模型与模块", "Domain model与模块划分", 
				5, 6, 2));
		return topics;
	}
	/*
	 * 在指定的ID的讨论课创建话题
	 */
	@RequestMapping(value = "/{seminarId}/topic", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public String CreateTopic(@PathVariable("seminarId") int seminarId)
	{
		return null;
	}
	
	/*
	 * 按讨论课ID查找小组*/
	@RequestMapping(value = "/{seminarId}/group", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<GroupVO> GetGroup(@PathVariable("seminarId") int seminarId)
	{
		List<GroupVO> groups = new ArrayList<GroupVO>();
		List<MemberVO> members = new ArrayList<MemberVO>();
		List<TopicVO> topics = new ArrayList<TopicVO>();
		topics.add(new TopicVO((long) 257,"A","领域模型和模块","Domain model",5,6,2));
//		List<TopicVO> topics2 = new ArrayList<TopicVO>();
//		topics2.add(new TopicVO((long) 257,"A","领域模型和模块","Domain model",5,6,2));
		members.add(new MemberVO((long) 243002,"qiqi"));
		members.add(new MemberVO((long) 243003,"ququ"));
		groups.add(new GroupVO((long) 28,"1A1",new MemberVO((long) 243001,"haha"),members,
				topics,"模型层xxx"));
		groups.add(new GroupVO((long) 29,"1A2",new MemberVO((long) 243004,"haha"),members,
				topics,"模型层xxxqqq"));
		return groups;
	}
	/*
	 * 按讨论课ID获取学生所在小组详情
	 * */
	@RequestMapping(value = "/{seminarId}/group/my", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public GroupVO GetGroupDetail(@PathVariable("seminarId") int seminarId)
	{
		MemberVO leader = new MemberVO((long) 8888,"张三");
		List<MemberVO> members = new ArrayList<MemberVO>();
		members.add(new MemberVO((long) 5324,"李四"));
		members.add(new MemberVO((long) 5678,"王五"));
		List<TopicVO> topics = new ArrayList<TopicVO>();
		topics.add(new TopicVO((long) 257,"A","领域模型和模块","Domain model",5,6,2));
		return new GroupVO((long) 28,"2A1",leader,members,topics,"模型层xxxqqq");
	}
	/*
	 * 按ID获取讨论课班级签到，分组状态
	 */
	@RequestMapping(value = "/{seminarId}/class/{classId}/attendance",
			method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public StatusVO GetStatus(@PathVariable("classId") int classId)
	{
		return new StatusVO(40,60,"calling","grouping");
	}
	/*
	 * 按ID获取讨论课班级已签到名单
	 */
	@RequestMapping(value = "/{seminarId}/class/{classId}/attendance/present", 
			method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<MemberVO> GetPresentList(@PathVariable("seminarId") int seminarId,
			@PathVariable("classId") int classId)
	{
		List<MemberVO> members = new ArrayList<MemberVO>();
		members.add(new MemberVO((long) 2357,"张三"));
		members.add(new MemberVO((long) 8232,"李四"));
		return members;
	}
	/*
	 * 按ID获取讨论课班级迟到名单
	 */
	@RequestMapping(value = "/{seminarId}/class/{classId}/attendance/late", 
			method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<MemberVO> GetLateList(@PathVariable("seminarId") int seminarId,
			@PathVariable("classId") int classId)
	{
		List<MemberVO> members = new ArrayList<MemberVO>();
		members.add(new MemberVO((long) 3412,"王五"));
		members.add(new MemberVO((long) 5234,"王七九"));
		return members;
	}
	/*
	 * 按ID获取讨论课班级缺勤名单
	 */
	@RequestMapping(value = "/{seminarId}/class/{classId}/attendance/absent", 
			method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<MemberVO> GetAbsentList(@PathVariable("seminarId") int seminarId,
			@PathVariable("classId") int classId)
	{
		List<MemberVO> members = new ArrayList<MemberVO>();
		members.add(new MemberVO((long) 34,"张六"));
		return members;
	}
	/*
	 * 签到
	 */
	@RequestMapping(value = "/{seminarId}/class/{classId}/attendance/studentId", 
			method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public String GetAbsentList(@PathVariable("seminarId") int seminarId,
			@PathVariable("classId") int classId,@PathVariable("studentId") int studentId)
	{
		return "late";
	}
}
























