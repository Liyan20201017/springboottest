package com.zkr.test.controller;

import com.zkr.test.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author: liyan
 * @date: 2020-12-01 9:41
 * @description:
 */
@Controller
public class TestController {

    @Autowired
    private IService iService;

    @RequestMapping("show")
    @ResponseBody
    public List<Map> show(){
        System.out.println("show");
        return iService.show();
    }

    @RequestMapping("shows")
    public String shows(HttpServletRequest request){
        System.out.println("shows");
        request.setAttribute("shows",iService.show());
        return "show";
    }


}
