package com.xlh.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xlh.pojo.GarbageInfo;
import com.xlh.pojo.GarbageRequire;
import com.xlh.pojo.GarbageType;
import com.xlh.service.GarbageService;

@Controller
public class GarbageController {
	@Resource
	private GarbageService GarbageServiceimpl;

	@ResponseBody
	@RequestMapping("selAll")
	public void selAll(HttpServletResponse response, HttpServletRequest request) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		List<GarbageInfo> show = GarbageServiceimpl.show();
		ObjectMapper mapper = new ObjectMapper();
		String result = mapper.writeValueAsString(show);
		response.getWriter().write(result);
	}

	@ResponseBody
	@RequestMapping("selByName")
	public void selByName(HttpServletResponse response, HttpServletRequest request) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		String name = request.getParameter("name");
		name = new String(name.getBytes("iso8859-1"), "UTF-8");
		List<GarbageInfo> selByName = GarbageServiceimpl.selByName(name);
		ObjectMapper mapper = new ObjectMapper();
		String result = mapper.writeValueAsString(selByName);
		response.getWriter().write(result);
	}

	@ResponseBody
	@RequestMapping("selByTypeId")
	public void selByTypeId(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html;charset=UTF-8");
		String tid = request.getParameter("tid");
		List<GarbageInfo> selByTypeId = GarbageServiceimpl.selByTypeId(tid);
		ObjectMapper mapper = new ObjectMapper();
		String result = mapper.writeValueAsString(selByTypeId);
		response.getWriter().write(result);
	}

	@ResponseBody
	@RequestMapping("selByRealName")
	public void selByRealName(HttpServletResponse response, HttpServletRequest request) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		String name = request.getParameter("name");
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> map = new HashMap<>();
		List<GarbageInfo> selByRealName = GarbageServiceimpl.selByRealName(name);
		if (selByRealName.size() > 0) {
			map.put("chekInfo", 0);
			String result = mapper.writeValueAsString(map);
			response.getWriter().write(result);
		} else {
			map.put("checkInfo", 1);
			String result = mapper.writeValueAsString(map);
			response.getWriter().write(result);
		}
	}
	@ResponseBody
    @RequestMapping("selDetailByTid")
    public void selDetailByTid(HttpServletResponse response, HttpServletRequest request) throws IOException {
		String tid = request.getParameter("tid");
		response.setContentType("text/html;charset=UTF-8");
		List<GarbageType> selDetailByTid = GarbageServiceimpl.selDetailByTid(tid);
		ObjectMapper mapper = new ObjectMapper();
		String result = mapper.writeValueAsString(selDetailByTid);
		response.getWriter().write(result);
	}
//	@ResponseBody
//    @RequestMapping("selRequireByTid")
//    public void selRequireByTid(HttpServletResponse response, HttpServletRequest request) throws IOException {
//		String tid = request.getParameter("tid");
//		response.setContentType("text/html;charset=UTF-8");
//		List<GarbageRequire> selRequireByTid = GarbageServiceimpl.selRequireByTid(tid);
//		ObjectMapper mapper = new ObjectMapper();
//		String result = mapper.writeValueAsString(selRequireByTid);
//		response.getWriter().write(result);
//	}
	
}
