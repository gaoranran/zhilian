package com.jk.dao;

import com.jk.model.Tree;

import java.util.List;

public interface TreeMapper {
	List<Tree> queryTree(int pid);
}
