package com.ws.base.transfer.car.manage.sys.entity;

import lombok.Data;

@Data
public class CarHead {

    String SERIAL_NO;           //	N	NUMBER	N			流水号
    String ORG_ID;              //	N	NUMBER	Y
    String ORG_NAME;            //	N	VARCHAR2(50)	N
    String BILL_TYPE;           //	N	VARCHAR2(20)	N			业务类型/单据类型
    String BILL_NO;             //	N	VARCHAR2(50)	N			单据号
    String ITEM_CODE;           //	N	VARCHAR2(50)	N
    String ITEM_NAME;           //	N	VARCHAR2(100)	Y			物料名称
    String DELIVERY_PLACE;      //	N	VARCHAR2(100)	N			发货地
    String DEL_FLAG;            //	N	VARCHAR2(10)	N	(0)		删除标识(1:已删除，0：未删除，默认：0)
    String STATUS;              //	N	VARCHAR2(5)	N	('R')		状态位(R:Ready就绪,C:已制卡,G:过毛重,T:过皮重,S:Success成功,P:Posting传输中,E:Error失败)
    String ERROR_MSG;           //	N	VARCHAR2(1000)	Y			错误信息
    String CREATION_DATE;       //	N	DATE	N	SYSDATE		录入时间
    String CREATED_BY;          //	N	NUMBER	N	-1		录入人员
    String LAST_UPDATE_BY;      //	N	NUMBER	N	-1		上次更新人员
    String LAST_UPDATE_DATE;        //	N	DATE	N	SYSDATE		上次更新日期
    String LAST_UPDATE_LOGIN;   //	N	NUMBER	Y
    String BILL_LINE_ID;        //	N	NUMBER	Y			采购订单的唯一标识(分配行ID)   调拨的唯一标识（订单行号）
    String UNLOAD_PLACE;        //	N	VARCHAR2(200)	Y			卸货地点（华联、联合、海旺）
    String CREATED_USER;            //	N	VARCHAR2(200)	Y			创建人
    String LAST_UPDATE_USER;        //	N	VARCHAR2(200)	Y			最后修改人
    String LOAD_STATUS;         //	N	VARCHAR2(5)	Y	'0'

}
