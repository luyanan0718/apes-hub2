#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置
 *
 * @author luyanan
 * @since 2021/1/24
 **/
@Configuration
@ComponentScan("${package}.common")
public class CommonAutoConfiguration {

}
