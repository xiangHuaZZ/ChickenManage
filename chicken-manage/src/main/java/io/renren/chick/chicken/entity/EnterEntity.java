package io.renren.chick.chicken.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 进鸡登记
 * 
 * @author zhengXiangHua
 * @email 912358463@qq.com
 * @date 2020-10-01 15:30:45
 */
@Data
@TableName("Enter")
public class EnterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 批次号
	 */
	private Long batchNo;
	/**
	 * 进鸡日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date enterDate;
	/**
	 * 供商编号
	 */
	private Long supplierNo;
	/**
	 * 供商名称
	 */
	private String supplierName;
	/**
	 * 品种
	 */
	private String varieties;
	/**
	 * 数量
	 */
	private Long num;
	/**
	 * 单价
	 */
	private BigDecimal price;

	/**
	 * 成长天数
	 */
	private String growDays;
	/**
	 * 备注
	 */
	private String remarks;
	/*
	* 审核状态
	* */
	private Integer pass;
	/*
	 * 确认状态
	 * */
	private Integer certain;
}
