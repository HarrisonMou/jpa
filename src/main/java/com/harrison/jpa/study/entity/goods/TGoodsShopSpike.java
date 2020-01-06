package com.harrison.jpa.study.entity.goods;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
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
 * 秒杀商品表
 * </p>
 *
 * @author Long
 * @since 2019-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "t_goods_shop_spike")
public class TGoodsShopSpike implements Serializable {

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
   * SPU主键
   */
  private Long spuId;

  /**
   * 品牌主键
   */
  private Long brandId;

  /**
   * 类别主键
   */
  private Long categoryId;

  /**
   * 产品名称
   */
  private String spuNm;

  /**
   * 原价格
   */
  private BigDecimal lowPrice;

  /**
   * 秒杀价格
   */
  private BigDecimal spikePrice;

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
   * 开始日期
   */
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  private LocalDateTime startDate;

  /**
   * 开始时间
   */
  @JsonSerialize(using = LocalTimeSerializer.class)
  @JsonDeserialize(using = LocalTimeDeserializer.class)
  private LocalTime startTime;

  /**
   * 结束日期
   */
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  private LocalDateTime endDate;

  /**
   * 结束时间
   */
  @JsonSerialize(using = LocalTimeSerializer.class)
  @JsonDeserialize(using = LocalTimeDeserializer.class)
  private LocalTime endTime;


  /**
   * 截单日期
   */
  @JsonSerialize(using = LocalTimeSerializer.class)
  @JsonDeserialize(using = LocalTimeDeserializer.class)
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
   * 单个用户限制购买数量
   */
  private Integer limitNum;

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
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  private LocalDateTime createTime;

  /**
   * 创建人
   */
  private String createBy;

  /**
   * 修改时间
   */
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  private LocalDateTime updateTime;

  /**
   * 修改人
   */
  private String updateBy;

  /**
   * 修订状态：0 新建 1 已删除
   */
  private Integer delFlag;

  private Integer soldNum1;

  private Integer remainNum1;

}
