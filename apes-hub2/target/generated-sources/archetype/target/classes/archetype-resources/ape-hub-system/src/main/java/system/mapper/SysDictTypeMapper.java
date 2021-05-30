#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.mapper;

import com.easy.archetype.data.mybatisplus.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;
import ${package}.system.entity.SysDictTypeDo;

/**
 * <p>
 * 字典类型表 mapper
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Mapper
public interface SysDictTypeMapper extends BaseMapperPlus<SysDictTypeDo> {

}
