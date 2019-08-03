package com.yang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author dalaoyang
 * @Description
 * @project dalaoyangblog
 * @package com.yang.entity
 * @email yangyang@dalaoyang.cn
 * @date 2018/5/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebsiteSystemProperty implements Serializable {

    private static final long serialVersionUID = 7072433146386221989L;
    private String websiteUrl;
    private String websiteName;
    private String domainName;
    private String beianNumber;
    private String wechatName;
    private String weiboUrl;
    private String giteeUrl;
    private String emailUrl;
    private String csdnUrl;
    private String blogUrl;
    private String jianshuUrl;
    private String gongzhonghaoName;
    private String gongzhonghaoTrueName;
}
