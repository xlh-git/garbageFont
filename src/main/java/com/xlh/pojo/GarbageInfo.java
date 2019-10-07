package com.xlh.pojo;

//返回表所需要的信息 id,垃圾名称,垃圾种类,具体详情,投放要求
public class GarbageInfo {
private int id;
private int no;
private int tid;
private String gname;
private String tname;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}


public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
@Override
public String toString() {
	return "GarbageInfo [id=" + id + ", no=" + no + ", tid=" + tid + ", gname=" + gname + ", tname=" + tname + "]";
}


}
