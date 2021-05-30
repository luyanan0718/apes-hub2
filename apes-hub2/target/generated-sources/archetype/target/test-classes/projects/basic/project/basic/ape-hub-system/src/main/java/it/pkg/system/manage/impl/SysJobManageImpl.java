package it.pkg.system.manage.impl;

import it.pkg.system.manage.ISysJobManage;
import com.easy.archetype.data.manage.impl.ManageImpl;
import it.pkg.system.mapper.SysJobMapper;
import it.pkg.system.entity.SysJobDo;
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
