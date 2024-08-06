package com.data.api.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsMockListSizeMethod() {
		List listMock = mock(List.class); 
		when(listMock.size()).thenReturn(2);
		assertEquals(2,listMock.size());
	}

	@Test
	public void letsMockListSize_ReturnMultipleValues() {
		List listMock = mock(List.class); 
		when(listMock.get(0)).thenReturn("Hey");
		
		
		assertEquals("Hey",listMock.get(0));
		assertEquals(null,listMock.get(1));  // default value
	}
	
}
