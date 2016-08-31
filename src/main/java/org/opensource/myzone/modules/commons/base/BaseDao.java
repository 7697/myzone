package org.opensource.myzone.modules.commons.base;

/**
 * 基础DAO
 * @author king
 *
 */
public interface BaseDao<T> extends Dao<T> {

	public int insert(T t);
	
	public int delete(T t);
	
	public int update(T t);
	
	public T select(T t);
}
