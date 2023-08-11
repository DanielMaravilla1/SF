package com.solucionfactible.dev;

import static org.junit.Assert.*;

import org.junit.Test;

import static com.solucionfactible.dev.FindMissingLetter.findMissingLetter;

public class FindMissingLetterTest {

	@Test
	public void test() {
		assertEquals('e', findMissingLetter(new char[] { 'a','b','c','d','f' }));
		assertEquals('m', findMissingLetter(new char[] { 'k','l','n','o' }));
		assertEquals('w', findMissingLetter(new char[] { 'u','v','x' }));
        assertEquals('P', findMissingLetter(new char[] { 'O','Q','R','S' }));
        assertEquals('Y', findMissingLetter(new char[] { 'X','Z' }));
	}
	
	@Test
	public void testCaps() {
        assertEquals(' ', findMissingLetter(new char[] { 'a','b', 'c', 'E' }));
        assertEquals(' ', findMissingLetter(new char[] { 'e','f', 'H', 'I' }));
	}
	
	@Test
	public void testNumberLetters() {
        assertEquals(' ', findMissingLetter(new char[] { 'a' }));
        assertEquals(' ', findMissingLetter(new char[] { 'E' }));
	}
}
