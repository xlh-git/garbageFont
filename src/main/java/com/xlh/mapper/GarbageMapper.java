package com.xlh.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.xlh.pojo.GarbageInfo;
import com.xlh.pojo.GarbageRequire;
import com.xlh.pojo.GarbageType;

//后台使用的
public interface GarbageMapper {
//查询表所需要的信息  包括垃圾名称和垃圾种类 
List<GarbageInfo> selAll();

//通过模糊垃圾名称查询垃圾种类
List<GarbageInfo> selByName(@Param("name")String name);

//通过查询垃圾种类来查询其中包含的垃圾
List<GarbageInfo> selByTypeId(@Param("tid")String tid);

//通过查询名字来查询垃圾
List<GarbageInfo> selByRealName(@Param("name")String name);

//通过垃圾种类来查询其图片和详细描述
List<GarbageType> selDetailByTid(@Param("tid")String tid);

////通过垃圾种类查询投放需求
//List<GarbageRequire> selRequireByTid(@Param("tid")String tid);

int updGarbageCount();
}
