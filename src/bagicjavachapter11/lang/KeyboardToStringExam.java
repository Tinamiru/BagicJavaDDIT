package bagicjavachapter11.lang;

import java.io.IOException;

public class KeyboardToStringExam {
public static void main(String[] args) throws IOException{
	byte[] bytes = new byte[100];
	
	System.out.print("입력: ");
	int readByteNo = System.in.read(bytes);
	System.out.println(readByteNo);
	
	String str = new String(bytes,0,readByteNo-2);
	System.out.println(str);
}
}
