package com.ape.hub.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import com.ape.hub.system.mapper.SysRoleMapper;
import com.ape.hub.system.manage.ISysRoleManage;
import com.ape.hub.system.entity.SysRoleDo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色信息表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysRoleManageImpl extends ManageImpl<SysRoleMapper, SysRoleDo> implements ISysRoleManage {

	@Override
	public List<SysRoleDo> selectRolePermissionByUserId(Long userId) {

		return this.baseMapper.selectRolePermissionByUserId(userId);

	}

}
