CREATE TABLE tb_m_eci_dist
(
	eci_dist_id int not null,
	flow_id int not null,
	noreg varchar2(8) not null,
	eci_type varchar2(60) not null,
	routing_status varchar2(60) not null,
	design_status varchar2(60) not null,
	project_status varchar2(60) not null,
	impl_stage_status varchar2(60) not null,
	car_family_status varchar2(60) not null,
	priority_status varchar2(60) not null,
	ed_pe_data_flag varchar2(1),
	ed_pe_status varchar2(60) not null,

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);

CREATE TABLE tb_m_eci_dist_car_family
(
	dist_car_family_id number(10) not null,
	eci_dist_id int not null,
	car_family_id int not null,

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);

CREATE TABLE tb_m_eci_dist_priority
(
	dist_priority_id number(10) not null,
	eci_dist_id int not null,
	priority varchar2(60) not null,

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);

CREATE TABLE tb_m_eci_dist_design
(
	dist_design_id number(10) not null,
	eci_dist_id int not null,
	design_id int not null,

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);

CREATE TABLE tb_m_eci_dist_routing
(
	dist_routing_id number(10) not null,
	eci_dist_id int not null,
	routing_id int not null,
	occurrence varchar2(60) not null,

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);

CREATE TABLE tb_m_eci_dist_impl_stage
(
	dist_stage_id number(10) not null,
	eci_dist_id int not null,
	impl_stage_id int not null,

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);

CREATE TABLE tb_m_eci_dist_project
(
	dist_project_id number(10) not null,
	eci_dist_id int not null,
	project_id int not null,

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);

CREATE TABLE tb_m_eci_dist_edpe_criteria
(
	edpe_criteria_id number(10) not null,
	eci_dist_id int not null,
	setting_cd varchar2(60) not null,

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);

CREATE TABLE tb_m_flow
(
	flow_id int not null,
	dept_id int not null,
	step_id int not null,
	flow_cd varchar2(32) not null,
	flow_name varchar2(256),
	eci_dist_flag varchar2(1),
	approval_flag varchar2(1),

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);

CREATE TABLE tb_m_routing
(
	routing_id int not null,
	routing_cd varchar2(6) not null,
	routing_name varchar2(100),
	routing_category varchar2(60) not null,

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);

CREATE TABLE tb_m_project
(
	project_id int not null,
	project_cd varchar2(10) not null,
	car_family_id int not null,
	project_name varchar2(100),

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);

CREATE TABLE tb_m_setting
(
	setting_cd varchar2(60) not null,
	gruop_cd varchar2(30) not null,
	setting_title varchar2(60) not null,
	parent_cd varchar2(60) not null,
	remarks_flag varchar2(1),
	parent_flag varchar2(1),
	id_pic_by varchar2(60) not null,
	noreg varchar2(8),
	position varchar2(60) not null,
	rel_data_flag varchar2(1),
	rel_data_to varchar2(60) not null,
	rel_data_value varchar2(30),
	seq int,

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);

CREATE TABLE tb_m_setting_group
(
    gruop_cd varchar2(30) not null,
    flow_id int not null,
    group_desc varchar2(256),
    group_type varchar2(60) not null,

	created_by varchar2(50),
	created_dt timestamp,
	changed_by varchar2(50),
	changed_dt timestamp
);



ALTER TABLE tb_m_eci_dist
	ADD CONSTRAINT tb_m_eci_dist_pk PRIMARY KEY (eci_dist_id);

ALTER TABLE tb_m_eci_dist
	ADD CONSTRAINT tb_m_eci_dist_ak UNIQUE (flow_id, noreg);



ALTER TABLE tb_m_eci_dist_car_family
	ADD CONSTRAINT tb_m_eci_dist_car_family_pk PRIMARY KEY(dist_car_family_id);

ALTER TABLE tb_m_eci_dist_car_family
	ADD CONSTRAINT tb_m_eci_dist_car_family_ak UNIQUE(eci_dist_id, car_family_id);



ALTER TABLE tb_m_eci_dist_priority
	ADD CONSTRAINT tb_m_eci_dist_priority_pk PRIMARY KEY(dist_priority_id);

ALTER TABLE tb_m_eci_dist_priority
	ADD CONSTRAINT tb_m_eci_dist_priority_ak UNIQUE(eci_dist_id, priority);



ALTER TABLE tb_m_eci_dist_design
	ADD CONSTRAINT tb_m_eci_dist_design_pk PRIMARY KEY(dist_design_id);

ALTER TABLE tb_m_eci_dist_design
	ADD CONSTRAINT tb_m_eci_dist_design_ak UNIQUE(eci_dist_id, design_id);



ALTER TABLE tb_m_eci_dist_routing
	ADD CONSTRAINT tb_m_eci_dist_routing_pk PRIMARY KEY(dist_routing_id);

ALTER TABLE tb_m_eci_dist_routing
	ADD CONSTRAINT tb_m_eci_dist_routing_ak UNIQUE(eci_dist_id, routing_id);



