package com.harrison.jpa.study.entity.goods;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Long
 * @since 2019-10-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "t_goods_prize_log")
public class TGoodsPrizeLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long saasId;

    /**
     *  对应的订单编号
     */
    private Long tradeNo;


    /**
     * 奖品主键
     */
    private Long prizeId;

    /**
     * 奖品名
     */
    private String prizeNm;

    /**
     * 团长主键
     */
    private Long commId;


    /**
     * 团长
     */
    private String commNm;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     *   是否中奖
     */
    private String catCd;

    /**
     *   是否中奖
     */
    private String catNm;

    /**
     * 创建时间（领取时间）
     */
    private LocalDateTime createTime;

    /**
     * 创建人（领取人）
     */
    private String createBy;

    /**
     * 使用时间
     */
    private LocalDateTime updateTime;

    /**
     * 使用人
     */
    private String updateBy;

    private Integer delFlag;


}
