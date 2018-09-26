select 
F.FLOW_NAME
,p.noreg_name
,p.division
,p.departement
,ed.eci_type
,ed.project_status
,ed.impl_stage_status
,ED.CAR_FAMILY_STATUS
,ed.priority_status
,ed.design_status
,ed.routing_status
from tb_m_eci_dist ed
 left join tb_m_flow f on ED.FLOW_ID = F.FLOW_ID
 left join tb_m_pic p on p.noreg = ed.noreg
 
 where 
 ED.ECI_DIST_ID in (
 select ed.eci_dist_id from 
 tb_m_eci_dist ed
 left join tb_m_eci_dist_design edd on  EDD.ECI_DIST_ID = ED.ECI_DIST_ID
 left join tb_m_pic p on P.NOREG = ED.NOREG
 where 
 p.NOREG_name like upper('%%')
 )