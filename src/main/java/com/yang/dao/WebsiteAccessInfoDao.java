package com.yang.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.dao
 * @email yangyang@dalaoyang.cn
 * @date 2018/12/15
 */
@Mapper
public interface WebsiteAccessInfoDao {

    void saveTodayWebsiteAccessInfo(Integer accessCount);
}
