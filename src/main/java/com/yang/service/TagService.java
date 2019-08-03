package com.yang.service;

import com.yang.dao.ArticleDao;
import com.yang.entity.ArticleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.interceptor
 * @email yangyang@dalaoyang.cn
 * @date 2018/6/1
 */
@Component
public class TagService {

    @Autowired
    private ArticleDao articleDao;

    @Cacheable(value = "tagname", key = "#tagName")
    public List<ArticleInfo> getArticleListByTagNamePage(Map map, String tagName) {
        return articleDao.getArticleListByTagNamePage(map);
    }

    @Cacheable(value = "tagCount", key = "#tagName")
    public int getArticleByTagCount(String tagName) {
        return articleDao.getArticleByTagCount(tagName);
    }
}
