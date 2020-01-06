package com.harrison.jpa.study.entity.goods;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * <p>
 * 库存流水表
 * </p>
 *
 * @author Long
 * @since 2019-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "t_goods_stock_flow")
public class TGoodsStockFlow implements Serializable {

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
   * 订单编号
   */
  private Long orderNo;

  /**
   * 订单商品名称
   */
  private String orderNm;

  /**
   * SKU主键
   */
  private Long skuId;

  /**
   * 库存前数量
   */
  private Integer stockBefore;

  /**
   * 库存后数量
   */
  private Integer stockAfter;

  /**
   * 记录
   */
  private Integer stockChange;

  /**
   * 预库存前数量
   */
  private Integer lockStockBefore;

  /**
   * 预库存后数量
   */
  private Integer lockStockAfter;

  /**
   * 预记录
   */
  private Integer lockStockChange;

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
  private Timestamp createTime;

  /**
   * 创建人
   */
  private String createBy;

  /**
   * 修改时间
   */
  private Timestamp updateTime;

  /**
   * 修改人
   */
  private String updateBy;

  /**
   * 修订状态：0 新建 1 已删除
   */
  private Integer delFlag;


}
