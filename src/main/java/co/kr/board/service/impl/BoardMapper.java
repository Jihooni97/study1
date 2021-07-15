package co.kr.board.service.impl;

import java.util.HashMap;
import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("testMapper")
public interface BoardMapper {

	public void insert(HashMap<String, Object> params);
	
	public List<HashMap<String, Object>> select();
	
	public HashMap<String, Object> deletePage(int nb);	
	
	public void delete(int nb);
	
	public HashMap<String, Object> updatePage(int nb);
	
	public void update(HashMap<String, Object> params);

	public void ajaxTest(String string);
}