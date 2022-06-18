package info.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import info.example.beans.DataBean;
import info.example.beans.MapBean;
import info.example.beans.StringBean;


@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(DataBean bean) {
		
		
		bean.setName("홍길");
		bean.setPw("12435");
		bean.setAddress_1("10532");
		bean.setAddress_2("906608");
		
		
		return "test1";
	}
	
	
	@GetMapping("/test2")
	public String test2(@ModelAttribute ("testBean") DataBean bean) {
		
		bean.setName("홍길동동이");
		bean.setPw("12435");
		bean.setAddress_1("10532");
		bean.setAddress_2("906608");
		
		return "test2";
	}
	
	
	@GetMapping("/test3")
	public String test3(@ModelAttribute ("test3bean") DataBean bean) {
		return "test3";
	}
	
//	@GetMapping("/test3")
//	public String test3(StringBean bean, Model model) {
//		
//		bean.setB1("data1");
//		bean.setB2("data2");
//		bean.setB3("data3");
//		bean.setB4("data4");
//		
//		ArrayList<String> data_list1 = new ArrayList<String>();
//		data_list1.add("data1");
//		data_list1.add("data2");
//		data_list1.add("data3");
//		model.addAttribute("data_list1", data_list1);
//		
//		MapBean map_bean1 = new MapBean();
//		MapBean map_bean2 = new MapBean();
//		MapBean map_bean3 = new MapBean();
//		
//		map_bean1.setKey("항목1");
//		map_bean1.setValue("data1");
//		
//		map_bean2.setKey("항목2");
//		map_bean2.setValue("data2");
//		
//		map_bean3.setKey("항목3");
//		map_bean3.setValue("data3");
//		
//		ArrayList<MapBean> data_list2 = new ArrayList<MapBean>();
//		
//		data_list2.add(map_bean1);
//		data_list2.add(map_bean2);
//		data_list2.add(map_bean3);
//		
//		model.addAttribute("data_list2", data_list2);
//		
//		
//		return "test3";
//	}
	
	
	@PostMapping("/result")
	//public String results(@ModelAttribute("empBean") DataBean bean) {
	public String result(DataBean bean) {
		
		return "result";
	}
	
	
}

