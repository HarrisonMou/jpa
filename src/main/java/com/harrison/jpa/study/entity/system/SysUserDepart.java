package com.harrison.jpa.study.entity.system;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "sys_user_depart")
public class SysUserDepart implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键id*/
	@Id
	@GeneratedValue(generator = "faceset_generator")
	@GenericGenerator(name = "faceset_generator", strategy = "uuid")
	private String id;
	/**用户id*/
	private String userId;
	/**部门id*/
	private String depId;
	public SysUserDepart(String id, String userId, String depId) {
		super();
		this.id = id;
		this.userId = userId;
		this.depId = depId;
	}
	
}
