/*
 Navicat Premium Data Transfer

 Source Server         : 39.98.153.232_3306
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : 39.98.153.232:3306
 Source Schema         : DbCache

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 30/04/2021 10:01:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for COSS_BUSI_UNIQUE_CTRL
-- ----------------------------
DROP TABLE IF EXISTS `COSS_BUSI_UNIQUE_CTRL`;
CREATE TABLE `COSS_BUSI_UNIQUE_CTRL`  (
  `ID` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '自增序列',
  `PART_ID` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '日期键分区，日期后两位',
  `BUSI_SEQ_NO` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '业务唯一键',
  `APP_SEQ_NO` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '技术唯一键',
  `BUSI_STATUS` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '业务状态\r\n1:初始化；2:处理中；3:处理成功；4:处理失败；5:反交易在途；6:反交易成功',
  `PROCESSING_NODE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '处理节点',
  `LAST_MODIFY_TIME` datetime(0) NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`ID`) USING BTREE,
  UNIQUE INDEX `UQ_COSS_BUSI_UNIQUE_CTRL_1`(`PART_ID`, `BUSI_SEQ_NO`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
