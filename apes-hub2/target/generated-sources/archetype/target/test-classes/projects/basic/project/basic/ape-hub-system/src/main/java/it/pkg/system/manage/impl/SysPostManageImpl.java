package it.pkg.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import it.pkg.system.entity.SysPostDo;
import it.pkg.system.mapper.SysPostMapper;
import it.pkg.system.manage.ISysPostManage;
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
