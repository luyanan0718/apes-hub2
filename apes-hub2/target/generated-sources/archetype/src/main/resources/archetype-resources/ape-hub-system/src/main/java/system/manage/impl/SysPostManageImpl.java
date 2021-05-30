#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import ${package}.system.entity.SysPostDo;
import ${package}.system.mapper.SysPostMapper;
import ${package}.system.manage.ISysPostManage;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 岗位信息表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysPostManageImpl extends ManageImpl<SysPostMapper, SysPostDo> implements ISysPostManage {

}
