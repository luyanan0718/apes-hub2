package com.ape.hub.system.mapper;

import com.easy.archetype.data.mybatisplus.BaseMapperPlus;
import com.ape.hub.system.entity.SysJobDo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 定时任务调度表 mapper
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Mapper
public interface SysJobMapper extends BaseMapperPlus<SysJobDo> {

}
