/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     2014/8/29 星期五 下午 12:10:30                    */
/*==============================================================*/


drop procedure "P_xktongji"
/

alter table 专业
   drop constraint "FK_专业_DEP-PRO_系部"
/

alter table 学生
   drop constraint "FK_学生_CLASS-STU_班级"
/

alter table 开课计划
   drop constraint "FK_开课计划_COURSE-PL_课程"
/

alter table 开课计划
   drop constraint "FK_开课计划_PRO-PLAN_专业"
/

alter table 成绩
   drop constraint "FK_成绩_COURSE-SC_课程"
/

alter table 成绩
   drop constraint "FK_成绩_STUDENT-S_学生"
/

alter table 排课
   drop constraint "FK_排课_COURSE-AR_课程"
/

alter table 排课
   drop constraint "FK_排课_ROOM-ARRA_教室"
/

alter table 排课
   drop constraint "FK_排课_TEACHER-A_教师"
/

alter table 教室
   drop constraint "FK_教室_T-MANAGE-_教师"
/

alter table 教师
   drop constraint "FK_教师_DEP-TEACH_系部"
/

alter table 班级
   drop constraint "FK_班级_PRO-CLASS_专业"
/

alter table 考试安排
   drop constraint "FK_考试安排_COURSE-TE_课程"
/

alter table 考试安排
   drop constraint "FK_考试安排_ROOM-TEST_教室"
/

alter table 考试安排
   drop constraint "FK_考试安排_STUDENT-T_学生"
/

alter table 评价
   drop constraint "FK_评价_CLASS-EVA_班级"
/

alter table 评价
   drop constraint "FK_评价_COURSE-EV_课程"
/

alter table 评价
   drop constraint "FK_评价_TEACHER-E_教师"
/

alter table 课程
   drop constraint "FK_课程_DEP-COURS_系部"
/

alter table 选课
   drop constraint "FK_选课_COURSE-SE_课程"
/

alter table 选课
   drop constraint "FK_选课_STUDENT-S_学生"
/

alter table 选课
   drop constraint "FK_选课_TEACHER-S_教师"
/

alter table 专业
   drop primary key cascade
/

drop table 专业 cascade constraints
/

alter table 学生
   drop unique ("s_ID") cascade
/

alter table 学生
   drop primary key cascade
/

drop table 学生 cascade constraints
/

alter table 开课计划
   drop primary key cascade
/

drop table 开课计划 cascade constraints
/

alter table 成绩
   drop primary key cascade
/

drop table 成绩 cascade constraints
/

alter table 排课
   drop primary key cascade
/

drop table 排课 cascade constraints
/

alter table 教室
   drop primary key cascade
/

drop table 教室 cascade constraints
/

alter table 教师
   drop primary key cascade
/

drop table 教师 cascade constraints
/

alter table 班级
   drop primary key cascade
/

drop table 班级 cascade constraints
/

alter table 系部
   drop primary key cascade
/

drop table 系部 cascade constraints
/

alter table 考试安排
   drop primary key cascade
/

drop table 考试安排 cascade constraints
/

alter table 评价
   drop primary key cascade
/

drop table 评价 cascade constraints
/

alter table 课程
   drop primary key cascade
/

drop table 课程 cascade constraints
/

alter table 选课
   drop primary key cascade
/

drop table 选课 cascade constraints
/

/*==============================================================*/
/* Table: 专业                                                    */
/*==============================================================*/
create table 专业 
(
   "pro_no"             CHAR(5)              not null,
   "dep_no"             CHAR(5)              not null,
   "pro_name"           CHAR(20)
)
/

alter table 专业
   add constraint PK_专业 primary key ("pro_no")
/

/*==============================================================*/
/* Table: 学生                                                    */
/*==============================================================*/
create table 学生 
(
   "s_no"               CHAR(10)             not null,
   "class_no"           CHAR(5)              not null,
   "s_name"             CHAR(10),
   "s_sex"              CHAR(2),
   "s_birthday"         DATE,
   "s_origin"           VARCHAR2(20),
   "s_nation"           CHAR(20),
   "s_political"        CHAR(20),
   "s_ID"               CHAR(18),
   "s_score"            NUMBER(3),
   "s_file"             CHAR(8)
)
/

alter table 学生
   add constraint CKC_S_SEX_学生 check ("s_sex" is null or ("s_sex" in ('男','女')))
/

alter table 学生
   add constraint CKC_S_BIRTHDAY_学生 check ("s_birthday" is null or ("s_birthday" between '1950-01-01' and sysdate))
/

alter table 学生
   add constraint CKC_S_NATION_学生 check ("s_nation" is null or ("s_nation" in ('汉族','满族','壮族','回族','新疆维吾尔族','苗族','彝族','蒙古族','羌族','白族')))
