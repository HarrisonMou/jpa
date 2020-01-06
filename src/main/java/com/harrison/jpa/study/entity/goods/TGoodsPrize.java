package com.harrison.jpa.study.entity.goods;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "t_goods_prize")
public class TGoodsPrize implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 身份标识
     */
    private Long saasId;


    /**
     * 奖品名称
     */
    private String nm;

    /**
     * 中奖几率
     */
    private Double percent;

    /**
     * 奖品总数
     */
    private Integer total;

    /**
     * 抽奖时间
     */
    private LocalDate extractDate;

    /**
     * 抽奖结束时间
     */
    private LocalDate extractEndDate;

    /**
     * 使用开始时间
     */
    private LocalDate useStartDate;

    /**
     * 使用结束时间
     */
    private LocalDate useEndDate;

    /**
     * 备注
     */
    private String rmks;

    /**
     * 分类编码
     */
    private String catCd;

    /**
     * 分类
     */
    private String catNm;

    /**
     * 状态编码
     */
    private String statCd;

    /**
     * 状态
     */
    private String statNm;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 删除标记（0为新建 1为删除）
     */
    private Integer delFlag;


}
