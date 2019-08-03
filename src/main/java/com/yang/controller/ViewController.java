package com.yang.controller;

import com.yang.dao.ArticleDao;
import com.yang.entity.ArticleInfo;
import com.yang.service.CommonService;
import com.yang.util.MarkdownToHtml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.controller
 * @email 397600342@qq.com
 * @date 2018/4/3
 */
@Controller
@RequestMapping("/view")
public class ViewController {

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private CommonService commonService;

    @GetMapping("/{id}")
    public String viewArticle(Model model, @PathVariable int id) {
        //1.文章格式转换
        ArticleInfo articleInfo = articleDao.viewArticleById(id);
        articleInfo.setArticleContent(MarkdownToHtml.markDownToHtml(articleInfo.getArticleContent()));
        //2.文章标签查询
        articleInfo.setTagInfoList(commonService.getTagByArticleId(articleInfo.getArticleId()));
        //3.将封装好的ArticleInfo返回前台
        model.addAttribute("articleInfo", articleInfo);
        return "article";
    }

}
