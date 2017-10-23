package com.magic.happypi.utils;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 文件处理类
 * 
 * @author sxc
 *
 */
public class FileUtil {

	/**
	 * 文件上传
	 * 
	 * @param file
	 * @param pictureAddress 存放地址
	 * @return 文件生成的路径地址
	 */
	public static String handleFileUpload(MultipartFile file, String pictureAddress) {
		String fileName = "";
		if (!file.isEmpty()) {
			try {
				fileName = Util.objStr(System.currentTimeMillis()) + Util.randomNumber(8)+"."+file.getOriginalFilename().split("\\.")[1];
				Files.copy(file.getInputStream(), Paths.get(pictureAddress,fileName));
			} catch (Exception e) {
				e.getStackTrace();
				fileName = "";
			}
		}
		return fileName;
	}
	
	
	/**
	 * 文件下载
	 * 
	 * @param filename 文件名称
	 * @param pictureAddress 存放地址
	 * @return
	 */
	public static ResponseEntity<byte[]> downloadFile(String filename, String pictureAddress){
		try {
			filename=new String(filename.getBytes("ISO-8859-1"),"UTF-8");     //不知何故，result.jsp的请求参数是ISO-8859-1编码的，但明明设置了charset=utf-8
	        File file=new File(pictureAddress+filename);
	        HttpHeaders headers=new HttpHeaders();
	        String downloadFileName=new String(filename.getBytes("UTF-8"),"ISO-8859-1");  //少了这句，可能导致下载中文文件名的文档，只有后缀名的情况
	        headers.setContentDispositionFormData("attachment", downloadFileName);//告知浏览器以下载方式打开
	        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);//设置MIME类型
	        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
	}
	
//	public boolean isexitsPath(String path)throws InterruptedException{
//		String [] paths=path.split("\\\\");
//		StringBuffer fullPath=new StringBuffer();
//		for (int i = 0; i < paths.length; i++) {
//			fullPath.append(paths[i]).append("\\\\");
//			File file=new File(fullPath.toString());
//		 if(paths.length-1!=i){
//			if(!file.exists()){
//				file.mkdir();
//				System.out.println("创建目录为："+fullPath.toString());
//				Thread.sleep(1500);
//			}
//		 }
//		}
//		File file=new File(fullPath.toString());
//		if (!file.exists()) {
//			return true;
//		}else{
//			return false;
//		}
//	}
	
}
