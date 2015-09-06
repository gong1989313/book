package com.gxq.book.dao;

import java.util.List;

import com.gxq.book.entity.BaseType;
import com.gxq.book.entity.BookType;
import com.gxq.book.entity.FirstClass;
import com.gxq.book.entity.SecondClass;


public interface BookTypeDao {
	public BaseType findBaseTypeById(int id);
	
	public List<BaseType> getBaseType();
	
	public List<BookType> getBookTypeByBaseId(int baseId);
	
	public List<FirstClass> getFirstClassByTypeId(int typeId);
	
	public List<SecondClass> getSecondClassByFirstId(int firstId);
}
