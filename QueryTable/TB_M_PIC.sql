CREATE TABLE TB_M_PIC
(
  NOREG                VARCHAR2(8 BYTE),
  NOREG_NAME           VARCHAR2(60 BYTE),
  GENDER               VARCHAR2(20 BYTE),
  EMAIL_ADDRESS        VARCHAR2(64 BYTE),
  SH_NOREG             VARCHAR2(8 BYTE),
  SH_NOREG_NAME        VARCHAR2(60 BYTE),
  SH_EMAIL_ADDRESS     VARCHAR2(64 BYTE),
  DPH_NOREG            VARCHAR2(8 BYTE),
  DPH_NOREG_NAME       VARCHAR2(60 BYTE),
  DPH_EMAIL_ADDRESS    VARCHAR2(64 BYTE),
  SH_NOREG_PREV        VARCHAR2(8 BYTE),
  SH_NOREG_PREV_NAME   VARCHAR2(60 BYTE),
  DPH_NOREG_PREV       VARCHAR2(8 BYTE),
  DPH_NOREG_PREV_NAME  VARCHAR2(60 BYTE),
  CREATED_BY           VARCHAR2(50 BYTE),
  CREATED_DT           TIMESTAMP(6),
  CHANGED_BY           VARCHAR2(50 BYTE),
  CHANGED_DT           TIMESTAMP(6),
  DIVISION             VARCHAR2(255 BYTE),
  DEPARTEMENT          VARCHAR2(255 BYTE),
  SECTION              VARCHAR2(255 BYTE)
);