package com.yang.service;

import com.yang.consts.Consts;
import com.yang.dao.ArticleDao;
import com.yang.dao.LinkDao;
import com.yang.dao.TagDao;
import com.yang.dao.WebsiteSystemPropertyDao;
import com.yang.entity.ArticleInfo;
import com.yang.entity.LinkInfo;
import com.yang.entity.TagInfo;
import com.yang.entity.WebsiteSystemProperty;
import com.yang.util.HtmlSpirit;
import com.yang.util.MarkdownToHtml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.service
 * @email yangyang@dalaoyang.cn
 * @date 2018/6/1
 */
@Component
public class CommonService {
    @Autowired
    private LinkDao linkDao;

    @Autowired
    private TagDao tagDao;

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private WebsiteSystemPropertyDao websiteSystemPropertyDao;

    @Cacheable(value = "WebsiteSystemProperty")
    public WebsiteSystemProperty getWebsiteSystemProperty() {
        return websiteSystemPropertyDao.getWebsiteSystemProperty();
    }

    @Cacheable(value = "tagList")
    public List<TagInfo> getTagList() {
        return tagDao.getTagList();
    }

    @Cacheable(value = "linkList")
    public List<LinkInfo> getLinkList() {
        return linkDao.getLinkList();
    }

    @Cacheable(value = "tag", key = "#articleId")
    public List<TagInfo> getTagByArticleId(Integer articleId) {
        return tagDao.getTagByArticleId(articleId);
    }

    public List<ArticleInfo> getArticleListTag(List<ArticleInfo> articleInfoList) {
        articleInfoList.forEach((article) -> {
                    String articleContent = article.getArticleContent();
                    article.setArticleContent(this.getArticleContent(articleContent));
                    article.setArticleImgNo(this.getArticleImgNo(article.getArticleId()));
                    article.setTagInfoList(this.getTagByArticleId(article.getArticleId()));
                }
        );
        return articleInfoList;
    }

    public String getArticleContent(String articleContent) {
        articleContent = MarkdownToHtml.markDownToHtml(articleContent);
        articleContent = HtmlSpirit.delHTMLTag(articleContent);
        articleContent = articleContent.length() > Consts.ARTICLE_INTRODUCTION_NUMBER ? articleContent.substring(0, Consts.ARTICLE_INTRODUCTION_NUMBER) + "..." : articleContent;
        return articleContent;
    }

    public Integer getArticleImgNo(Integer articleId) {
        int articleImgNo = articleId > Consts.PAGE_IMG ? articleId % Consts.PAGE_IMG : articleId;
        return articleImgNo <= 0 ? 1 : articleImgNo;
    }

    public List<ArticleInfo> getCommonArticleList() {
        return articleDao.getCommonArticleList();
    }
}
