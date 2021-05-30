#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.mapper;

import com.easy.archetype.data.mybatisplus.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;
import ${package}.system.entity.SysUserRoleDo;

/**
 * <p>
 * 用户和角色关联表 mapper
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Mapper
public interface SysUserRoleMapper extends BaseMapperPlus<SysUserRoleDo> {

}
