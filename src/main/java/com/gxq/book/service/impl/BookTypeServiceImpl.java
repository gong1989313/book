package com.gxq.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxq.book.dao.BookTypeDao;
import com.gxq.book.dto.BaseTypeDto;
import com.gxq.book.dto.StrutsTreeNode;
import com.gxq.book.entity.BaseType;
import com.gxq.book.entity.BookType;
import com.gxq.book.entity.FirstClass;
import com.gxq.book.entity.SecondClass;
import com.gxq.book.service.BookTypeService;

@Service
public class BookTypeServiceImpl implements BookTypeService {

	@Autowired
	private BookTypeDao bookTypeDao;

	@Override
	public StrutsTreeNode getNode() {
		List<BaseType> baseTypes = bookTypeDao.getBaseType();
		StrutsTreeNode strutsTreeNode = new StrutsTreeNode(0, "root", "ROOT");
		if(baseTypes != null && !baseTypes.isEmpty()){
			int baseId = -1, typeId = -1, firstId = -1, secondId = -1;
			for(BaseType base : baseTypes){
				if(base != null){
					baseId = base.getId();
					strutsTreeNode.addChildren(new StrutsTreeNode(baseId, base.getName(), base.getCode()));
					List<BookType> bookTypes = bookTypeDao.getBookTypeByBaseId(baseId);
					if(bookTypes != null && !bookTypes.isEmpty()){
						StrutsTreeNode bookTypeTreeNode = StrutsTreeNode.getById(baseId);
						for(BookType bookType : bookTypes){
							if(bookType != null){
								typeId = bookType.getId();
								bookTypeTreeNode.addChildren(new StrutsTreeNode(typeId, bookType.getCode(), bookType.getName()));
								List<FirstClass> firstClasses = bookTypeDao.getFirstClassByTypeId(typeId);
								if(firstClasses != null && !firstClasses.isEmpty()){
									for(FirstClass firstClass : firstClasses){
										if(firstClass != null){
											firstId = firstClass.getId();
											StrutsTreeNode firstClassTreeNode = StrutsTreeNode.getById(typeId);
											firstClassTreeNode.addChildren(new StrutsTreeNode(firstId, firstClass.getCode(), firstClass.getName()));
											List<SecondClass> secondClasses =  bookTypeDao.getSecondClassByFirstId(firstId);
											if(secondClasses != null && !secondClasses.isEmpty()){
												for(SecondClass secondClass : secondClasses){
													secondId = secondClass.getId();
													StrutsTreeNode secondClassTreeNode = StrutsTreeNode.getById(firstId);
													secondClassTreeNode.addChildren(new StrutsTreeNode(secondId, secondClass.getCode(), secondClass.getName()));
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return strutsTreeNode;
	}

	@Override
	public List<BaseTypeDto> getBaseType() {
		List<BaseType> baseTypes = bookTypeDao.getBaseType();
		if(baseTypes != null && !baseTypes.isEmpty()){
			List<BaseTypeDto> dtos = new ArrayList<BaseTypeDto>();
			for(BaseType baseType : baseTypes){
				BaseTypeDto dto = BaseTypeDto.buildFrom(baseType);
				dtos.add(dto);
			}
			return dtos;
		}
		return null;
	}

	@Override
	public List<BookType> getBookTypeByBaseId(int baseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FirstClass> getFirstClassByTypeId(int typeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SecondClass> getSecondClassByFirstId(int firstId) {
		// TODO Auto-generated method stub
		return null;
	}

}
