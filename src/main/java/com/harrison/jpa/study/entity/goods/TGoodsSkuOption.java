package com.harrison.jpa.study.entity.goods;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * sku属性表
 * </p>
 *
 * @author Long
 * @since 2019-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "t_goods_sku_option")
public class TGoodsSkuOption implements Serializable {

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
   * SKU主键
   */
  private Long skuId;

  /**
   * 属性主键
   */
  private Long propertyId;

  /**
   * 属性选项主键
   */
  private Long propertyOptionId;

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
