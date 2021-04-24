package com.ape.hub.system.manage.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.easy.archetype.data.manage.impl.ManageImpl;
import com.ape.hub.system.entity.SysRoleDeptDo;
import com.ape.hub.system.manage.ISysRoleDeptManage;
import com.ape.hub.system.mapper.SysRoleDeptMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色和部门关联表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysRoleDeptManageImpl extends ManageImpl<SysRoleDeptMapper, SysRoleDeptDo> implements ISysRoleDeptManage {

	@Override
	public void deleteByRoleIds(List<Long> roleIds) {
		if (CollectionUtil.isEmpty(roleIds)) {
			return;
		}
		this.remove(lambdaQueryWrapper(null).in(SysRoleDeptDo::getRoleId, roleIds));
	}
}
