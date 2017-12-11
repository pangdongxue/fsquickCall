/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.1.49-community : Database - db_quickcall
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_quickcall` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_quickcall`;

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginid` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `planid` varchar(20) DEFAULT NULL,
  `plan` varchar(200) DEFAULT NULL,
  `note` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`loginid`,`name`,`phone`,`planid`,`plan`,`note`) values (2,'pdx','pdx','18716318198','prod.75700001090467','4G','未找到[号码:18716318198]的资料,[没有取到对应的用户].'),(8,'pangdongxue','张','18820893832','prod.75700001088793','（手宽新报装专用）办一年720元20M宽带客户可享受承诺使用38元或以上4G套餐12个月送50元话费和550元电子充值券','虚拟商品渠道校验,参数检查失败:当前时间不在该商品的生失效时间内，检查不通过,商品编码为：prod.75700001088793'),(43,'pangdongxue','pdx','18820893832','prod.10000000066662','宽带办理','产品约束检查不通过,产品[手机宽带优惠产品包:prod.10000000066662]依赖于产品[手机宽带基础产品:prod.10000000066663]，请先办理被依赖的产品'),(45,'pdx','庞冬雪','13420731560','prod.10000000066661','宽带办理','[号码：13420731560]非正常使用状态，[停机]'),(46,'pangdongxue','张','18820893832','prod.75700001090441','宽带办理','产品不合法，[产品[prod.75700001090441:TCBS201701承诺使用58元及以上4G套餐一年可享受50M宽带一年360元优惠(手机宽带)]的状态或者生失效时间不合法]'),(48,'pangdongxue','张','18820893832','prod.10000000066661','宽带办理','提示信息：【您没有选择任何一个含附加属性为宽带速率（AAASERVICE）的营销方案，请重新选择或者核查营销方案配置是否正确！】！'),(50,'pdx','pang','18716318198','prod.75700001092764','（小众客户专用）新报装家庭宽带200元调测费返赠优惠（平均分10个月）ZD','未找到[号码:18716318198]的资料,[没有取到对应的用户].');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
