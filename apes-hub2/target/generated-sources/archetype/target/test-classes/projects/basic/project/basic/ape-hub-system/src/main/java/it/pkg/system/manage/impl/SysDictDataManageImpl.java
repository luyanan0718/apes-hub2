package it.pkg.system.manage.impl;

import com.easy.archetype.data.manage.impl.ManageImpl;
import it.pkg.system.mapper.SysDictDataMapper;
import it.pkg.system.manage.ISysDictDataManage;
import it.pkg.system.entity.SysDictDataDo;
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
