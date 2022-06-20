package info.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import info.example.beans.DataBean;
import info.example.beans.ListBean;


@Controller
public class TestController {
	
	@GetMapping("FEtest")
	public String FEtest(DataBean bean) {
		
		bean.setB1("b1-hidden");
		bean.setB2("b2-text");
		bean.setB3("b3-pw");
		bean.setB4("b4-textarea");
		
		Map<String, String> data_map1 = new HashMap<String, String>();
		data_map1.put("list1", "data1");
		data_map1.put("list2", "data2");
		data_map1.put("list3", "data3");

		bean.setB5(data_map1);
		bean.setB6(data_map1);
		bean.setB7(data_map1);
		bean.setB8(data_map1);
		bean.setB9(data_map1);
		bean.setB10(data_map1);
		
		return "test1";
	}
	
	
	@PostMapping("FEresult")
	public String FEresult(DataBean bean) {
		
		return "result";
	}
	
}

