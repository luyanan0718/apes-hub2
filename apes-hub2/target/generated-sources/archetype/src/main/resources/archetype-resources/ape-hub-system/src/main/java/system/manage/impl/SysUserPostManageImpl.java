#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import ${package}.system.manage.ISysUserPostManage;
import ${package}.system.mapper.SysUserPostMapper;
import ${package}.system.entity.SysUserPostDo;
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
