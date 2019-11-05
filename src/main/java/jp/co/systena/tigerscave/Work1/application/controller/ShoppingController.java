package jp.co.systena.tigerscave.Work1.application.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jp.co.systena.tigerscave.Work1.application.model.Item;
import jp.co.systena.tigerscave.Work1.application.model.ListForm;
import jp.co.systena.tigerscave.Work1.application.service.ListService;



@Controller
public class ShoppingController {

	ListService listservice = new ListService();

	@Autowired
	private HttpSession session;

	Map itemList = null;

	@RequestMapping(value="/shoppingcontroller", method = RequestMethod.GET)          // URLとのマッピング
	public ModelAndView list(HttpSession session, ModelAndView mav,
			@RequestParam(name = "name", required = false) String name) {
		mav.addObject("items", new ListService().getItemList());
		mav.setViewName("shoppingcontroller");
		return mav;
	}
	@RequestMapping(value="/CartView", method = RequestMethod.POST)  // URLとのマッピング
	public ModelAndView order(ModelAndView mav, @Valid ListForm listForm, BindingResult bindingResult, HttpServletRequest request) {

	    Map<String, Item> cartList = new HashMap<String, Item>();
	    Map<String, Item> itemList = new ListService().getItemList();

	    mav.setViewName("CartView");
	    return mav;



	}

	}
