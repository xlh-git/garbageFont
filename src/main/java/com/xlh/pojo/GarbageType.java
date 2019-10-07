package com.xlh.pojo;

public class GarbageType {
private int id;
private String name;
private String image;
private String detail;
private String demand;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}

public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}

public String getDemand() {
	return demand;
}
public void setDemand(String demand) {
	this.demand = demand;
}
@Override
public String toString() {
	return "GarbageType [id=" + id + ", name=" + name + ", image=" + image + ", detail=" + detail + ", demand=" + demand
			+ "]";
}

}
