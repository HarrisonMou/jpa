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
 * 菜单权限表
 * </p>
 *
 * @Author scott
 * @since 2018-12-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "sys_permission")
public class SysPermission implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@Id
	@GeneratedValue(generator = "faceset_generator")
	@GenericGenerator(name = "faceset_generator", strategy = "uuid")
	private String id;

	/**
	 * 父id
	 */
	private String parentId;

	/**
	 * 菜单名称
	 */
	private String name;

	/**
	 * 菜单权限编码，例如：“sys:schedule:list,sys:schedule:info”,多个逗号隔开
	 */
	private String perms;
	/**
	 * 权限策略1显示2禁用
	 */
	private String permsType;

	/**
	 * 菜单图标
	 */
	private String icon;

	/**
	 * 组件
	 */
	private String component;
	
	/**
	 * 组件名字
	 */
	private String componentName;

	/**
	 * 路径
	 */
	private String url;
	/**
	 * 一级菜单跳转地址
	 */
	private String redirect;

	/**
	 * 菜单排序
	 */
	private Integer sortNo;

	/**
	 * 类型（0：一级菜单；1：子菜单 ；2：按钮权限）
	 */
	private Integer menuType;

	/**
	 * 是否叶子节点: 1:是  0:不是
	 */
	private boolean leaf;
	
	/**
	 * 是否路由菜单: 0:不是  1:是（默认值1）
	 */
	private boolean route;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 创建人
	 */
	private String createBy;

	/**
	 * 删除状态 0正常 1已删除
	 */
	private Integer delFlag;
	
	/**
	 * 是否配置菜单的数据权限 1是0否 默认0
	 */
	private Integer ruleFlag;
	
	/**
	 * 是否隐藏路由菜单: 0否,1是（默认值0）
	 */
	private boolean hidden;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新人
	 */
	private String updateBy;

	/**
	 * 更新时间
	 */
	private Date updateTime;
	
	/**按钮权限状态(0无效1有效)*/
	private java.lang.String status;
	
	/**alwaysShow*/
    private boolean alwaysShow;
    
    public SysPermission() {
    	
    }
    public SysPermission(boolean index) {
    	if(index) {
    		this.id = "9502685863ab87f0ad1134142788a385";
        	this.name="首页";
        	this.component="dashboard/Analysis";
        	this.url="/dashboard/analysis";
        	this.icon="home";
        	this.menuType=0;
        	this.sortNo=0;
        	this.ruleFlag=0;
        	this.delFlag=0;
        	this.alwaysShow=false;
        	this.route=true;
        	this.leaf=true;
        	this.hidden=false;
    	}
    	
    }
}