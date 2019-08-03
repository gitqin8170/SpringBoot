/*
 Navicat Premium Data Transfer

 Source Server         : dalaoyang-dev
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : dalaoyang

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 03/04/2019 10:03:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ARTICLE_INFO
-- ----------------------------
DROP TABLE IF EXISTS `ARTICLE_INFO`;
CREATE TABLE `ARTICLE_INFO` (
  `ARTICLE_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ARTICLE_NAME` varchar(1000) DEFAULT NULL COMMENT '文章名称',
  `ARTICLE_CONTENT` text COMMENT '文章内容',
  `ARTICLE_AUTHORS` varchar(1000) DEFAULT NULL COMMENT '文章作者',
  `ARTICLE_INPUT_DATE` date DEFAULT NULL COMMENT '文章录入日期',
  `ARTICLE_READING_TIME` int(11) DEFAULT NULL COMMENT '文章阅读次数',
  `ARTICLE_IS_TOP` varchar(1) DEFAULT NULL COMMENT '是否置顶',
  `ARTICLE_TAG` varchar(100) DEFAULT NULL COMMENT '文章标签',
  `ARTICLE_IS_RELEASE` varchar(1) DEFAULT NULL COMMENT '文章是否发布',
  PRIMARY KEY (`ARTICLE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ARTICLE_INFO
-- ----------------------------
BEGIN;
INSERT INTO `ARTICLE_INFO` VALUES (1, '使用IntelliJ Idea新建SpringBoot项目', '简单给大家介绍一下我来创建SpringBoot项目使用的工具，本人使用IntelliJ Idea来创建项目，利用其中的Spring Initializr工具来快速创建项目。\n\n步骤如下：\n\n菜单栏中选择File--New--Project，出现如下图所示，然后选择Spring Initializr。\n\n其中SDK可以根据自己需求选择合适的jdk版本，本人项目均使用的Jdk1.8\n\nService Url 是Spring官方提供的Spring Initializr工具地址。\n\n\n![](https://user-gold-cdn.xitu.io/2018/3/11/16214b82d3c9983d?w=1752&h=1414&f=jpeg&s=153372)\n\n然后点击Next，进入下面页面，其中以下各项内容与创建maven项目填写相同。\n\n\n![](https://user-gold-cdn.xitu.io/2018/3/11/16214b885a312afa?w=1744&h=1414&f=jpeg&s=140889)\n\n点击Next，如下图所示，可以配置SpringBoot项目或SpringCloud项目各种依赖，需要注意的是，SpringBoot旁边的2.0.0是自己需要使用的SpringBoot版本，根据自己的需求选择。\n\n\n![](https://user-gold-cdn.xitu.io/2018/3/11/16214b8cb27b7af1?w=1748&h=1416&f=jpeg&s=166239)\n\n\n选择依赖和版本后，点击Next进入下图所示。设置项目名称，以及项目存储位置。\n\n\n![](https://user-gold-cdn.xitu.io/2018/3/11/16214b94e23c0fc6?w=1744&h=1418&f=jpeg&s=104642)\n\n以上都设置完成后，点击Finish。\n\n进入项目后，启动项目就可以看到SpringBoot项目启动后的标志Banner，第一个SpringBoot项目就这样搭建完成了。\n\n\n![](https://user-gold-cdn.xitu.io/2018/3/11/16214b9ae25ddf6c?w=2416&h=506&f=jpeg&s=239423)\n\n\n个人网站：[http://dalaoyang.cn]()', 'dalaoyang', '2018-04-02', 1, 'Y', '1', 'Y');
COMMIT;

-- ----------------------------
-- Table structure for LINK_INFO
-- ----------------------------
DROP TABLE IF EXISTS `LINK_INFO`;
CREATE TABLE `LINK_INFO` (
  `LINK_ID` int(11) NOT NULL AUTO_INCREMENT,
  `LINK_NAME` varchar(100) DEFAULT NULL COMMENT '链接名称',
  `LINK_URL` varchar(500) DEFAULT NULL COMMENT '链接地址',
  `REMARK` text COMMENT '备注',
  PRIMARY KEY (`LINK_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of LINK_INFO
-- ----------------------------
BEGIN;
INSERT INTO `LINK_INFO` VALUES (1, 'Spring Cloud中国社区111', 'http://www.springcloud.cn/222', '333');
COMMIT;

-- ----------------------------
-- Table structure for TAG_INFO
-- ----------------------------
DROP TABLE IF EXISTS `TAG_INFO`;
CREATE TABLE `TAG_INFO` (
  `TAG_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '标签主键id',
  `TAG_NAME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`TAG_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of TAG_INFO
-- ----------------------------
BEGIN;
INSERT INTO `TAG_INFO` VALUES (1, 'SPRINGCLOUD');
INSERT INTO `TAG_INFO` VALUES (2, 'NGINX');
INSERT INTO `TAG_INFO` VALUES (3, 'LINUX');
INSERT INTO `TAG_INFO` VALUES (4, 'JAVA');
COMMIT;

-- ----------------------------
-- Table structure for WEBSITE_SYSTEM_INFO
-- ----------------------------
DROP TABLE IF EXISTS `WEBSITE_SYSTEM_INFO`;
CREATE TABLE `WEBSITE_SYSTEM_INFO` (
  `ID` int(11) NOT NULL,
  `TOTAL_WEBSITE_VISITS` int(11) DEFAULT NULL,
  `TODAY_WEBSITE_VISITS` int(11) DEFAULT NULL,
  `MONTH_WEBSITE_VISITS` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of WEBSITE_SYSTEM_INFO
-- ----------------------------
BEGIN;
INSERT INTO `WEBSITE_SYSTEM_INFO` VALUES (1, 1608, 66, 1591);
COMMIT;

-- ----------------------------
-- Table structure for WEBSITE_SYSTEM_PROPERTY
-- ----------------------------
DROP TABLE IF EXISTS `WEBSITE_SYSTEM_PROPERTY`;
CREATE TABLE `WEBSITE_SYSTEM_PROPERTY` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `WEBSITE_URL` varchar(1000) DEFAULT NULL COMMENT '网站地址',
  `WEBSITE_NAME` varchar(1000) DEFAULT NULL COMMENT '网站名称',
  `DOMAIN_NAME` varchar(1000) DEFAULT NULL COMMENT '网站域名',
  `BEIAN_NUMBER` varchar(1000) DEFAULT NULL COMMENT '网站备案号',
  `WECHAT_NAME` varchar(1000) DEFAULT NULL COMMENT 'wechat图片地址',
  `WEIBO_URL` varchar(1000) DEFAULT NULL COMMENT '微博地址',
  `GITEE_URL` varchar(1000) DEFAULT NULL COMMENT '码云地址',
  `EMAIL_URL` varchar(1000) DEFAULT NULL COMMENT '个人邮箱地址',
  `CSDE_URL` varchar(1000) DEFAULT NULL COMMENT 'csdn地址',
  `BLOG_URL` varchar(1000) DEFAULT NULL COMMENT '其他博客地址，例如博客园等',
  `JIANSHU_URL` varchar(1000) DEFAULT NULL COMMENT '简书地址',
  `GONGZHONGHAO_NAME` varchar(1000) DEFAULT NULL COMMENT '个人公众号',
  `GONGZHONGHAO_TURENAME` varchar(1000) DEFAULT NULL COMMENT '公众号名称',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of WEBSITE_SYSTEM_PROPERTY
-- ----------------------------
BEGIN;
INSERT INTO `WEBSITE_SYSTEM_PROPERTY` VALUES (1, 'https://www.dalaoyang.cn25', 'Dalaoyang125', 'Dalaoyang.cn125', '辽ICP备17014944号-22225', 'dalaoyang.jpeg25', 'https://weibo.com/2886438580/profile?topnav=1&wvr=625', 'https://gitee.com/dalaoyang25', 'yangyang@dalaoyang.cn25', '5https://blog.csdn.net/qq_3325752725', 'http://www.cnblogs.com/dalaoyang/25', 'https://www.jianshu.com/u/128b6effde5325', 'dalaoyang_gongzhonghao.jpg25', 'dalaoyang25');
COMMIT;

-- ----------------------------
-- Table structure for article_tag
-- ----------------------------
DROP TABLE IF EXISTS `article_tag`;
CREATE TABLE `article_tag` (
  `ARTICLE_ID` int(11) NOT NULL COMMENT '文章id',
  `TAG_ID` int(11) NOT NULL COMMENT '标签id',
  PRIMARY KEY (`ARTICLE_ID`,`TAG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article_tag
-- ----------------------------
BEGIN;
INSERT INTO `article_tag` VALUES (1, 1);
COMMIT;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `ID` int(50) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  `PASSWORD` varchar(100) DEFAULT NULL COMMENT '密码',
  `TRUENAME` varchar(100) DEFAULT NULL COMMENT '真实姓名',
  `EMAIL` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `PHONE` varchar(11) DEFAULT NULL COMMENT '手机号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_user` VALUES (1, 'panbingwen', 'wenbingpan', 'admin', 'admin@dalaoyang.cn',                                '110');
COMMIT;

-- ----------------------------
-- Table structure for website_access_info
-- ----------------------------
DROP TABLE IF EXISTS `website_access_info`;
CREATE TABLE `website_access_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `ACCESS_DATE` date DEFAULT NULL COMMENT '访问日期',
  `ACCESS_COUNT` int(11) DEFAULT NULL COMMENT '访问数量',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of website_access_info
-- ----------------------------
BEGIN;
INSERT INTO `website_access_info` VALUES (1, '2018-12-15', 1517);
SET FOREIGN_KEY_CHECKS = 1;
