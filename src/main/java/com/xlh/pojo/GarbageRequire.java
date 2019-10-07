package com.xlh.pojo;

public class GarbageRequire {
private int id;
private String demand;
private int tid;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getDemand() {
	return demand;
}
public void setDemand(String demand) {
	this.demand = demand;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
@Override
public String toString() {
	return "GarbageRequire [id=" + id + ", demand=" + demand + ", tid=" + tid + "]";
}


}
