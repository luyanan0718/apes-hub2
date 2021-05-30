#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.service;

import ${package}.system.entity.SysUserRoleDo;

import java.util.List;

/**
 * <p>
 * 用户和角色关联表 service
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
public interface ISysUserRoleService {

	/**
	 * 根据条件查询
	 *
	 * @param sysUserRoleDo
	 * @return java.util.List<${package}.system.entity.SysUserRoleDo>
	 * @since 2021/2/4
	 */
	List<SysUserRoleDo> list(SysUserRoleDo sysUserRoleDo);

	/**
	 * 批量插入
	 *
	 * @param roleIds 角色id集合
	 * @param userId  用户id
	 * @return void
	 * @since 2021/2/12
	 */
	void insertBatch(List<Long> roleIds, Long userId);


	/**
	 * 根据条件删除
	 *
	 * @param userRoleDo 实体条件
	 * @return void
	 * @since 2021/2/12
	 */
	void delete(SysUserRoleDo userRoleDo);

	/**
	 * 统计
	 *
	 * @param sysUserRoleDo
	 * @return Integer
	 * @since 2021/2/15
	 */
	Integer count(SysUserRoleDo sysUserRoleDo);

	/**
	 * 根据角色id数组删除
	 *
	 * @param roleIds 角色id数组
	 * @return void
	 * @since 2021/2/15
	 */
	void deleteByRoleIds(Long[] roleIds);
}
