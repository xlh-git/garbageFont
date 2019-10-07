package com.xlh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xlh.mapper.FeedbackMapper;
import com.xlh.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{

	@Resource
	private FeedbackMapper feedbackMapper;
	@Override
	public int insFeedbackMessage(String feedbackMessage, int fid) {
        int insFeedbackMessage = feedbackMapper.insFeedbackMessage(feedbackMessage, fid);
		return insFeedbackMessage;
	}

}