/

alter table 学生
   add constraint CKC_S_POLITICAL_学生 check ("s_political" is null or ("s_political" in ('中共党员','共青团员')))
/

alter table 学生
   add constraint CKC_S_SCORE_学生 check ("s_score" is null or ("s_score" between 500 and 700))
/

alter table 学生
   add constraint PK_学生 primary key ("s_no")
/

alter table 学生
   add constraint AK_S_POLITICAL_学生 unique ("s_ID")
/

/*==============================================================*/
/* Table: 开课计划                                                  */
/*==============================================================*/
create table 开课计划 
(
   "plan_no"            CHAR(5)              not null,
   "c_no"               CHAR(5)              not null,
   "pro_no"             CHAR(5),
   "plan_term"          CHAR(10),
   "plan_time"          NUMBER(3),
   "plan_grade"         NUMBER(2),
   "plan_type"          CHAR(2),
   "plan_mode"          CHAR(2)
)
/

alter table 开课计划
   add constraint PK_开课计划 primary key ("plan_no")
/

/*==============================================================*/
/* Table: 成绩                                                    */
/*==============================================================*/
create table 成绩 
(
   "c_no"               CHAR(5)              not null,
   "s_no"               CHAR(10)             not null,
   "score"              NUMBER(5,1),
   "remark"             VARCHAR2(10)
)
/

alter table 成绩
   add constraint PK_成绩 primary key ("c_no", "s_no")
/

/*==============================================================*/
/* Table: 排课                                                    */
/*==============================================================*/
create table 排课 
(
   "r_no"               CHAR(5)              not null,
   "c_no"               CHAR(5)              not null,
   "t_no"               CHAR(6)              not null,
   "course_time"        CHAR(10)
)
/

alter table 排课
   add constraint PK_排课 primary key ("r_no", "c_no", "t_no")
/

/*==============================================================*/
/* Table: 教室                                                    */
/*==============================================================*/
create table 教室 
(
   "r_no"               CHAR(5)              not null,
   "t_no"               CHAR(6)              not null,
   "r_type"             CHAR(2),
   "r_spec"             NUMBER(4),
   "r_remark"           VARCHAR2(50)
)
/

alter table 教室
   add constraint PK_教室 primary key ("r_no")
/

/*==============================================================*/
/* Table: 教师                                                    */
/*==============================================================*/
create table 教师 
(
   "t_no"               CHAR(6)              not null,
   "dep_no"             CHAR(5)              not null,
   "t_name"             CHAR(10),
   "t_sex"              CHAR(2),
   "t_title"            CHAR(20),
   "t_birthday"         DATE,
   "t_political"        CHAR(20),
   "t_ID"               CHAR(18),
   "t_file"             CHAR(8)
)
/

alter table 教师
   add constraint CKC_T_SEX_教师 check ("t_sex" is null or ("t_sex" in ('男','女')))
/

alter table 教师
   add constraint CKC_T_TITLE_教师 check ("t_title" is null or ("t_title" in ('教授','副教授','讲师','助教','助工','工程师','高级工程师','实验员')))
/

alter table 教师
   add constraint CKC_T_BIRTHDAY_教师 check ("t_birthday" is null or ("t_birthday" between '1950-01-01' and sysdate))
/

alter table 教师
   add constraint CKC_T_POLITICAL_教师 check ("t_political" is null or ("t_political" in ('中共党员','共青团员')))
/

alter table 教师
   add constraint PK_教师 primary key ("t_no")
/

/*==============================================================*/
/* Table: 班级                                                    */
/*==============================================================*/
create table 班级 
(
   "class_no"           CHAR(5)              not null,
   "pro_no"             CHAR(5)              not null,
   "class_name"         CHAR(20),
   "class_people"       NUMBER(3)
)
/

alter table 班级
   add constraint PK_班级 primary key ("class_no")
/

/*==============================================================*/
/* Table: 系部                                                    */
/*==============================================================*/
create table 系部 
(
   "dep_no"             CHAR(5)              not null,
   "dep_name"           CHAR(20),
   "dep_address"        CHAR(10),
   "dep_telphone"       CHAR(8)
)
/

alter table 系部
   add constraint PK_系部 primary key ("dep_no")
/

/*==============================================================*/
/* Table: 考试安排                                                  */
/*==============================================================*/
create table 考试安排 
(
   "s_no"               CHAR(10)             not null,
   "c_no"               CHAR(5)              not null,
   "r_no"               CHAR(5)              not null,
   "test_time"          DATE
)
/

alter table 考试安排
   add constraint PK_考试安排 primary key ("s_no", "c_no", "r_no")
