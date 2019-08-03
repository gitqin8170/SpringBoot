package com.yang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.entity
 * @email yangyang@dalaoyang.cn
 * @date 2018/5/17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkInfo implements Serializable {

    private static final long serialVersionUID = -1495780033261643512L;
    private int linkId;
    private String linkName;
    private String linkUrl;
    private String remark;
}
