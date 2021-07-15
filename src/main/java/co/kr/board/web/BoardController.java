package co.kr.board.web;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.kr.board.service.BoardService;

@Controller
public class BoardController {
	
	@Resource(name="testService")
	private BoardService testService;
	
	@RequestMapping(value="/mainPage.do")
	public String mainPage(){
		return "/board/main";
	}
	
	@RequestMapping(value="/insertPage.do")
	public String insertPage(){
		return "/board/insert";
	}
	
	@RequestMapping(value="/updatePage.do", method = RequestMethod.GET)
	public String updatePage(int nb, Model model, HashMap<String, Object>params){
		HashMap<String, Object> updateList = testService.updatePage(nb);
		model.addAttribute("data", updateList);
		return "/board/update";
	}
	
	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public String updata(@RequestParam HashMap<String, Object>params){
		params.put("boardNb", Integer.parseInt((String)params.get("boardNb")));
		testService.update(params);
		return "redirect:/select.do";
	}
	
	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String insert(@RequestParam HashMap<String, Object>params){
		params.put("boardNb", Integer.parseInt((String)params.get("boardNb")));
		testService.insert(params);
		return "redirect:/select.do";
	}
	
	@RequestMapping(value="/select.do")
	public String select(Model model, HashMap<String, Object>params){
		List<HashMap<String, Object>> mainList = testService.select();
		model.addAttribute("result", mainList);
		return "/board/main";
	}
	
	@RequestMapping(value="/detailPage.do") //번호 누르면 상세페이지로 이동
	public String deletePage(Model model, int nb, HashMap<String, Object>params){
		HashMap<String, Object> deleteList = testService.deletePage(nb);
		model.addAttribute("data", deleteList);
		return "/board/detail";
	}
	
	@RequestMapping(value="/delete.do")
	public String delete(int nb){
		testService.delete(nb);
		return "redirect:/select.do";
	}
	
	@RequestMapping(value="/delete1.do")
	public String ajaxTest(HttpServletRequest request){
		
		String[] ajaxMsg = request.getParameterValues("valueArr");
		int size = ajaxMsg.length;
		for(int i=0; i<size; i++){
			testService.ajaxTest(ajaxMsg[i]);
		}
		return "redirect:/select.do";
	}
}