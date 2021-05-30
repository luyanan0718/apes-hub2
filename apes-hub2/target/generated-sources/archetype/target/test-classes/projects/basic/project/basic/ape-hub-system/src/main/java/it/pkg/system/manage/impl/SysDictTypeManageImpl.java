package it.pkg.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import it.pkg.system.mapper.SysDictTypeMapper;
import it.pkg.system.manage.ISysDictTypeManage;
import it.pkg.system.entity.SysDictTypeDo;
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
