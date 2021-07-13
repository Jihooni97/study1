package co.kr.board.service;

import java.util.HashMap;
import java.util.List;

public interface BoardService {

	void insert(HashMap<String, Object> params);

	public List<HashMap<String, Object>> select();

	public HashMap<String, Object> deletePage(int nb);
	
	public void delete(int nb);

	public HashMap<String, Object> updatePage(int nb);

	public void update(HashMap<String, Object> params);
}
	