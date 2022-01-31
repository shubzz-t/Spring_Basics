package com.spring.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadCOntroller {

	@RequestMapping("/uploadfile")
	public String filedisp() {
		return "fileupload";
	}

	@RequestMapping(value = "/uploadingfile", method = RequestMethod.POST)
	public String uploading(@RequestParam("profile") CommonsMultipartFile file, HttpSession session , Model model ) {
		
		model.addAttribute("file", file.getOriginalFilename()+"UPLOADED SUCCESSFULLY");
		
		//GETTING FILE DATA IN BYTES
		byte[] data = file.getBytes();
		//GETTING PATH TO STORE FILES
		String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "Images"
				+ File.separator + file.getOriginalFilename();
		
		//FILEOUTPUTSTREAM to write data to PATH 
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("FILE UPLOADED....");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("NOT UPLOADED....");
		}

		return "uploaded";
	}
}
