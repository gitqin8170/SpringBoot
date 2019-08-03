package com.yang.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.entity
 * @email yangyang@dalaoyang.cn
 * @date 2018/12/15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebsiteAccessInfo implements Serializable {

    private static final long serialVersionUID = 8368920608346637109L;
    private Integer id;
    private Date accessDate;
    private Integer accessCount;

    public Date getAccessDate() {
        Date date = accessDate;
        return date;
    }

    public void setAccessDate(Date accessTime) {
        this.accessDate = (Date) accessTime.clone();
    }

}
