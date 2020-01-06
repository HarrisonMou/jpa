package com.harrison.jpa.study.entity.system;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 菜单权限规则表
 * </p>
 *
 * @Author huangzhilin
 * @since 2019-03-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "sys_permission_data_rule")
public class SysPermissionDataRule implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * id
	 */
	@Id
	@GeneratedValue(generator = "faceset_generator")
	@GenericGenerator(name = "faceset_generator", strategy = "uuid")
	private String id;
	
	/**
	 * 对应的菜单id
	 */
	private String permissionId;
	
	/**
	 * 规则名称
	 */
	private String ruleName;
	
	/**
	 * 字段
	 */
	private String ruleColumn;
	
	/**
	 * 条件
	 */
	private String ruleConditions;
	
	/**
	 * 规则值
	 */
	private String ruleValue;
	
	/**
	 * 状态值 1有效 0无效
	 */
	private String status;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 创建人
	 */
	private String createBy;
	
	/**
	 * 修改时间
	 */
	private Date updateTime;
	
	/**
	 * 修改人
	 */
	private String updateBy;
}
