package com.harrison.jpa.study.entity.goods;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * <p>
 * 会员信息表
 * </p>
 *
 * @author Long
 * @since 2019-07-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "t_easy_user")
public class TEasyUser implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 主键
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * 微信id
   */
  private String openid;

  /**
   * 微信通用id
   */
  private String unionid;

  /**
   * 微信昵称
   */
  private String nm;

  /**
   * 微信头像
   */
  private String imgUrl;

  /**
   * 手机号
   */
  private String phone;

  /**
   * 所属商户主键
   */
  private Long busId;

  /**
   * 所属商户名称
   */
  private String busNm;

  /**
   * 所属团长主键
   */
  private Long commId;

  /**
   * 所属团长名称
   */
  private String commNm;

  /**
   * 城市ID
   */
  private String cityId;

  /**
   * 城市名称
   */
  private String cityNm;

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
