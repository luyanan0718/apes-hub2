#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage.impl;

import ${package}.system.manage.ISysJobManage;
import com.easy.archetype.data.manage.impl.ManageImpl;
import ${package}.system.mapper.SysJobMapper;
import ${package}.system.entity.SysJobDo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务调度表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysJobManageImpl extends ManageImpl<SysJobMapper, SysJobDo> implements ISysJobManage {

}
