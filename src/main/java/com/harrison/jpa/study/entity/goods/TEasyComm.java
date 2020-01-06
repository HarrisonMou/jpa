package com.harrison.jpa.study.entity.goods;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 团长信息表
 * </p>
 *
 * @author Long
 * @since 2019-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "t_easy_comm")
public class TEasyComm implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 主键
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * 所属商家主键
   */
  private Long busId;

  /**
   * 所属商家名称
   */
  private String busNm;

  /**
   * 城市名称
   */
  private String cityNm;

  /**
   * 城市ID
   */
  private String cityId;

  /**
   * 团长名称
   */
  private String nm;

  /**
   * 团长手机
   */
  private String phone;

  /**
   * 团长地址
   */
  private String adderss;

  /**
   * 经度
   */
  private Double longitude;

  /**
   * 纬度
   */
  private Double latitude;

  /**
   * 身份证
   */
  private String idCard;

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
   * 删除标记（0为新建 1为删除）
   */
  private Integer delFlag;


}
