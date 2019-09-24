package com.guojianchao.test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;

import com.guojianchao.util.FileUtil;

/**
 * @作者 国建超
 * @日期 2019年9月16日
 * @时间 上午9:23:34
 * 类功能：
 *
 */

public class FileTest {

	@Test
   public void main() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException{
	   
		String fileName="D:\\cojava\\GuoJianChao-common\\src\\main\\resources\\regio";
		
	    List list = FileUtil.fileToBean(fileName,Regio.class.getConstructor(    		
	    		String.class,String.class,String.class,String.class,String.class
	    		
	    		));
	    
	    
	    for (int i = 0; i < list.size(); i++) {
			
	    	System.out.println("list is"+list.get(i));
		}
		
   }
	
	
}
