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

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @Author scott
 * @since 2018-12-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "sys_user_role")
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "faceset_generator")
    @GenericGenerator(name = "faceset_generator", strategy = "uuid")
    private String id;
    
    /**
     * 用户id
     */
    private String userId;

    /**
     * 角色id
     */
    private String roleId;

	public SysUserRole() {
	}

	public SysUserRole(String userId, String roleId) {
		this.userId = userId;
		this.roleId = roleId;
	}

    

}
