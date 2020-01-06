package com.harrison.jpa.study.entity.goods;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p>
 * 上架商品表
 * </p>
 *
 * @author Long
 * @since 2019-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "t_goods_shop")
public class TGoodsShop implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 主键
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * SAAS主键
   */
  private Long saasId;

  /**
   * SPU主键
   */
  private Long spuId;

  /**
   * 品牌主键
   */
  private Long brandId;

  /**
   * 品牌名称
   */
  private String brandNm;

  /**
   * 类别主键
   */
  private Long categoryId;

  /**
   * 产品名称
   */
  private String spuNm;

  /**
   * 原价
   */
  private BigDecimal lowPrice;

  /**
   * 现价（活动价）
   */
  private BigDecimal price;

  /**
   * 会员价格
   */
  private BigDecimal vipPrice;

  /**
   * 产品图片
   */
  private String imgUrl;

  /**
   * 排序
   */
  private Integer sort;

  /**
   * 上架时间
   */
  private LocalDateTime startTime;

  /**
   * 下架时间
   */
  private LocalDateTime endTime;

  /**
   * 截单日期
   */
  private LocalTime deadlineTime;

  /**
   * 截单送货期限
   */
  private Integer weekNum;

  /**
   * 备注
   */
  private String rmks;

  /**
   * 截单达或周几达编码
   */
  private String catCd;

  /**
   * 截单达或周几达
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

  private Integer soldNum;

  private Integer remainNum;

}
