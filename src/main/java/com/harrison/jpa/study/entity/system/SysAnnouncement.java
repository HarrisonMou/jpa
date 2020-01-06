package com.harrison.jpa.study.entity.system;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description: 系统通告表
 * @Author: jeecg-boot
 * @Date:  2019-01-02
 * @Version: V1.0
 */
@Data
@Entity
@Table(name = "sys_announcement")
public class SysAnnouncement implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Id
    @GeneratedValue(generator = "faceset_generator")
    @GenericGenerator(name = "faceset_generator", strategy = "uuid")
    private java.lang.String id;
    /**
     * 标题
     */
    private java.lang.String titile;
    /**
     * 内容
     */
    private java.lang.String msgContent;
    /**
     * 开始时间
     */
    private java.util.Date startTime;
    /**
     * 结束时间
     */
    private java.util.Date endTime;
    /**
     * 发布人
     */
    private java.lang.String sender;
    /**
     * 优先级（L低，M中，H高）
     */
    private java.lang.String priority;

    /**
     * 消息类型1:通知公告2:系统消息
     */
    private java.lang.String msgCategory;
    /**
     * 通告对象类型（USER:指定用户，ALL:全体用户）
     */
    private java.lang.String msgType;
    /**
     * 发布状态（0未发布，1已发布，2已撤销）
     */
    private java.lang.String sendStatus;
    /**
     * 发布时间
     */
    private java.util.Date sendTime;
    /**
     * 撤销时间
     */
    private java.util.Date cancelTime;
    /**
     * 删除状态（0，正常，1已删除）
     */
    private java.lang.String delFlag;
    /**
     * 创建人
     */
    private java.lang.String createBy;
    /**
     * 创建时间
     */
    private java.util.Date createTime;
    /**
     * 更新人
     */
    private java.lang.String updateBy;
    /**
     * 更新时间
     */
    private java.util.Date updateTime;
    /**
     * 指定用户
     **/
    private java.lang.String userIds;
}
