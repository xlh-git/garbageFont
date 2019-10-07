package com.xlh.pojo;

public class FeedBackMessage {
private int id;
private String feedbackmessage;
private int fid;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFeedbackmessage() {
	return feedbackmessage;
}
public void setFeedbackmessage(String feedbackmessage) {
	this.feedbackmessage = feedbackmessage;
}
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
@Override
public String toString() {
	return "FeedBackMessage [id=" + id + ", feedbackmessage=" + feedbackmessage + ", fid=" + fid + "]";
}

}
