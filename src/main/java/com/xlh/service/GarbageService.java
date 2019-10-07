package com.xlh.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xlh.pojo.Garbage;
import com.xlh.pojo.GarbageInfo;
import com.xlh.pojo.GarbageRequire;
import com.xlh.pojo.GarbageType;

public interface GarbageService {
//显示所需要的信息
List<GarbageInfo> show();

//通过名字来模糊查询垃圾种类
List<GarbageInfo> selByName(String name);

//通过类型来查询
List<GarbageInfo> selByTypeId(String tid);

//通过名字和类型来查询
/*List<GarbageInfo> selByNameAndType(String tid,String name);*/

//通过名字来准确查询垃圾种类
List<GarbageInfo> selByRealName(String name);

//通过垃圾种类来查询其图片和详细描述
List<GarbageType> selDetailByTid(@Param("tid")String tid);

////通过垃圾种类查询投放需求
//List<GarbageRequire> selRequireByTid(@Param("tid")String tid);
}
