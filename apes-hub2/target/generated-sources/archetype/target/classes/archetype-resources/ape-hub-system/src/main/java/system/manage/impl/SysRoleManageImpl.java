#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import ${package}.system.mapper.SysRoleMapper;
import ${package}.system.manage.ISysRoleManage;
import ${package}.system.entity.SysRoleDo;
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
