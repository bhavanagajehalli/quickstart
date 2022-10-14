package com.training.service;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;

import com.training.ifaces.ImageProcessing;
@WebService(endpointInterface = "com.training.ifaces.ImageProcessing")
public class ImagaeProcessingImpl implements ImageProcessing {

	@Override
	public Image getImage(String imageName) {
		
		try {
			return ImageIO.read(new File(imageName));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public String sendImage(Image images) {
		
		BufferedImage buffImage=(BufferedImage)images;
		try {
			ImageIO.write(buffImage, "png", new File("download.png"));
			return "Image Upload Sucess";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Image Upload Failed";
		}
		
	}

}
