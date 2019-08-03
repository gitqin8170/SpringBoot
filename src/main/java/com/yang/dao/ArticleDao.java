package com.yang.dao;

import com.yang.entity.ArticleInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.dao
 * @email 397600342@qq.com
 * @date 2018/4/3
 */
@Mapper
public interface ArticleDao {

    /***    
     * getArticleInfoById
     * @author dalaoyang
     * @date 2018/11/15
     * @param id : 
     * @return : com.yang.entity.ArticleInfo 
     */ 
    ArticleInfo getArticleInfoById(int id);

    /***    
     * updateArticleReadingTime
     * @author dalaoyang
     * @date 2018/11/15
     * @param id : 
     * @return : void 
     */ 
    void updateArticleReadingTime(int id);

    /***    
     * getArticleByPage
     * @author dalaoyang
     * @date 2018/11/15
     * @param pageNumber : 
     * @return : java.util.List<com.yang.entity.ArticleInfo> 
     */ 
    List<ArticleInfo> getArticleByPage(int pageNumber);

    /***
     * getArticleCount
     * @author dalaoyang
     * @date 2018/11/15

     * @return : int
     */
    int getArticleCount();

    /***
     * getArticleListByTagNamePage
     * @author dalaoyang
     * @date 2018/11/15
     * @param map :
     * @return : java.util.List<com.yang.entity.ArticleInfo>
     */
    List<ArticleInfo> getArticleListByTagNamePage(Map map);

    /***
     * getArticleByTagCount
     * @author dalaoyang
     * @date 2018/11/15
     * @param tagName :
     * @return : int
     */
    int getArticleByTagCount(String tagName);

    /***
     * viewArticleById
     * @author dalaoyang
     * @date 2018/11/15
     * @param id :
     * @return : com.yang.entity.ArticleInfo
     */
    ArticleInfo viewArticleById(int id);

    /***
     * getArticleListByWord
     * @author dalaoyang
     * @date 2018/11/15
     * @param map :
     * @return : java.util.List<com.yang.entity.ArticleInfo>
     */
    List<ArticleInfo> getArticleListByWord(Map map);

    /***
     * getArticleListByWordCount
     * @author dalaoyang
     * @date 2018/11/15
     * @param map :
     * @return : int
     */
    int getArticleListByWordCount(Map map);

    /**
     * getCommonArticleList
     * @author dalaoyang
     * @return java.util.List<com.yang.entity.ArticleInfo>
     */
    List<ArticleInfo> getCommonArticleList();
}
