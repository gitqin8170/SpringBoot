package com.yang.controller;

import com.yang.dao.ArticleDao;
import com.yang.entity.ArticleInfo;
import com.yang.service.CommonService;
import com.yang.util.MarkdownToHtml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.controller
 * @email 397600342@qq.com
 * @date 2018/4/2
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private CommonService commonService;

    @GetMapping(value = "/article/{id}")
    public String articleInfo(Model model, @PathVariable int id) {
        //1.更改文章阅读次数
        articleDao.updateArticleReadingTime(id);
        ArticleInfo articleInfo = articleDao.getArticleInfoById(id);
        //2.文章格式转换
        articleInfo.setArticleContent(MarkdownToHtml.markDownToHtml(articleInfo.getArticleContent()));
        //3.文章标签查询
        articleInfo.setTagInfoList(commonService.getTagByArticleId(articleInfo.getArticleId()));
        //4.将封装好的ArticleInfo返回前台
        model.addAttribute("articleInfo", articleInfo);
        return "article";
    }
}
