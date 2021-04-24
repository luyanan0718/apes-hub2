package com.ape.hub.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import com.ape.hub.system.entity.SysPostDo;
import com.ape.hub.system.mapper.SysPostMapper;
import com.ape.hub.system.manage.ISysPostManage;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 岗位信息表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysPostManageImpl extends ManageImpl<SysPostMapper, SysPostDo> implements ISysPostManage {

}
