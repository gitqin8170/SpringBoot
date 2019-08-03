package com.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.controller
 * @email 397600342@qq.com
 * @date 2018/4/2
 */
@Controller
public class ContactController {

    @RequestMapping(value = "/contact")
    public String contact() {
        return "contact";
    }
}
