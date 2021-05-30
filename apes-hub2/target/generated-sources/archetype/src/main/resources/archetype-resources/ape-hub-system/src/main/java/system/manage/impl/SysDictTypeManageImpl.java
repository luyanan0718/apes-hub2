#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import ${package}.system.mapper.SysDictTypeMapper;
import ${package}.system.manage.ISysDictTypeManage;
import ${package}.system.entity.SysDictTypeDo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典类型表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysDictTypeManageImpl extends ManageImpl<SysDictTypeMapper, SysDictTypeDo> implements ISysDictTypeManage {

}
