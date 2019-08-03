package com.yang.dao;

import com.yang.entity.TagInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.dao
 * @email 397600342@qq.com
 * @date 2018/4/3
 */
@Mapper
public interface TagDao {

    /***
     * getTagList
     * @author dalaoyang
     * @date 2018/11/15
     * @return : java.util.List<com.yang.entity.TagInfo>
     */
    List<TagInfo> getTagList();

    /***
     * getTagByArticleId
     * @author dalaoyang
     * @date 2018/11/15
     * @param articleId :
     * @return : java.util.List<com.yang.entity.TagInfo>
     */
    List<TagInfo> getTagByArticleId(Integer articleId);

}
