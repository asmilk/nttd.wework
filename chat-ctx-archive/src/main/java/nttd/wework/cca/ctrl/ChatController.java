package nttd.wework.cca.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ChatController {
	
	@GetMapping("/chat")
	public String chat() {
		log.info("ChatController.chat");
		return "chat";
	}

}
