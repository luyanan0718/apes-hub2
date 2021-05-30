#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.mapper;

import com.easy.archetype.data.mybatisplus.BaseMapperPlus;
import ${package}.system.entity.SysPostDo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 岗位信息表 mapper
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Mapper
public interface SysPostMapper extends BaseMapperPlus<SysPostDo> {

}
