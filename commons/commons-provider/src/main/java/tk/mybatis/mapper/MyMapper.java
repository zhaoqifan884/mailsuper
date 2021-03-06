package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 *
 * <p>
 * Description: MyMapper
 * </p>
 *
 * @author Administrator
 * @version v1.0.0
 * @since 2020-03-01 11:43:33
 * @see tk.mybatis.mapper
 *
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
