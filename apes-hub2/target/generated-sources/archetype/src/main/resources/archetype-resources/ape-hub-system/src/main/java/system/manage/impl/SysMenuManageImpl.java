#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.easy.archetype.data.manage.impl.ManageImpl;
import ${package}.system.entity.SysMenuDo;
import ${package}.system.manage.ISysMenuManage;
import ${package}.system.mapper.SysMenuMapper;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 菜单权限表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysMenuManageImpl extends ManageImpl<SysMenuMapper, SysMenuDo> implements ISysMenuManage {

	@Override
	public List<SysMenuDo> findByIds(Collection<Long> menuIds, List<String> menuType) {
		LambdaQueryWrapper<SysMenuDo> queryWrapper = lambdaQueryWrapper(null);
		queryWrapper.in(CollectionUtil.isNotEmpty(menuType), SysMenuDo::getMenuType, menuType);
		queryWrapper.in(CollectionUtil.isNotEmpty(menuIds), SysMenuDo::getMenuId, menuIds);
		return this.list(queryWrapper);
	}

	@Override
	public List<SysMenuDo> findByIds(List<Long> menuIds, SysMenuDo sysMenuDo) {
		LambdaQueryWrapper<SysMenuDo> queryWrapper = lambdaQueryWrapper(sysMenuDo);
		queryWrapper.in(CollectionUtil.isNotEmpty(menuIds), SysMenuDo::getMenuId, menuIds);
		return this.list(queryWrapper);

	}

}
