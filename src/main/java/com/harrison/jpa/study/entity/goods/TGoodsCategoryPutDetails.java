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
 * @since 2019-11-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "t_goods_category_put_details")
public class TGoodsCategoryPutDetails implements Serializable {

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
     * 商品spuid
     */
    private Long spuId;

    /**
     * 商品名称
     */
    private String spuNm;

    /**
     * 类别主键
     */
    private Long categoryId;

    /**
     * 类别名称
     */
    private String categoryNm;

    /**
     * 备注（备用字段）
     */
    private String remark;

    /**
     * 备用字段
     */
    private String standby;

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
