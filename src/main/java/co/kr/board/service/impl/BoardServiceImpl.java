package co.kr.board.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.board.service.BoardService;

@Service("testService")
public class BoardServiceImpl implements BoardService{

	@Resource(name="testMapper")
	private BoardMapper testMapper;
	
	@Override
	public void insert(HashMap<String, Object> params) {
		testMapper.insert(params);
		
	}

	@Override
	public List<HashMap<String, Object>> select() {
		return testMapper.select();
	}

	@Override
	public HashMap<String, Object> deletePage(int nb) {
		return testMapper.deletePage(nb);
	}

	@Override
	public void delete(int nb) {
		testMapper.delete(nb);
	}

	@Override
	public HashMap<String, Object> updatePage(int nb) {
		return testMapper.updatePage(nb);
	}

	@Override
	public void update(HashMap<String, Object> params) {
		testMapper.update(params);
		
	}
}