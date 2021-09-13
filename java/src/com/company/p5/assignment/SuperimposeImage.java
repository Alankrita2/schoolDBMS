package com.company.p5.assignment;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SuperimposeImage {
    public static void main(String args[])
    {
        System.out.println("enter path for image1");
        String path1= Reader.sc.nextLine();
        System.out.println("enter path for ");
        String path2= Reader.sc.nextLine();
        System.out.println("enter destination");
        String path3= Reader.sc.nextLine();
        try {
            BufferedImage base = ImageIO.read(new File(path1));
            BufferedImage overlay = ImageIO.read(new File(path2));
            Graphics2D g2d = base.createGraphics();
            g2d.setComposite(AlphaComposite.SrcOver.derive(0.5f));
            int x = (base.getWidth() - overlay.getWidth()) / 2;
            int y = (base.getHeight() - overlay.getHeight()) / 2;
            g2d.drawImage(overlay, x, y, null);
            g2d.dispose();
            ImageIO.write(base, "jpg", new File("C:\\Users\\alisha.sharan\\IdeaProjects\\IOStreams\\IOStreams\\src\\com\\company\\p1\\Blended.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
