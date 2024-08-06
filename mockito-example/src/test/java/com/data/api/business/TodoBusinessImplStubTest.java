package com.data.api.business;

import  org.junit.Assert.*;
import com.data.api.*;
import com.mockito.data.api.*;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");
	
	
	    assertEquals(2, filteredTodos.size());
	
	}

}
