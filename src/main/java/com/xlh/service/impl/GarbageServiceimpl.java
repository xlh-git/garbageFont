package com.xlh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xlh.mapper.GarbageMapper;
import com.xlh.pojo.Garbage;
import com.xlh.pojo.GarbageInfo;
import com.xlh.pojo.GarbageRequire;
import com.xlh.pojo.GarbageType;
import com.xlh.service.GarbageService;
@Service
public class GarbageServiceimpl implements GarbageService{
   @Resource
	GarbageMapper garbageMapper;

@Override
public List<GarbageInfo> show() {
	List<GarbageInfo> selAll = garbageMapper.selAll();
	return selAll;
}

@Override
public List<GarbageInfo> selByName(String name) {
	List<GarbageInfo> selByName = garbageMapper.selByName(name);
	return selByName;
}

@Override
public List<GarbageInfo> selByTypeId(String tid) {
    List<GarbageInfo> selByTypeId = garbageMapper.selByTypeId(tid);
    return selByTypeId;
}

/*@Override
public List<GarbageInfo> selByNameAndType(String tid, String name) {
    List<GarbageInfo> selByNameAndType = garbageMapper.selByNameAndType(tid, name);
	return selByNameAndType;
}*/

@Override
public List<GarbageInfo> selByRealName(String name) {
	List<GarbageInfo> selByRealName = garbageMapper.selByRealName(name);
	return selByRealName;
}

@Override
public List<GarbageType> selDetailByTid(String tid) {
	List<GarbageType> selDetailByTid = garbageMapper.selDetailByTid(tid);
	return selDetailByTid;
}

//@Override
//public List<GarbageRequire> selRequireByTid(String tid) {
//	List<GarbageRequire> selRequireByTid = garbageMapper.selRequireByTid(tid);
//	return selRequireByTid;
//}


}
