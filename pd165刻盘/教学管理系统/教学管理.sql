/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     2014/8/29 ������ ���� 12:10:30                    */
/*==============================================================*/


drop procedure "P_xktongji"
/

alter table רҵ
   drop constraint "FK_רҵ_DEP-PRO_ϵ��"
/

alter table ѧ��
   drop constraint "FK_ѧ��_CLASS-STU_�༶"
/

alter table ���μƻ�
   drop constraint "FK_���μƻ�_COURSE-PL_�γ�"
/

alter table ���μƻ�
   drop constraint "FK_���μƻ�_PRO-PLAN_רҵ"
/

alter table �ɼ�
   drop constraint "FK_�ɼ�_COURSE-SC_�γ�"
/

alter table �ɼ�
   drop constraint "FK_�ɼ�_STUDENT-S_ѧ��"
/

alter table �ſ�
   drop constraint "FK_�ſ�_COURSE-AR_�γ�"
/

alter table �ſ�
   drop constraint "FK_�ſ�_ROOM-ARRA_����"
/

alter table �ſ�
   drop constraint "FK_�ſ�_TEACHER-A_��ʦ"
/

alter table ����
   drop constraint "FK_����_T-MANAGE-_��ʦ"
/

alter table ��ʦ
   drop constraint "FK_��ʦ_DEP-TEACH_ϵ��"
/

alter table �༶
   drop constraint "FK_�༶_PRO-CLASS_רҵ"
/

alter table ���԰���
   drop constraint "FK_���԰���_COURSE-TE_�γ�"
/

alter table ���԰���
   drop constraint "FK_���԰���_ROOM-TEST_����"
/

alter table ���԰���
   drop constraint "FK_���԰���_STUDENT-T_ѧ��"
/

alter table ����
   drop constraint "FK_����_CLASS-EVA_�༶"
/

alter table ����
   drop constraint "FK_����_COURSE-EV_�γ�"
/

alter table ����
   drop constraint "FK_����_TEACHER-E_��ʦ"
/

alter table �γ�
   drop constraint "FK_�γ�_DEP-COURS_ϵ��"
/

alter table ѡ��
   drop constraint "FK_ѡ��_COURSE-SE_�γ�"
/

alter table ѡ��
   drop constraint "FK_ѡ��_STUDENT-S_ѧ��"
/

alter table ѡ��
   drop constraint "FK_ѡ��_TEACHER-S_��ʦ"
/

alter table רҵ
   drop primary key cascade
/

drop table רҵ cascade constraints
/

alter table ѧ��
   drop unique ("s_ID") cascade
/

alter table ѧ��
   drop primary key cascade
/

drop table ѧ�� cascade constraints
/

alter table ���μƻ�
   drop primary key cascade
/

drop table ���μƻ� cascade constraints
/

alter table �ɼ�
   drop primary key cascade
/

drop table �ɼ� cascade constraints
/

alter table �ſ�
   drop primary key cascade
/

drop table �ſ� cascade constraints
/

alter table ����
   drop primary key cascade
/

drop table ���� cascade constraints
/

alter table ��ʦ
   drop primary key cascade
/

drop table ��ʦ cascade constraints
/

alter table �༶
   drop primary key cascade
/

drop table �༶ cascade constraints
/

alter table ϵ��
   drop primary key cascade
/

drop table ϵ�� cascade constraints
/

alter table ���԰���
   drop primary key cascade
/

drop table ���԰��� cascade constraints
/

alter table ����
   drop primary key cascade
/

drop table ���� cascade constraints
/

alter table �γ�
   drop primary key cascade
/

drop table �γ� cascade constraints
/

alter table ѡ��
   drop primary key cascade
/

drop table ѡ�� cascade constraints
/

/*==============================================================*/
/* Table: רҵ                                                    */
/*==============================================================*/
create table רҵ 
(
   "pro_no"             CHAR(5)              not null,
   "dep_no"             CHAR(5)              not null,
   "pro_name"           CHAR(20)
)
/

alter table רҵ
   add constraint PK_רҵ primary key ("pro_no")
/

/*==============================================================*/
/* Table: ѧ��                                                    */
/*==============================================================*/
create table ѧ�� 
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

alter table ѧ��
   add constraint CKC_S_SEX_ѧ�� check ("s_sex" is null or ("s_sex" in ('��','Ů')))
/

alter table ѧ��
   add constraint CKC_S_BIRTHDAY_ѧ�� check ("s_birthday" is null or ("s_birthday" between '1950-01-01' and sysdate))
/

