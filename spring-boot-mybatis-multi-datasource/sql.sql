--用户表：
CREATE TABLE `user` (
  `id` int(13) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(33) DEFAULT NULL COMMENT '姓名',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `money` double DEFAULT NULL COMMENT '账户余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8

--工资详情表：
CREATE TABLE `money` (
  `id` int(33) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `basic` int(33) DEFAULT NULL COMMENT '基本工资',
  `reward` int(33) DEFAULT NULL COMMENT '奖金',
  `punishment` int(33) DEFAULT NULL COMMENT '惩罚金',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8
