package com.boot.project.kyg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 文章信息
 * </p>
 *
 * @author jobob
 * @since 2019-09-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GxArticle  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章类型:1.政策，2.文章,3.公告
     */
    private String type;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章链接
     */
    private String contentUrl;

    /**
     * 宣传图地址
     */
    private String publicityUrl;

    /**
     * 文章图片地址
     */
    private String logoUrl;

    /**
     * 操作者
     */
    private Integer operationId;

    /**
     * 阅读量
     */
    private Integer readsNumber;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;


}
