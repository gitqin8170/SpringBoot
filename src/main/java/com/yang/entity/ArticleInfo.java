package com.yang.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.entity
 * @email 397600342@qq.com
 * @date 2018/4/3
 */
@Data
@NoArgsConstructor
public class ArticleInfo implements Serializable {

    private static final long serialVersionUID = 8838467062619839055L;

    private int articleId;
    private String articleName;
    private String articleContent;
    private String articleAuthors;
    private Date articleInputDate;
    private int articleReadingTime;
    private String articleIsTop;
    private String articleTag;
    private int articleImgNo;
    private String articleIsRelease;
    private List<TagInfo> tagInfoList;

    public Date getArticleInputDate() {
        Date date = articleInputDate;
        return date;
    }

    public void setArticleInputDate(Date articleInputDate) {
        this.articleInputDate = (Date) articleInputDate.clone();
    }

    public ArticleInfo(int articleId, String articleName, String articleContent, String articleAuthors, Date articleInputDate, int articleReadingTime, String articleIsTop, int articleImgNo, String articleTag, String articleIsRelease, List<TagInfo> tagInfoList) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.articleContent = articleContent;
        this.articleAuthors = articleAuthors;
        this.articleInputDate = (Date) articleInputDate.clone();
        this.articleReadingTime = articleReadingTime;
        this.articleIsTop = articleIsTop;
        this.articleImgNo = articleImgNo;
        this.articleTag = articleTag;
        this.articleIsRelease = articleIsRelease;
        this.tagInfoList = tagInfoList;
    }
}
