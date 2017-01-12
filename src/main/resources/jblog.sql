-- Create table
CREATE TABLE T_JBLOG_USER
(
  id          VARCHAR(100) PRIMARY KEY NOT NULL, --主键
  user_name   VARCHAR(100), --用户名
  user_pwd    VARCHAR(100), --密码
  user_aliens VARCHAR(100), --别名
  user_type   VARCHAR(5) --用户类型
);

-- Create table
CREATE TABLE T_JBLOG_VIEW
(
  id                  VARCHAR(100) PRIMARY KEY NOT NULL, --主键
  view_title          VARCHAR(1000), --标题
  view_text           CLOB, --内容
  create_time         DATE, --创建时间
  leave_msg_id        VARCHAR(100), --留言
  view_author         VARCHAR(100), --作者
  view_classification VARCHAR(100), --分类
  view_comments       INT
);

-- Create table
CREATE TABLE T_JBLOG_MSG
(
  id          VARCHAR(100) PRIMARY KEY NOT NULL, --主键
  msg_content VARCHAR(240), --留言内容
  msg_author  VARCHAR(100), --留言者
  create_time DATE, --创建时间
  contact     VARCHAR(100), --联系方式
  reference   VARCHAR(100), --引用
  website     VARCHAR(100)--个人网址
);

-- Create table
CREATE TABLE T_JBLOG_CLASSSIFICATION
(
  id         VARCHAR(100) PRIMARY KEY NOT NULL, --主键
  clss_name  VARCHAR(200), --层级名称
  p_class_id VARCHAR(100), --父层级
  show_level CHAR(4) --显示等级
);

-- Create table
CREATE TABLE T_JBLOG_VISIT_LOG
(
  id         VARCHAR(100) PRIMARY KEY NOT NULL, --主键
  ip         VARCHAR(50), --访问IP
  visit_time DATE, --访问时间
  visit_type CHAR(10) --访问类型
);