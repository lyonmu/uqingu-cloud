package com.uqingu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author uqingu@foxmail.com
 * @since 2022-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Site implements Serializable {

    private static final long serialVersionUID = 11231265643L;

    /**
     * 系统自增id
     */
//    @TableId(value = "id")
    private Long id;

    /**
     * 系统logo链接
     */
    private String logo;

    /**
     * 网站图标
     */
    private String icon;

    /**
     * 网站名称
     */
    private String title;

    /**
     * 网站slogan
     */
    private String slogan;

    /**
     * 网站创建时间
     */
    private Long createtime;

    /**
     * 网站页面背景图
     */
    private String background;

    /**
     * 工信部备案号
     */
    private String ministry;

    /**
     * 公安部备案号
     */
    private String police;
}
