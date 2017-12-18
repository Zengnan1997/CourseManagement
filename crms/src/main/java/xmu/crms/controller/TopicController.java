package xmu.crms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import xmu.crms.vo.TopicVO;
import xmu.crms.vo.TopicGroupVO;

@RestController
@RequestMapping("/topic")
public class TopicController {
	
	 	@RequestMapping(value = "/{topicId}", method = RequestMethod.GET)
	 	@ResponseStatus(value = HttpStatus.OK)
	    public Object getTopic(@PathVariable("topicId") Long topicId) {
	    	Long id = 2324L;
	    	String serial = "Topic A";
	    	String name = "领域模型";
	    	String description = "领域模型的描述。。。。";
	    	int groupLimit = 5;
	    	int groupMemberLimit = 5;
	    	int groupLeft = 3;
	    	return new TopicVO(id,serial,name,description,groupLimit,groupMemberLimit,groupLeft);
	    }

	    @RequestMapping(value = "/{topicId}", method = RequestMethod.PUT)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void modifyTopic(@PathVariable("topicId") int topicId) {
	    	return ;
	    }
	    
	    @RequestMapping(value = "/{topicId}", method = RequestMethod.DELETE)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void deleteTopic(@PathVariable("topicId") int topicId) {
	        return ;
	    }
	    
	    
	    @RequestMapping(value = "/{topicId}/group", method = RequestMethod.GET)
	    @ResponseStatus(value = HttpStatus.OK)
	    public List getSelectedTopicGroup(@PathVariable("topicId") int topicId) {
	        List<TopicGroupVO> groupNameList = new ArrayList<TopicGroupVO>();
	        TopicGroupVO group1 = new TopicGroupVO(123L,"1A1");
	        TopicGroupVO group2 = new TopicGroupVO(123L,"2A1");
	        groupNameList.add(group1);
	        groupNameList.add(group2);
	    	return groupNameList;
	    }
	    
}