alter table ѧ��
   add constraint CKC_S_NATION_ѧ�� check ("s_nation" is null or ("s_nation" in ('����','����','׳��','����','�½�ά�����','����','����','�ɹ���','Ǽ��','����')))
/

alter table ѧ��
   add constraint CKC_S_POLITICAL_ѧ�� check ("s_political" is null or ("s_political" in ('�й���Ա','������Ա')))
/

alter table ѧ��
   add constraint CKC_S_SCORE_ѧ�� check ("s_score" is null or ("s_score" between 500 and 700))
/

alter table ѧ��
   add constraint PK_ѧ�� primary key ("s_no")
/

alter table ѧ��
   add constraint AK_S_POLITICAL_ѧ�� unique ("s_ID")
/

/*==============================================================*/
/* Table: ���μƻ�                                                  */
/*==============================================================*/
create table ���μƻ� 
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

alter table ���μƻ�
   add constraint PK_���μƻ� primary key ("plan_no")
/

/*==============================================================*/
/* Table: �ɼ�                                                    */
/*==============================================================*/
create table �ɼ� 
(
   "c_no"               CHAR(5)              not null,
   "s_no"               CHAR(10)             not null,
   "score"              NUMBER(5,1),
   "remark"             VARCHAR2(10)
)
/

alter table �ɼ�
   add constraint PK_�ɼ� primary key ("c_no", "s_no")
/

/*==============================================================*/
/* Table: �ſ�                                                    */
/*==============================================================*/
create table �ſ� 
(
   "r_no"               CHAR(5)              not null,
   "c_no"               CHAR(5)              not null,
   "t_no"               CHAR(6)              not null,
   "course_time"        CHAR(10)
)
/

alter table �ſ�
   add constraint PK_�ſ� primary key ("r_no", "c_no", "t_no")
/

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ���� 
(
   "r_no"               CHAR(5)              not null,
   "t_no"               CHAR(6)              not null,
   "r_type"             CHAR(2),
   "r_spec"             NUMBER(4),
   "r_remark"           VARCHAR2(50)
)
/

alter table ����
   add constraint PK_���� primary key ("r_no")
/

/*==============================================================*/
/* Table: ��ʦ                                                    */
/*==============================================================*/
create table ��ʦ 
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

alter table ��ʦ
   add constraint CKC_T_SEX_��ʦ check ("t_sex" is null or ("t_sex" in ('��','Ů')))
/

alter table ��ʦ
   add constraint CKC_T_TITLE_��ʦ check ("t_title" is null or ("t_title" in ('����','������','��ʦ','����','����','����ʦ','�߼�����ʦ','ʵ��Ա')))
/

alter table ��ʦ
   add constraint CKC_T_BIRTHDAY_��ʦ check ("t_birthday" is null or ("t_birthday" between '1950-01-01' and sysdate))
/

alter table ��ʦ
   add constraint CKC_T_POLITICAL_��ʦ check ("t_political" is null or ("t_political" in ('�й���Ա','������Ա')))
/

alter table ��ʦ
   add constraint PK_��ʦ primary key ("t_no")
/

/*==============================================================*/
/* Table: �༶                                                    */
/*==============================================================*/
create table �༶ 
(
   "class_no"           CHAR(5)              not null,
   "pro_no"             CHAR(5)              not null,
   "class_name"         CHAR(20),
   "class_people"       NUMBER(3)
)
/

alter table �༶
   add constraint PK_�༶ primary key ("class_no")
/

/*==============================================================*/
/* Table: ϵ��                                                    */
/*==============================================================*/
create table ϵ�� 
(
   "dep_no"             CHAR(5)              not null,
   "dep_name"           CHAR(20),
   "dep_address"        CHAR(10),
   "dep_telphone"       CHAR(8)
)
/

alter table ϵ��
   add constraint PK_ϵ�� primary key ("dep_no")
/

/*==============================================================*/
/* Table: ���԰���                                                  */
/*==============================================================*/
create table ���԰��� 
(
   "s_no"               CHAR(10)             not null,
   "c_no"               CHAR(5)              not null,
   "r_no"               CHAR(5)              not null,
   "test_time"          DATE
)
/

alter table ���԰���
   add constraint PK_���԰��� primary key ("s_no", "c_no", "r_no")
/

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ���� 
(
   "class_no"           CHAR(5)              not null,
   "c_no"               CHAR(5)              not null,
   "t_no"               CHAR(6)              not null,
   "teacher_score"      NUMBER(3),
   "student_score"      NUMBER(3)
)
/

alter table ����
   add constraint PK_���� primary key ("class_no", "c_no", "t_no")
