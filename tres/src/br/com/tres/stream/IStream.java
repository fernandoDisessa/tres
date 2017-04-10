package br.com.tres.stream;

public interface IStream {
 
	char getNext();
 
	boolean hasNext();
	
	String getInputStream();
}