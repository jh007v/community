package com.study.community;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.dto.TestVO;
import com.study.service.TestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private TestService service;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		
		logger.info("home");
        
        List<TestVO> testList = service.selectValue();
        
        model.addAttribute("testList", testList);
 
        return "home";

//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(Locale locale, Model model) throws Exception {
		
		logger.info("create");
        
        List<TestVO> testCreate = service.selectValue();
        
        model.addAttribute("testCreate", testCreate);
 
        return "create";

	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String read(Locale locale, Model model) throws Exception {
		
		logger.info("home");
        
        List<TestVO> testList = service.selectValue();
        
        model.addAttribute("testList", testList);
 
        return "home";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String update(Locale locale, Model model) throws Exception {
		
		logger.info("home");
        
        List<TestVO> testList = service.selectValue();
        
        model.addAttribute("testList", testList);
 
        return "home";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String delete(Locale locale, Model model) throws Exception {
		
		logger.info("home");
        
        List<TestVO> testList = service.selectValue();
        
        model.addAttribute("testList", testList);
 
        return "home";
	}
}
