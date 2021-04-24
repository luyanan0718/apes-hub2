package com.ape.hub.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import com.ape.hub.system.manage.ISysJobLogManage;
import com.ape.hub.system.mapper.SysJobLogMapper;
import com.ape.hub.system.entity.SysJobLogDo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务调度日志表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysJobLogManageImpl extends ManageImpl<SysJobLogMapper, SysJobLogDo> implements ISysJobLogManage {

}
