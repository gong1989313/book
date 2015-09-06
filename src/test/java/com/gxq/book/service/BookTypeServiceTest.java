package com.gxq.book.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gxq.book.dto.StrutsTreeNode;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/*.xml" })
public class BookTypeServiceTest {
	@Autowired(required = true)
	private BookTypeService bookTypeService;

	@Test
	public void testGetBaseTypeNode() {
		/*StrutsTreeNode strutsTreeNode = bookTypeService.getBaseTypeNode();
		for(StrutsTreeNode node : strutsTreeNode.getChildren()){
			System.out.println(node.toString());
		}*/
	}

	@Test
	public void testGetBookTypeById() {
		/*StrutsTreeNode strutsTreeNode = bookTypeService.getBookTypeNodeByBaseId(1);
		for(StrutsTreeNode node : strutsTreeNode.getChildren()){
			System.out.println(node.toString());
		}*/
	}
}
