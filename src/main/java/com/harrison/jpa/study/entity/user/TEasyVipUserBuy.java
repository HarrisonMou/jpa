package com.harrison.jpa.study.entity.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 会员购买记录表
 * </p>
 *
 * @author Long
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "t_sasy_vip_user_buy")
public class TEasyVipUserBuy implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long saasId;

    /**
     * 商户id
     */
    private Long busId;

    /**
     * 商户名称
     */
    private String busNm;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户名称
     */
    private String userNm;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 会员类型id
     */
    private Long vipId;

    /**
     * 会员类型名称
     */
    private String vipNm;

    /**
     * 会员原价
     */
    private BigDecimal originalPrice;

    /**
     * 会员活动价
     */
    private BigDecimal activityPrice;

    /**
     * 备注
     */
    private String rmks;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 修订状态：0 新建 1 已删除
     */
    private Integer delFlag;


}
