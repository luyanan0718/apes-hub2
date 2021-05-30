package it.pkg.system.mapper;

import com.easy.archetype.data.mybatisplus.BaseMapperPlus;
import it.pkg.system.entity.SysRoleMenuDo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 角色和菜单关联表 mapper
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Mapper
public interface SysRoleMenuMapper extends BaseMapperPlus<SysRoleMenuDo> {

}
