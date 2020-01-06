package com.harrison.jpa.study.entity.goods;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * <p>
 * 交易商品表
 * </p>
 *
 * @author Long
 * @since 2019-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "t_goods_trade_item")
public class TGoodsTradeItem implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 主键
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * 交易单号
   */
  private Long tradeNo;

  /**
   * 会员ID
   */
  private Long userId;

  /**
   * 会员名称
   */
  private String userNm;

  /**
   * 商家ID
   */
  private Long busId;

  /**
   * 商家名称
   */
  private String busNm;

  /**
   * 团长ID
   */
  private Long commId;

  /**
   * 团长名称
   */
  private String commNm;

  /**
   * sku主键
   */
  private Long skuId;

  /**
   * sku名称
   */
  private String skuNm;

  /**
   * sku图片
   */
  private String skuImg;

  /**
   * 下单时单价
   */
  private BigDecimal currentPrice;

  /**
   * 商品数量
   */
  private Integer skuNum;

  /**
   * 商品总价
   */
  private BigDecimal totalPrice;

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
   * 提货码
   */
  private String count;

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
