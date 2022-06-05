package com.frame;

import java.util.List;

public interface Service<K,V> {
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v) throws Exception;
	public V get(K k) throws Exception;
	public List<V> get() throws Exception;
//	public List<ItemVO> getPrice(Map<String, Integer> map);
//	public List<ItemVO> getDate(String string);
}
