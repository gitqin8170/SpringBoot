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
 * @email 397600342@qq.com
 * @date 2018/3/2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebsiteSystemInfo  implements Serializable {

    private static final long serialVersionUID = 3686636427002303767L;
    int totalWebsiteVisits;
    int todayWebsiteVisits;
    int monthWebsiteVisits;
    int id;
}
