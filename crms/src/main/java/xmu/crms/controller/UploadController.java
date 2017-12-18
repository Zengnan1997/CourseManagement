package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.vo.URLVO;

@RestController
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping(value = "/avatar",method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Object studentChooseClass(){
        return new URLVO("/avatar/3486.png");
    }
}