/

/*==============================================================*/
/* Table: �γ�                                                    */
/*==============================================================*/
create table �γ� 
(
   "c_no"               CHAR(5)              not null,
   "dep_no"             CHAR(5)              not null,
   "c_name"             CHAR(20),
   "d_no"               CHAR(20),
   "c_remark"           VARCHAR2(100)
)
/

alter table �γ�
   add constraint PK_�γ� primary key ("c_no")
/

/*==============================================================*/
/* Table: ѡ��                                                    */
/*==============================================================*/
create table ѡ�� 
(
   "t_no"               CHAR(6)              not null,
   "s_no"               CHAR(10)             not null,
   "c_no"               CHAR(5)              not null
)
/

alter table ѡ��
   add constraint PK_ѡ�� primary key ("t_no", "s_no", "c_no")
/

alter table רҵ
   add constraint "FK_רҵ_DEP-PRO_ϵ��" foreign key ("dep_no")
      references ϵ�� ("dep_no")
/

alter table ѧ��
   add constraint "FK_ѧ��_CLASS-STU_�༶" foreign key ("class_no")
      references �༶ ("class_no")
/

alter table ���μƻ�
   add constraint "FK_���μƻ�_COURSE-PL_�γ�" foreign key ("c_no")
      references �γ� ("c_no")
/

alter table ���μƻ�
   add constraint "FK_���μƻ�_PRO-PLAN_רҵ" foreign key ("pro_no")
      references רҵ ("pro_no")
/

alter table �ɼ�
   add constraint "FK_�ɼ�_COURSE-SC_�γ�" foreign key ("c_no")
      references �γ� ("c_no")
/

alter table �ɼ�
   add constraint "FK_�ɼ�_STUDENT-S_ѧ��" foreign key ("s_no")
      references ѧ�� ("s_no")
/

alter table �ſ�
   add constraint "FK_�ſ�_COURSE-AR_�γ�" foreign key ("c_no")
      references �γ� ("c_no")
/

alter table �ſ�
   add constraint "FK_�ſ�_ROOM-ARRA_����" foreign key ("r_no")
      references ���� ("r_no")
/

alter table �ſ�
   add constraint "FK_�ſ�_TEACHER-A_��ʦ" foreign key ("t_no")
      references ��ʦ ("t_no")
/

alter table ����
   add constraint "FK_����_T-MANAGE-_��ʦ" foreign key ("t_no")
      references ��ʦ ("t_no")
/

alter table ��ʦ
   add constraint "FK_��ʦ_DEP-TEACH_ϵ��" foreign key ("dep_no")
      references ϵ�� ("dep_no")
/

alter table �༶
   add constraint "FK_�༶_PRO-CLASS_רҵ" foreign key ("pro_no")
      references רҵ ("pro_no")
/

alter table ���԰���
   add constraint "FK_���԰���_COURSE-TE_�γ�" foreign key ("c_no")
      references �γ� ("c_no")
/

alter table ���԰���
   add constraint "FK_���԰���_ROOM-TEST_����" foreign key ("r_no")
      references ���� ("r_no")
/

alter table ���԰���
   add constraint "FK_���԰���_STUDENT-T_ѧ��" foreign key ("s_no")
      references ѧ�� ("s_no")
/

alter table ����
   add constraint "FK_����_CLASS-EVA_�༶" foreign key ("class_no")
      references �༶ ("class_no")
/

alter table ����
   add constraint "FK_����_COURSE-EV_�γ�" foreign key ("c_no")
      references �γ� ("c_no")
/

alter table ����
   add constraint "FK_����_TEACHER-E_��ʦ" foreign key ("t_no")
      references ��ʦ ("t_no")
/

alter table �γ�
   add constraint "FK_�γ�_DEP-COURS_ϵ��" foreign key ("dep_no")
      references ϵ�� ("dep_no")
/

alter table ѡ��
   add constraint "FK_ѡ��_COURSE-SE_�γ�" foreign key ("c_no")
      references �γ� ("c_no")
/

alter table ѡ��
   add constraint "FK_ѡ��_STUDENT-S_ѧ��" foreign key ("s_no")
      references ѧ�� ("s_no")
/

alter table ѡ��
   add constraint "FK_ѡ��_TEACHER-S_��ʦ" foreign key ("t_no")
      references ��ʦ ("t_no")
/


create or replace procedure 
p_c_no in char,p_t_no in char,p_totalnum out number
as
declare
begin
select count(*) into p_totalnum from ѡ�� where c_no=p_c_no and t_no=p_t_no;
end;
/

