package com.guojianchao.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.guojianchao.util.FileUtil;;

/**
 * @作者 国建超
 * @日期 2019年9月23日
 * @时间 下午3:11:21
 * 类功能：
 *
 */
public class TestUtils {

	@Test
	public void testDir(){
		String pathString = "D:\\内网通\\文件\\拾间\\CMS\\main\\webapp\\resource\\js";
		List<String> fileList = FileUtil.getFileList(pathString);
		for (String string : fileList) {
			System.out.println(" string  is "  + string);
		}
	}
	
	@Test
	public void testReadFile() throws IOException{
		String fileName = "D:\\内网通\\文件\\拾间\\CMS\\main\\webapp\\resource\\js\\jquery-3.2.1.js";
		String string = FileUtil.readFile(fileName);
		string = string.replaceAll("\\\n", "<br/>\n");
		System.out.println(" string  is " + string);
	}

	
}
