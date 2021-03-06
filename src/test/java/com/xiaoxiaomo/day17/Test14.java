package com.xiaoxiaomo.day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 复制一个文本文件
 * @author xiaoxiaomo
 *
 */
public class Test14 {
	public static void main(String[] args) throws IOException {
		//读取源文件
		//转换并指定编码进行读取
		//高效读取
		BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream("d:\\abc.txt"),"gbk"));
		//目标文件
		//指定编码集进行写入
		//高效写入
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:\\ccc.txt"),"gbk"));
		
		//循环读取并且写入目标文件
		/*String line = null;
		while((line = bfr.readLine()) != null){
			bfw.write(line);
			bfw.newLine();
			bfw.flush();
		}*/
		
		int ch = 0;
		while((ch = bfr.read()) != -1){
			bfw.write(ch);
		}
		
		//关闭流
		bfr.close();
		bfw.close();
		
	}
}
