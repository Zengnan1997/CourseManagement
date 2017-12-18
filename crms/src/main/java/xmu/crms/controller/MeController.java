package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.vo.SchoolVO;
import xmu.crms.vo.UserVO;

@RestController
@RequestMapping(value = "/me")
public class MeController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Object getMe() {
        SchoolVO school=new SchoolVO(32L,"厦门大学");
        return new UserVO(3486L,"student","张三","23320152202333","18911114514","23320152202333@stu.xmu.edu.cn","male",school,"","/avatar/3486.png");
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void modifyMe() {
        return;
    }
}
