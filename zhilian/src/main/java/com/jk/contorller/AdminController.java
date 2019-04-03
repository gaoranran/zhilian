package com.jk.contorller;

import com.jk.model.Tree;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private TreeService treeService;
    @RequestMapping("/")
    public String index(){
        return "admin/index";
    }

    @ResponseBody
    @RequestMapping("/queryTree")
    public List<Tree> queryTree(){
        return treeService.queryTree(0);
    }

}
