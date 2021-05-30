#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
//package ${package}.system.utils;
//
//import ${package}.system.vo.SysDeptVo;
//import ${package}.system.vo.SysMenuVo;
//import ${package}.system.vo.TreeSelectVo;
//
//import java.util.stream.Collectors;
//
///**
// * 树形列表构建
// *
// * @author luyanan
// * @since 2021/2/11
// **/
//public class TreeSelectBuilder {
//
//	/**
//	 * 菜单构建成树形列表
//	 *
//	 * @param sysMenuVo 菜单
//	 * @return ${package}.system.vo.TreeSelectVo
//	 * @since 2021/2/11
//	 */
//	public static TreeSelectVo build(SysMenuVo sysMenuVo) {
//		return TreeSelectVo.builder().id(sysMenuVo.getMenuId())
//				.label(sysMenuVo.getMenuName())
//				.children(sysMenuVo.getChildren().stream().map(a -> TreeSelectBuilder.build(a)).collect(Collectors.toList())).build();
//	}
//
//	/**
//	 * 部门构建成树形列表
//	 *
//	 * @param sysDeptVo 部门
//	 * @return ${package}.system.vo.TreeSelectVo
//	 * @since 2021/2/11
//	 */
//	public static TreeSelectVo build(SysDeptVo sysDeptVo) {
//		return TreeSelectVo.builder().id(sysDeptVo.getDeptId())
//				.label(sysDeptVo.getDeptName())
//				.children(sysDeptVo.getChildren().stream().map(a -> TreeSelectBuilder.build(a)).collect(Collectors.toList())).build();
//	}
//
//}
