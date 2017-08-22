--gmcc内部员工表，每日更新
DROP TABLE IF EXISTS alluserinfo; 
CREATE TABLE alluserinfo (
  UserID varchar(255) NOT NULL COMMENT '工号',
  UserName varchar(255) NOT NULL COMMENT '用户名',
  LoginID varchar(255) NOT NULL COMMENT '帐号',
  Email varchar(255) NOT NULL COMMENT '邮箱地址',
  TelephoneNumber varchar(255) NOT NULL COMMENT '手机号码',
  Birthday varchar(255) COMMENT '出生年月',
  DPID varchar(255) COMMENT '组织架构ID',
  DPName varchar(255) COMMENT '组织架构全名',
  DPCode varchar(255) COMMENT '组织架构编码',
  ParentDPID varchar(255) COMMENT '父节点组织架构ID',
  DPFullName varchar(255) COMMENT '组织架构名称',
  JobTypeID varchar(255) COMMENT '工作名称',
  desJobType varchar(255) COMMENT '工作全称',
  EmployeeClassID varchar(255) COMMENT '是否被',
  desEmployeeClass varchar(255) COMMENT '工作名称',
  SexID varchar(255) COMMENT '工作名称',
  orderNo varchar(255) COMMENT '工作名称',
  UserRole varchar(255) COMMENT '工作名称',
  UserLigion varchar(255) COMMENT '工作名称',
  IsTmpUser varchar(255) COMMENT '工作名称',
) engine=innodb default charset=utf8;
