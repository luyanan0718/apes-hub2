package com.ape.hub.system.manage.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.easy.archetype.data.manage.impl.ManageImpl;
import com.ape.hub.system.entity.SysRoleMenuDo;
import com.ape.hub.system.manage.ISysRoleMenuManage;
import com.ape.hub.system.mapper.SysRoleMenuMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色和菜单关联表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysRoleMenuManageImpl extends ManageImpl<SysRoleMenuMapper, SysRoleMenuDo> implements ISysRoleMenuManage {

	@Override
	public List<SysRoleMenuDo> findRoleIds(List<Long> roleIds) {
		LambdaQueryWrapper<SysRoleMenuDo> queryWrapper = lambdaQueryWrapper(null);
		queryWrapper.in(CollectionUtil.isNotEmpty(roleIds), SysRoleMenuDo::getRoleId, roleIds);
		return this.list(queryWrapper);
	}

}
