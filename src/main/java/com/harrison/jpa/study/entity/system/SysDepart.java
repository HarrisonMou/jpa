package com.harrison.jpa.study.entity.system;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * <p>
 * 部门表
 * <p>
 * 
 * @Author Steve
 * @Since  2019-01-22
 */
@Data
@Entity
@Table(name = "sys_depart")
public class SysDepart implements Serializable {
    private static final long serialVersionUID = 1L;
    
	/**ID*/
	@Id
	@GeneratedValue(generator = "faceset_generator")
	@GenericGenerator(name = "faceset_generator", strategy = "uuid")
	private String id;
	/**父机构ID*/
	private String parentId;
	/**机构/部门名称*/
	private String departName;
	/**英文名*/
	private String departNameEn;
	/**缩写*/
	private String departNameAbbr;
	/**排序*/
	private Integer departOrder;
	/**描述*/
	private String description;
	/**机构类型*/
	private String orgType;
	/**机构编码*/
	private String orgCode;
	/**手机号*/
	private String mobile;
	/**传真*/
	private String fax;
	/**地址*/
	private String address;
	/**备注*/
	private String memo;
	/**状态（1启用，0不启用）*/
	private String status;
	/**删除状态（0，正常，1已删除）*/
	private String delFlag;
	/**创建人*/
	private String createBy;
	/**创建日期*/
	private Date createTime;
	/**更新人*/
	private String updateBy;
	/**更新日期*/
	private Date updateTime;
	
	/**
	 * 重写equals方法
	 */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
			return true;
		}
        if (o == null || getClass() != o.getClass()) {
			return false;
		}
        if (!super.equals(o)) {
			return false;
		}
        SysDepart depart = (SysDepart) o;
        return Objects.equals(id, depart.id) &&
                Objects.equals(parentId, depart.parentId) &&
                Objects.equals(departName, depart.departName) &&
                Objects.equals(departNameEn, depart.departNameEn) &&
                Objects.equals(departNameAbbr, depart.departNameAbbr) &&
                Objects.equals(departOrder, depart.departOrder) &&
                Objects.equals(description, depart.description) &&
                Objects.equals(orgType, depart.orgType) &&
                Objects.equals(orgCode, depart.orgCode) &&
                Objects.equals(mobile, depart.mobile) &&
                Objects.equals(fax, depart.fax) &&
                Objects.equals(address, depart.address) &&
                Objects.equals(memo, depart.memo) &&
                Objects.equals(status, depart.status) &&
                Objects.equals(delFlag, depart.delFlag) &&
                Objects.equals(createBy, depart.createBy) &&
                Objects.equals(createTime, depart.createTime) &&
                Objects.equals(updateBy, depart.updateBy) &&
                Objects.equals(updateTime, depart.updateTime);
    }

    /**
     * 重写hashCode方法
     */
    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, parentId, departName,
        		departNameEn, departNameAbbr, departOrder, description, 
        		orgType, orgCode, mobile, fax, address, memo, status, 
        		delFlag, createBy, createTime, updateBy, updateTime);
    }
}
