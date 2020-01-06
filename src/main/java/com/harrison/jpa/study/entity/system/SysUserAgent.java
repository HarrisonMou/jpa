package com.harrison.jpa.study.entity.system;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description: 用户代理人设置
 * @Author: jeecg-boot
 * @Date:  2019-04-17
 * @Version: V1.0
 */
@Data
@Entity
@Table(name = "sys_user_agent")
public class SysUserAgent implements Serializable {
    private static final long serialVersionUID = 1L;
    
	/**序号*/
	@Id
	@GeneratedValue(generator = "faceset_generator")
	@GenericGenerator(name = "faceset_generator", strategy = "uuid")
	private java.lang.String id;
	/**用户名*/
	private java.lang.String userName;
	/**代理人用户名*/
	private java.lang.String agentUserName;
	/**代理开始时间*/
	private java.util.Date startTime;
	/**代理结束时间*/
	private java.util.Date endTime;
	/**状态0无效1有效*/
	private java.lang.String status;
	/**创建人名称*/
	private java.lang.String createName;
	/**创建人登录名称*/
	private java.lang.String createBy;
	/**创建日期*/
	private java.util.Date createTime;
	/**更新人名称*/
	private java.lang.String updateName;
	/**更新人登录名称*/
	private java.lang.String updateBy;
	/**更新日期*/
	private java.util.Date updateTime;
	/**所属部门*/
	private java.lang.String sysOrgCode;
	/**所属公司*/
	private java.lang.String sysCompanyCode;
}
