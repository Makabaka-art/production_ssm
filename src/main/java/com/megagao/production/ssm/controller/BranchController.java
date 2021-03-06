package com.megagao.production.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;
import com.megagao.production.ssm.service.BranchService;

@Controller
@RequestMapping("/branch")
public class BranchController {
 @Autowired
 private BranchService branchService;
 @RequestMapping("/find")
 public String find() throws Exception{
	 System.out.println(11);
	 return "branch_list";
 }
 @RequestMapping("/list")
 @ResponseBody
 public EUDataGridResult getList(Integer page, Integer rows)
 	throws Exception{
	 System.out.println(22);
		EUDataGridResult result = branchService.getList(page, rows);
		return result ;
	 
 }
}
