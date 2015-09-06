package com.gxq.book.service;

import java.util.List;

import com.gxq.book.dto.BaseTypeDto;
import com.gxq.book.dto.StrutsTreeNode;
import com.gxq.book.entity.BookType;
import com.gxq.book.entity.FirstClass;
import com.gxq.book.entity.SecondClass;

public interface BookTypeService {
	public StrutsTreeNode getNode();
	
	public List<BaseTypeDto> getBaseType();
	
	public List<BookType> getBookTypeByBaseId(int baseId);
	
	public List<FirstClass> getFirstClassByTypeId(int typeId);
	
	public List<SecondClass> getSecondClassByFirstId(int firstId);
}
