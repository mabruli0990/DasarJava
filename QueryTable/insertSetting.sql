

insert into tb_m_dept_flow
(dept_id, dept_name, org_id,seq)
values
(2,'dept02',2,2);

insert into tb_m_step_flow
(step_id, step_name, seq)
values
(2,'step02',2);

insert into tb_m_flow
(flow_id,dept_id,step_id,flow_cd)
values
(2,2,2,'flow2');

insert into tb_m_setting_group
(flow_id, group_type,GRUOP_CD)
values 
(1,'sc01','sg01');

insert into tb_m_setting
(setting_cd,
GRUOP_CD,
setting_title,
parent_cd,
id_pic_by,
position,
REL_DATA_TO)
values
(2,'sg01','setting02',1,'sc01','sc01','sc01');



select tb_m_eci_dist_s.nextval from dual;