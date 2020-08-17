package com.sbs.ssm.at.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/usr/test/showImg")
	@ResponseBody
	public String showImg() {
		return "이미지ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ";
	}
}
