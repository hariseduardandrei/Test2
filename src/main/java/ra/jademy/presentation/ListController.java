package ra.jademy.presentation;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ra.jademy.domain.ProductType;

@Controller
public class ListController {
	
	@RequestMapping("/productList/{productType}")
	public ModelAndView productList(@PathVariable("productType") ProductType productType) {
		System.out.println("Am primit lista de " + productType);
		return new ModelAndView("productList");
	}
}
