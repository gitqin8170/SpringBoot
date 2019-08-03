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
 * @date 2018/4/3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagInfo  implements Serializable {

    private static final long serialVersionUID = -9100665445890165660L;
    private int tagId;
    private String tagName;
    private boolean isIncloud;
}
