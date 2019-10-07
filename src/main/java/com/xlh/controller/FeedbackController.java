package com.xlh.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xlh.service.FeedbackService;

@Controller
public class FeedbackController {
  
	@Resource
	private FeedbackService feedbackserviceimpl;
	
	@RequestMapping("insFeedbackMessage")
	public void insFeedback(String feedbackMessage, int fid,HttpServletResponse response) throws IOException {
		feedbackMessage = new String(feedbackMessage.getBytes("iso8859-1"), "UTF-8");
		int insFeedbackMessage = feedbackserviceimpl.insFeedbackMessage(feedbackMessage, fid);

	   response.getWriter().write("{\"insMessage\":"+insFeedbackMessage+"}");
	}
	
}