/

/*==============================================================*/
/* Table: 评价                                                    */
/*==============================================================*/
create table 评价 
(
   "class_no"           CHAR(5)              not null,
   "c_no"               CHAR(5)              not null,
   "t_no"               CHAR(6)              not null,
   "teacher_score"      NUMBER(3),
   "student_score"      NUMBER(3)
)
/

alter table 评价
   add constraint PK_评价 primary key ("class_no", "c_no", "t_no")
/

/*==============================================================*/
/* Table: 课程                                                    */
/*==============================================================*/
create table 课程 
(
   "c_no"               CHAR(5)              not null,
   "dep_no"             CHAR(5)              not null,
   "c_name"             CHAR(20),
   "d_no"               CHAR(20),
   "c_remark"           VARCHAR2(100)
)
/

alter table 课程
   add constraint PK_课程 primary key ("c_no")
/

/*==============================================================*/
/* Table: 选课                                                    */
/*==============================================================*/
create table 选课 
(
   "t_no"               CHAR(6)              not null,
   "s_no"               CHAR(10)             not null,
   "c_no"               CHAR(5)              not null
)
/

alter table 选课
   add constraint PK_选课 primary key ("t_no", "s_no", "c_no")
/

alter table 专业
   add constraint "FK_专业_DEP-PRO_系部" foreign key ("dep_no")
      references 系部 ("dep_no")
/

alter table 学生
   add constraint "FK_学生_CLASS-STU_班级" foreign key ("class_no")
      references 班级 ("class_no")
/

alter table 开课计划
   add constraint "FK_开课计划_COURSE-PL_课程" foreign key ("c_no")
      references 课程 ("c_no")
/

alter table 开课计划
   add constraint "FK_开课计划_PRO-PLAN_专业" foreign key ("pro_no")
      references 专业 ("pro_no")
/

alter table 成绩
   add constraint "FK_成绩_COURSE-SC_课程" foreign key ("c_no")
      references 课程 ("c_no")
/

alter table 成绩
   add constraint "FK_成绩_STUDENT-S_学生" foreign key ("s_no")
      references 学生 ("s_no")
/

alter table 排课
   add constraint "FK_排课_COURSE-AR_课程" foreign key ("c_no")
      references 课程 ("c_no")
/

alter table 排课
   add constraint "FK_排课_ROOM-ARRA_教室" foreign key ("r_no")
      references 教室 ("r_no")
/

alter table 排课
   add constraint "FK_排课_TEACHER-A_教师" foreign key ("t_no")
      references 教师 ("t_no")
/

alter table 教室
   add constraint "FK_教室_T-MANAGE-_教师" foreign key ("t_no")
      references 教师 ("t_no")
/

alter table 教师
   add constraint "FK_教师_DEP-TEACH_系部" foreign key ("dep_no")
      references 系部 ("dep_no")
/

alter table 班级
   add constraint "FK_班级_PRO-CLASS_专业" foreign key ("pro_no")
      references 专业 ("pro_no")
/

alter table 考试安排
   add constraint "FK_考试安排_COURSE-TE_课程" foreign key ("c_no")
      references 课程 ("c_no")
/

alter table 考试安排
   add constraint "FK_考试安排_ROOM-TEST_教室" foreign key ("r_no")
      references 教室 ("r_no")
/

alter table 考试安排
   add constraint "FK_考试安排_STUDENT-T_学生" foreign key ("s_no")
      references 学生 ("s_no")
/

alter table 评价
   add constraint "FK_评价_CLASS-EVA_班级" foreign key ("class_no")
      references 班级 ("class_no")
/

alter table 评价
   add constraint "FK_评价_COURSE-EV_课程" foreign key ("c_no")
      references 课程 ("c_no")
/

alter table 评价
   add constraint "FK_评价_TEACHER-E_教师" foreign key ("t_no")
      references 教师 ("t_no")
/

alter table 课程
   add constraint "FK_课程_DEP-COURS_系部" foreign key ("dep_no")
      references 系部 ("dep_no")
/

alter table 选课
   add constraint "FK_选课_COURSE-SE_课程" foreign key ("c_no")
      references 课程 ("c_no")
/

alter table 选课
   add constraint "FK_选课_STUDENT-S_学生" foreign key ("s_no")
      references 学生 ("s_no")
/

alter table 选课
   add constraint "FK_选课_TEACHER-S_教师" foreign key ("t_no")
      references 教师 ("t_no")
/


create or replace procedure 
p_c_no in char,p_t_no in char,p_totalnum out number
as
declare
begin
select count(*) into p_totalnum from 选课 where c_no=p_c_no and t_no=p_t_no;
end;
/

