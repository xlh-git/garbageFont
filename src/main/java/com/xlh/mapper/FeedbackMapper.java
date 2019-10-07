package com.xlh.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface FeedbackMapper {

	//插入信息
	@Insert("insert into feedbackmessage(feedbackmessage,fid) values(#{feedbackMessage},#{fid})")
	int insFeedbackMessage(@Param("feedbackMessage")String feedbackMessage,@Param("fid")int fid);
}
