package nttd.wework.cca.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {
	
	@GetMapping({"/", "/index"})
	public String index() {
		log.info("IndexController.index");
		return "index";
	}
	
	@GetMapping("/one")
	public String one() {
		log.info("IndexController.one");
		return "one";
	}
	
	@GetMapping("/two")
	public String two() {
		log.info("IndexController.two");
		return "two";
	}
	
	@GetMapping("/three")
	public String three() {
		log.info("IndexController.three");
		return "three";
	}

}
