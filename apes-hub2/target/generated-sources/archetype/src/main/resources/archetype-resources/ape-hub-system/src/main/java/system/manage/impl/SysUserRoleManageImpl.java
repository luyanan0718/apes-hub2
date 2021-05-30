#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage.impl;

import cn.hutool.core.collection.CollectionUtil;
import ${package}.system.mapper.SysUserRoleMapper;
import com.easy.archetype.data.manage.impl.ManageImpl;
import ${package}.system.entity.SysUserRoleDo;
import ${package}.system.manage.ISysUserRoleManage;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户和角色关联表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysUserRoleManageImpl extends ManageImpl<SysUserRoleMapper, SysUserRoleDo> implements ISysUserRoleManage {

	@Override
	public void deleteByRoleIds(List<Long> roleIds) {
		if (CollectionUtil.isEmpty(roleIds)) {
			return;
		}
		this.remove(lambdaQueryWrapper(null).in(SysUserRoleDo::getRoleId, roleIds));
	}
}
