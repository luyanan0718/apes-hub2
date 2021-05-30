#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import ${package}.system.mapper.SysDictDataMapper;
import ${package}.system.manage.ISysDictDataManage;
import ${package}.system.entity.SysDictDataDo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典数据表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysDictDataManageImpl extends ManageImpl<SysDictDataMapper, SysDictDataDo> implements ISysDictDataManage {

}
