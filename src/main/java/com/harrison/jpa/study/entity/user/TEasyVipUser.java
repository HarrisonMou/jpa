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
 * 会员用户表
 * </p>
 *
 * @author Long
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "t_easy_vip_user")
public class TEasyVipUser implements Serializable {

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
     * 会员名称
     */
    private String userNm;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 注册会员开始时间
     */
    private LocalDateTime vipBeginTime;

    /**
     * 会员连续开始时间
     */
    private LocalDateTime vipTransferTime;

    /**
     * 会员到期时间
     */
    private LocalDateTime vipEndTime;

    /**
     * 总购买金额
     */
    private BigDecimal allBuyMoney;

    /**
     * 以为用户节省的金额
     */
    private BigDecimal saveMoney;

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
