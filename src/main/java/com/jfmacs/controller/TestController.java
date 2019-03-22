package com.jfmacs.controller;

import com.jfmacs.pojo.User;
import com.jfmacs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JFMACS
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("getUser")
    public Map<String,Object> getUser(HttpServletRequest request) {
        Map<String, Object> resultMap = new HashMap<>();
        String test = request.getParameter("mess");
        System.out.println(test);
        resultMap.put("userList", userService.selectAllUser());
        resultMap.put("success", true);
        return resultMap;
    }

}
