#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import ${package}.system.manage.ISysJobLogManage;
import ${package}.system.mapper.SysJobLogMapper;
import ${package}.system.entity.SysJobLogDo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务调度日志表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysJobLogManageImpl extends ManageImpl<SysJobLogMapper, SysJobLogDo> implements ISysJobLogManage {

}
