package com.yang.timer;

import com.yang.dao.WebsiteAccessInfoDao;
import com.yang.dao.WebsiteSystemInfoDao;
import com.yang.entity.WebsiteSystemInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author dalaoyang
 * @Description 每日或者每月更新访问量定时任务
 * @project dalaoyang
 * @package com.yang.timer
 * @email 397600342@qq.com
 * @date 2018/3/2
 */
@Component
public class WebSiteTimer {

    @Autowired
    private WebsiteSystemInfoDao websiteSystemInfoDao;

    @Autowired
    private WebsiteAccessInfoDao websiteAccessInfoDao;

    @Scheduled(cron = "0 0 0 1/1 * ?")
    private void updateTodayWebsiteVisits() {
        WebsiteSystemInfo websiteSystemInfo = websiteSystemInfoDao.getWebsiteSystemInfo();
        websiteAccessInfoDao.saveTodayWebsiteAccessInfo(websiteSystemInfo.getTodayWebsiteVisits());
        websiteSystemInfoDao.updateTodayWebsiteVisits();
    }

    @Scheduled(cron = "0 0 0 1 * ?")
    private void updateMonthWebsiteVisits() {
        websiteSystemInfoDao.updateMonthWebsiteVisits();
    }

}
