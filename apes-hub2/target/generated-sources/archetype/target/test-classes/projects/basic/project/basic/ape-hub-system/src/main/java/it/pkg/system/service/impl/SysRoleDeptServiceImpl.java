package it.pkg.system.service.impl;

import it.pkg.system.entity.SysRoleDeptDo;
import it.pkg.system.service.ISysRoleDeptService;
import it.pkg.system.manage.ISysRoleDeptManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 角色和部门关联表 serviceImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysRoleDeptServiceImpl implements ISysRoleDeptService {

	@Autowired
	private ISysRoleDeptManage iSysRoleDeptManage;

	@Override
	public void delete(SysRoleDeptDo build) {
		iSysRoleDeptManage.delete(build);
	}

	@Override
	public void insertBatch(Long[] deptIds, Long roleId) {
		List<SysRoleDeptDo> roleDeptDoList = Arrays.stream(deptIds)
				.map(a -> SysRoleDeptDo.builder().deptId(a).roleId(roleId).build())
				.collect(Collectors.toList());
		iSysRoleDeptManage.insertBatch(roleDeptDoList);
	}

	@Override
	public void deleteByRoleIds(Long[] roleIds) {
		iSysRoleDeptManage.deleteByRoleIds(Arrays.asList(roleIds));

	}
}
