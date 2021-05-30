#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.service.impl;

import ${package}.system.manage.ISysJobManage;
import ${package}.system.service.ISysJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务调度表 serviceImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysJobServiceImpl implements ISysJobService {

	@Autowired
	private ISysJobManage iSysJobManage;

}
