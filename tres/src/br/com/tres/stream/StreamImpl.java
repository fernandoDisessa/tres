package br.com.tres.stream;

public class StreamImpl implements IStream {

	private String inputStream;

	private int lastIndex = -1;

	public StreamImpl(String input) {
		this.inputStream = input;
	}

	public char getNext() {
		lastIndex++;
		char next = inputStream.charAt(lastIndex);
		return next;
	}

	public boolean hasNext() {

		try {
			
			inputStream.charAt(lastIndex + 1);
			
			return true;
		} catch (IndexOutOfBoundsException ex) {
			
		}

		return false;
	}

	public String getInputStream() {
		return inputStream;
	}

}