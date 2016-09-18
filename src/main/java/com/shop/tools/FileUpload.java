package com.shop.tools;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload {

	public static boolean upload(MultipartFile file, String path) {
		BufferedOutputStream stream = null;
		boolean isOk = false;
		try {
			byte[] bytes = file.getBytes();
			File saveFile=new File(path);    
	            if(!saveFile.exists())   {    
	            	saveFile.createNewFile();
	            }    
			stream = new BufferedOutputStream(new FileOutputStream(saveFile));
			stream.write(bytes);
			isOk = true;
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(stream != null)
				try {
					stream.close();
				} catch (IOException e) {
				}
		}
		return isOk;
	}
}
