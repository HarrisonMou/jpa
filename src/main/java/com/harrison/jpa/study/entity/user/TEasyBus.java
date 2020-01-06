package com.harrison.jpa.study.entity.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 商家信息表
 * </p>
 *
 * @author Long
 * @since 2019-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "t_easy_bus")
public class TEasyBus implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 主键
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * 商家名称
   */
  private String nm;

  /**
   * 城市名称
   */
  private String cityNm;

  /**
   * 城市编号
   */
  private String cityId;

  /**
   * 地址
   */
  private String address;

  /**
   * 收款人姓名
   */
  private String receiverNm;

  /**
   * 收款人身份证
   */
  private String idCard;

  /**
   * 收款人银行卡
   */
  private String bankCard;

  /**
   * 收款人电话
   */
  private String phone;

  /**
   * 商家二维码
   */
  private String storeTwoCode;

  /**
   * 商家小程序
   */
  private String storeLittleCode;

  /**
   * 门店码（独立小程序没有）
   */
  private String storeCode;

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
  private String udpateBy;

  /**
   * 类型编号
   */
  private String catCd;

  /**
   * 类型名称
   */
  private String catNm;

  /**
   * 状态编号
   */
  private String statCd;

  /**
   * 状态名称
   */
  private String statNm;

  /**
   * 删除标记（0为新建  1为删除）
   */
  private Integer delFlag;


}