ALTER TABLE tb_m_eci_dist_impl_stage
	ADD CONSTRAINT tb_m_eci_dist_impl_stage_pk PRIMARY KEY(dist_stage_id);

ALTER TABLE tb_m_eci_dist_impl_stage
	ADD CONSTRAINT tb_m_eci_dist_impl_stage_ak UNIQUE(eci_dist_id, impl_stage_id);



ALTER TABLE tb_m_eci_dist_project
	ADD CONSTRAINT tb_m_eci_dist_project_pk PRIMARY KEY(dist_project_id);

ALTER TABLE tb_m_eci_dist_project
	ADD CONSTRAINT tb_m_eci_dist_project_ak UNIQUE(eci_dist_id, project_id);



ALTER TABLE tb_m_eci_dist_edpe_criteria
	ADD CONSTRAINT tb_m_eci_dist_edpe_criteria_pk PRIMARY KEY(edpe_criteria_id);

ALTER TABLE tb_m_eci_dist_edpe_criteria
	ADD CONSTRAINT tb_m_eci_dist_edpe_criteria_ak UNIQUE(eci_dist_id, setting_cd);



ALTER TABLE tb_m_flow
	ADD CONSTRAINT tb_m_flow_pk PRIMARY KEY(flow_id);

ALTER TABLE tb_m_flow
	ADD CONSTRAINT tb_m_flow_ak UNIQUE(dept_id,step_id,flow_cd);



ALTER TABLE tb_m_routing
	ADD CONSTRAINT tb_m_routing_pk PRIMARY KEY(routing_id);

ALTER TABLE tb_m_routing
	ADD CONSTRAINT tb_m_routing_ak UNIQUE(routing_cd);



ALTER TABLE tb_m_project
	ADD CONSTRAINT tb_m_project_pk PRIMARY KEY(project_id);

ALTER TABLE tb_m_project
	ADD CONSTRAINT tb_m_project_ak UNIQUE(project_cd, car_family_id);



ALTER TABLE tb_m_setting
	ADD CONSTRAINT tb_m_setting PRIMARY KEY(setting_cd);

ALTER TABLE tb_m_setting
	ADD CONSTRAINT tb_m_setting_ak UNIQUE(gruop_cd,setting_title);



ALTER TABLE tb_m_setting_group
ADD CONSTRAINT tb_m_setting_group_pk PRIMARY KEY(gruop_cd);



ALTER TABLE tb_m_eci_dist
	ADD CONSTRAINT tb_m_eci_dist_fk1 FOREIGN KEY(flow_id) REFERENCES tb_m_flow (flow_id);

ALTER TABLE tb_m_eci_dist
	ADD CONSTRAINT tb_m_eci_dist_fk2 FOREIGN KEY(noreg) REFERENCES tb_m_pic(noreg);

ALTER TABLE tb_m_eci_dist
	ADD CONSTRAINT tb_m_eci_dist_fk3 FOREIGN KEY(eci_type) REFERENCES tb_m_system(system_type_cd);

ALTER TABLE tb_m_eci_dist
	ADD CONSTRAINT tb_m_eci_dist_fk4 FOREIGN KEY(routing_status) REFERENCES tb_m_system(system_type_cd);

ALTER TABLE tb_m_eci_dist
	ADD CONSTRAINT tb_m_eci_dist_fk5 FOREIGN KEY(design_status) REFERENCES tb_m_system(system_type_cd);

ALTER TABLE tb_m_eci_dist
	ADD CONSTRAINT tb_m_eci_dist_fk6 FOREIGN KEY(project_status) REFERENCES tb_m_system(system_type_cd);

ALTER TABLE tb_m_eci_dist
	ADD CONSTRAINT tb_m_eci_dist_fk7 FOREIGN KEY(impl_stage_status) REFERENCES tb_m_system(system_type_cd);

ALTER TABLE tb_m_eci_dist
	ADD CONSTRAINT tb_m_eci_dist_fk8 FOREIGN KEY(car_family_status) REFERENCES tb_m_system(system_type_cd);

ALTER TABLE tb_m_eci_dist
	ADD CONSTRAINT tb_m_eci_dist_fk9 FOREIGN KEY(priority_status) REFERENCES tb_m_system(system_type_cd);

ALTER TABLE tb_m_eci_dist
	ADD CONSTRAINT tb_m_eci_dist_fk10 FOREIGN KEY(ed_pe_status) REFERENCES tb_m_system(system_type_cd);



ALTER TABLE tb_m_eci_dist_car_family
	ADD CONSTRAINT tb_m_eci_dist_car_family_fk1 FOREIGN KEY(eci_dist_id) REFERENCES tb_m_eci_dist(eci_dist_id);

ALTER TABLE tb_m_eci_dist_car_family
	ADD CONSTRAINT tb_m_eci_dist_car_family_fk2 FOREIGN KEY(car_family_id) REFERENCES tb_m_car_family(car_family_id);



ALTER TABLE tb_m_eci_dist_priority
	ADD CONSTRAINT tb_m_eci_dist_priority_fk1 FOREIGN KEY(eci_dist_id) REFERENCES tb_m_eci_dist(eci_dist_id);

