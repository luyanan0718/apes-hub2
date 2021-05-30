#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage;

import com.easy.archetype.data.manage.IManage;
import ${package}.system.entity.SysJobLogDo;

/**
 * <p>
 * 定时任务调度日志表 manage
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
public interface ISysJobLogManage extends IManage<SysJobLogDo> {

}
