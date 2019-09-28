package com.boot.project.kyg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 广告宣传
 * </p>
 *
 * @author jobob
 * @since 2019-09-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GxAdvertisement {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 图片id
     */
    private Integer imgId;

    /**
     * 广告图链接
     */
    private String advertisementUrl;

    private LocalDateTime creatDate;

    private LocalDateTime updateDate;


}
