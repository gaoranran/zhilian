package com.jk.service.Impl;

import com.jk.dao.TreeMapper;
import com.jk.model.Tree;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceImpl implements TreeService {
	@Autowired
	private TreeMapper treeMapper;
	@Override
	public List<Tree> queryTree(int pid) {
		List<Tree> list = treeMapper.queryTree(pid);
		if(list.size()>0 && list !=null){
			for (int i = 0; i <list.size() ; i++) {
				if (list.get(i).getId() != null){
					List<Tree> list2 = queryTree(list.get(i).getId());
					list.get(i).setChildren(list2);
				}
			}
		}
		return list ;
	}
}
