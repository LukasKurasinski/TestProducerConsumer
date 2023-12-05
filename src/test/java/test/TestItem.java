package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Item;
import test.mockclass.MockItem;

public class TestItem {
	
	@Test
	@DisplayName("Test if Id is lower case after init")
	void testConstructorLowerCase() {
		MockItem mockItem = new MockItem("ABC");
		assertEquals("abc", mockItem.getId());
	}
	
	@Test
	@DisplayName("Test if Id is Empty after init")
	void testConstructorEmpty() {
		MockItem mockItem = new MockItem("");
		assertEquals("", mockItem.getId());
	}
	@Test
	@DisplayName("Test if Id is null after init")
	void testConstructorNull() throws NullPointerException{

		assertThrows(NullPointerException.class, () -> new MockItem(null));
	}
	@Test
	@DisplayName("Test if Id is number after init")
	void testConstructorNumber() {
		MockItem mockItem = new MockItem("123");
		assertEquals("123", mockItem.getId());
	}
	
	@Test
	@DisplayName("Test if Name is lower case")
	void testNameLowerCase() {
		MockItem mockItem = new MockItem("");
		mockItem.setId("ABC");
		assertEquals("abc", mockItem.getId());
	}
	
	@Test
	@DisplayName("Test if Name is Empty")
	void testNameEmpty() {
		MockItem mockItem = new MockItem("ABC");
		mockItem.setId("");
		assertEquals("", mockItem.getId());
	}
	@Test
	@DisplayName("Test if Name is null")
	void testNameNull() throws NullPointerException{
		MockItem mockItem = new MockItem("ABC");
		assertThrows(NullPointerException.class, () -> mockItem.setId(null));

	}
	@Test
	@DisplayName("Test if Name is number")
	void testNameNumber() {
		MockItem mockItem = new MockItem("");
		mockItem.setId("123");
		assertEquals("123", mockItem.getId());
	}
	
	
	
	
	
	
}
