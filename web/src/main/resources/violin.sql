/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : violin

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-08-29 15:04:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for company_info
-- ----------------------------
DROP TABLE IF EXISTS `company_info`;
CREATE TABLE `company_info` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `service_phone` varchar(20) DEFAULT NULL COMMENT '服务热线',
  `sale_phone` varchar(20) DEFAULT NULL COMMENT '销售热线',
  `images` varchar(255) DEFAULT NULL COMMENT '相关图片',
  `description` text COMMENT '公司简介',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dict_data
-- ----------------------------
DROP TABLE IF EXISTS `dict_data`;
CREATE TABLE `dict_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dict_code` varchar(255) DEFAULT NULL COMMENT '字典代码 ',
  `dict_name` varchar(255) DEFAULT NULL COMMENT '对应的 类型名称，木制材料，琴弦材料',
  `dict_value` varchar(255) DEFAULT NULL COMMENT '数值',
  `dict_soft` int(11) DEFAULT NULL COMMENT '排序',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for files
-- ----------------------------
DROP TABLE IF EXISTS `files`;
CREATE TABLE `files` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `file_name` varchar(100) DEFAULT NULL COMMENT '文件名称',
  `file_temp_path` varchar(100) DEFAULT NULL COMMENT '临时文件地址',
  `file_path` varchar(100) DEFAULT NULL COMMENT '文件地址',
  `module_name` varchar(100) DEFAULT NULL COMMENT '模块名称 ',
  `entity_name` varchar(30) DEFAULT NULL COMMENT '实体名称 用户头像，琴....',
  `entity_name_property` varchar(30) DEFAULT NULL COMMENT '属性名称(头像，身份证......）',
  `entity_id` int(11) DEFAULT NULL COMMENT '引用对象id',
  `content_type` varchar(50) DEFAULT NULL COMMENT '文件类型  图片 word...',
  `size` float(12,2) DEFAULT NULL COMMENT '文件大小',
  `type` int(50) DEFAULT NULL COMMENT '文件类型 临时文件0  永久文件1',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for master_info
-- ----------------------------
DROP TABLE IF EXISTS `master_info`;
CREATE TABLE `master_info` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '大师姓名',
  `images` varchar(255) DEFAULT NULL COMMENT '相关图片',
  `desciption` text COMMENT '介绍',
  `create_time` varchar(255) DEFAULT NULL COMMENT '录入日期',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '内容',
  `author` varchar(50) DEFAULT NULL COMMENT '作者',
  `is_show` int(11) DEFAULT NULL COMMENT '是否展示 0是 ，1 否',
  `is_hot` int(11) DEFAULT NULL COMMENT '特别新闻 0是 ，1 否',
  `sort` int(255) DEFAULT NULL COMMENT '排序',
  `publish_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for product_type
-- ----------------------------
DROP TABLE IF EXISTS `product_type`;
CREATE TABLE `product_type` (
  ` id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `images` varchar(255) DEFAULT NULL COMMENT '相关图片',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (` id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_account
-- ----------------------------
DROP TABLE IF EXISTS `user_account`;
CREATE TABLE `user_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_name` varchar(50) DEFAULT NULL,
  `account_pwd` varchar(50) DEFAULT NULL,
  `faile_times` int(11) DEFAULT NULL,
  `last_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `real_name` varchar(50) DEFAULT NULL COMMENT '真是姓名',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `images` varchar(255) DEFAULT NULL COMMENT '头像',
  `sex` int(11) DEFAULT NULL COMMENT '性别',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `phone` char(11) DEFAULT NULL COMMENT '联系方式',
  `register_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '注册时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for violin_info
-- ----------------------------
DROP TABLE IF EXISTS `violin_info`;
CREATE TABLE `violin_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `code` varchar(255) DEFAULT NULL COMMENT '编号',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `author` varchar(255) DEFAULT NULL COMMENT '制作大事',
  `mian_ban` varchar(255) DEFAULT NULL COMMENT '面板',
  `bei_ban` varchar(255) DEFAULT NULL COMMENT '背板',
  `ce_ban` varchar(255) DEFAULT NULL COMMENT '侧板',
  `you_qi` varchar(255) DEFAULT NULL COMMENT '琴漆',
  `qin_xian` varchar(255) DEFAULT NULL COMMENT '琴弦',
  `qin_ma` varchar(255) DEFAULT NULL COMMENT '琴码',
  `qin_gong` varchar(255) DEFAULT NULL COMMENT '琴弓',
  `qin_he` varchar(255) DEFAULT NULL COMMENT '琴盒',
  `zhi_ban` varchar(255) DEFAULT NULL COMMENT '指板',
  `xian_zhou` varchar(255) DEFAULT NULL COMMENT '弦轴',
  `wei_diao` varchar(255) DEFAULT NULL COMMENT '微调',
  `wei_sheng` varchar(255) DEFAULT NULL COMMENT '尾绳',
  `description` varchar(255) DEFAULT NULL,
  `images` varchar(255) DEFAULT NULL COMMENT '图片',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '制作时间',
  `view_times` int(11) DEFAULT NULL COMMENT '浏览次数',
  `buy_url` varchar(255) DEFAULT NULL COMMENT '购买地址(京东，淘宝）',
  `market_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '上架时间',
  `is_hot` int(11) DEFAULT NULL COMMENT '强烈关注 0是，1否',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
