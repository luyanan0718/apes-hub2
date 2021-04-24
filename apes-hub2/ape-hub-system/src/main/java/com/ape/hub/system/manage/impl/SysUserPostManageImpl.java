package com.ape.hub.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import com.ape.hub.system.manage.ISysUserPostManage;
import com.ape.hub.system.mapper.SysUserPostMapper;
import com.ape.hub.system.entity.SysUserPostDo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户与岗位关联表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysUserPostManageImpl extends ManageImpl<SysUserPostMapper, SysUserPostDo> implements ISysUserPostManage {

}