ALTER TABLE tb_m_eci_dist_priority
	ADD CONSTRAINT tb_m_eci_dist_priority_fk2 FOREIGN KEY(priority) REFERENCES tb_m_system(system_type_cd);



ALTER TABLE tb_m_eci_dist_design
	ADD CONSTRAINT tb_m_eci_dist_design_fk1 FOREIGN KEY(eci_dist_id) REFERENCES tb_m_eci_dist(eci_dist_id);

ALTER TABLE tb_m_eci_dist_design
	ADD CONSTRAINT tb_m_eci_dist_design_fk2 FOREIGN KEY(design_id) REFERENCES tb_m_design(design_id);



ALTER TABLE tb_m_eci_dist_routing
	ADD CONSTRAINT tb_m_eci_dist_routing_fk1 FOREIGN KEY(eci_dist_id) REFERENCES tb_m_eci_dist(eci_dist_id);

ALTER TABLE tb_m_eci_dist_routing
	ADD CONSTRAINT tb_m_eci_dist_routing_fk2 FOREIGN KEY(routing_id) REFERENCES tb_m_routing(routing_id);

ALTER TABLE tb_m_eci_dist_routing
	ADD CONSTRAINT tb_m_eci_dist_routing_fk3 FOREIGN KEY(occurrence) REFERENCES tb_m_system(system_type_cd);



ALTER TABLE tb_m_eci_dist_impl_stage
	ADD CONSTRAINT tb_m_eci_dist_impl_stage_fk1 FOREIGN KEY(eci_dist_id) REFERENCES tb_m_eci_dist(eci_dist_id);

ALTER TABLE tb_m_eci_dist_impl_stage
	ADD CONSTRAINT tb_m_eci_dist_impl_stage_fk2 FOREIGN KEY(impl_stage_id) REFERENCES tb_m_impl_stage(impl_stage_id);



ALTER TABLE tb_m_eci_dist_project
	ADD CONSTRAINT tb_m_eci_dist_project_fk1 FOREIGN KEY(eci_dist_id) REFERENCES tb_m_eci_dist(eci_dist_id);

ALTER TABLE tb_m_eci_dist_project
	ADD CONSTRAINT tb_m_eci_dist_project_fk2 FOREIGN KEY(project_id) REFERENCES tb_m_project(project_id);



ALTER TABLE tb_m_eci_dist_edpe_criteria
	ADD CONSTRAINT tb_m_eci_dist_edpe_criteria_fk1 FOREIGN KEY(eci_dist_id) REFERENCES tb_m_eci_dist(eci_dist_id);

ALTER TABLE tb_m_eci_dist_edpe_criteria
	ADD CONSTRAINT tb_m_eci_dist_edpe_criteria_fk2 FOREIGN KEY(setting_cd) REFERENCES tb_m_setting(setting_cd);



ALTER TABLE tb_m_flow
	ADD CONSTRAINT tb_m_flow_fk1 FOREIGN KEY(dept_id) REFERENCES tb_m_dept_flow(dept_id);

ALTER TABLE tb_m_flow
	ADD CONSTRAINT tb_m_flow_fk2 FOREIGN KEY(step_id) REFERENCES tb_m_step_flow(step_id);
	



ALTER TABLE tb_m_routing
	ADD CONSTRAINT tb_m_routing_fk1 FOREIGN KEY(routing_category) REFERENCES tb_m_system(system_type_cd);



ALTER TABLE tb_m_project
	ADD CONSTRAINT tb_m_project_fk1 FOREIGN KEY(car_family_id) REFERENCES tb_m_car_family(car_family_id);



ALTER TABLE tb_m_setting
	ADD CONSTRAINT tb_m_setting_fk1 FOREIGN KEY(gruop_cd) REFERENCES tb_m_setting_group(gruop_cd);

ALTER TABLE tb_m_setting
	ADD CONSTRAINT tb_m_setting_fk2 FOREIGN KEY(parent_cd) REFERENCES tb_m_setting(setting_cd);

ALTER TABLE tb_m_setting
	ADD CONSTRAINT tb_m_setting_fk3 FOREIGN KEY(id_pic_by) REFERENCES tb_m_system(system_type_cd);

ALTER TABLE tb_m_setting
	ADD CONSTRAINT tb_m_setting_fk4 FOREIGN KEY(position) REFERENCES tb_m_system(system_type_cd);

ALTER TABLE tb_m_setting
	ADD CONSTRAINT tb_m_setting_fk5 FOREIGN KEY(rel_data_to) REFERENCES tb_m_system(system_type_cd);



ALTER TABLE tb_m_setting_group
ADD CONSTRAINT tb_m_setting_group_fk1 FOREIGN KEY(flow_id) REFERENCES tb_m_flow(flow_id);

ALTER TABLE tb_m_setting_group
ADD CONSTRAINT tb_m_setting_group_fk2 FOREIGN KEY(group_type) REFERENCES tb_m_system(system_type_cd);