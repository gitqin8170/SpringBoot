package com.yang.controller;

import com.yang.dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class AboutController {

    @Autowired
    private ArticleDao articleDao;

    @RequestMapping(value = "/about")
    public String about(Model model) {
        //1.将about页面内容返回前台
        model.addAttribute("articleInfo", articleDao.viewArticleById(3));
        return "about";
    }
}
