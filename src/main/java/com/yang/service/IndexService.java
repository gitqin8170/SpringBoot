package com.yang.service;

import com.yang.dao.ArticleDao;
import com.yang.entity.ArticleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.interceptor
 * @email yangyang@dalaoyang.cn
 * @date 2018/6/1
 */
@Component
public class IndexService {

    @Autowired
    private ArticleDao articleDao;

    @Cacheable(value = "index", key = "#page")
    public List<ArticleInfo> getArticleByPage(int page) {
        return articleDao.getArticleByPage(page);
    }

    @Cacheable(value = "indexCount")
    public int getArticleCount() {
        return articleDao.getArticleCount();
    }

}
