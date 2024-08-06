package com.data.api.business;

import  org.junit.Assert.*;
import com.data.api.*;
import com.mockito.data.api.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.*;

import org.junit.Test;

public class TodoBusinessImplMockitoTest {

	@Test
	public void testMock() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");
	
	
	    assertEquals(2, filteredTodos.size());
	
	}

}
