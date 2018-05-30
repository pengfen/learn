package com.test;

import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader2 extends MyBufferedReader {
	private Reader r;

	private int lineNumber = 0;

	public MyLineNumberReader2(Reader r) {
		super(r);
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	@Override
	public String readLine() throws IOException {
		lineNumber++;
		return super.readLine();
	}
}