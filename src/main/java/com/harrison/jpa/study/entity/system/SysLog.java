package com.harrison.jpa.study.entity.system;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统日志表
 * </p>
 *
 * @Author zhangweijian
 * @since 2018-12-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "sys_log")
public class SysLog implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@Id
	@GeneratedValue(generator = "faceset_generator")
	@GenericGenerator(name = "faceset_generator", strategy = "uuid")
	private String id;

	/**
	 * 创建人
	 */
	private String createBy;

	/**
	 * 创建时间
	 */
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 更新人
	 */
	private String updateBy;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 耗时
	 */
	private Long costTime;

	/**
	 * IP
	 */
	private String ip;

	/**
	 * 请求参数
	 */
	private String requestParam;

	/**
	 * 请求类型
	 */
	private String requestType;

	/**
	 * 请求路径
	 */
	private String requestUrl;
	/**
	 * 请求方法
	 */
	private String method;

	/**
	 * 操作人用户名称
	 */
	private String username;
	/**
	 * 操作人用户账户
	 */
	private String userid;
	/**
	 * 操作详细日志
	 */
	private String logContent;

	/**
	 * 日志类型（1登录日志，2操作日志）
	 */
	private Integer logType;

	/**
	 * 操作类型（）
	 */
	private Integer operateType;

}
