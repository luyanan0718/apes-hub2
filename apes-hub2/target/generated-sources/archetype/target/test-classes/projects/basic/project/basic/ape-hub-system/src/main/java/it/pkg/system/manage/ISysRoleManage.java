package it.pkg.system.manage;

import com.easy.archetype.data.manage.IManage;
import it.pkg.system.entity.SysRoleDo;

import java.util.List;

/**
 * <p>
 * 角色信息表 manage
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
public interface ISysRoleManage extends IManage<SysRoleDo> {

	/**
	 * 根据用户id查询角色
	 * @param userId 用户id
	 * @return java.util.List<it.pkg.system.entity.SysRoleDo>
	 * @since 2021/2/4
	 */
	List<SysRoleDo> selectRolePermissionByUserId(Long userId);

}
