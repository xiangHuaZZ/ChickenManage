package io.renren.chick.chicken.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 原料出库
 * 
 * @author zhengXiangHua
 * @email 912358463@qq.com
 * @date 2020-10-01 15:30:45
 */
@Data
@TableName("MaterialOut")
public class MaterialoutEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 出库单号
	 */
	private Long outNo;
	/**
	 * 出库日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date outDate;
	/**
	 * 出库类型
	 */
	private String outCategory;
	/**
	 * 供商编号
	 */
	private Long supplierNo;
	/**
	 * 供商名称
	 */
	private String supplierName;
	/**
	 * 经办人
	 */
	private String agent;
	/**
	 * 应付金额
	 */
	private BigDecimal sumPay;
	/**
	 * 已付金额
	 */
	private BigDecimal hasPay;
	/**
	 * 未付金额
	 */
	private BigDecimal noPay;
	/**
	 * 备注
	 */
	private String remarks;

}
