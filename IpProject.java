package ipproject;
import java.awt.Color;
import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO; 


/**
 *
 * @author UTKARSHA
 */
public class IpProject {

    /**
     * @param simg
     */
    public static void  reflection(BufferedImage simg){
    // Get source image dimension 
        int width = simg.getWidth(); 
        int height = simg.getHeight(); 
  
        // BufferedImage for mirror image 
        BufferedImage mimg = new BufferedImage(width, height, 
                                        BufferedImage.TYPE_INT_ARGB); 
  
        // Create reflection image pixel by pixel 
        for (int y = 0; y < width; y++) 
        { 
            for (int lx = 0, rx = height - 1; lx < height; lx++, rx--) 
            { 
                
                int p = simg.getRGB(y,lx); 
  
                // set reflection image pixel value 
                mimg.setRGB(y,rx, p); 
            } 
        } 
  
        // save mirror image 
        try
        { 
           File f = new File("E:\\Documents\\NetBeansProjects\\IpProject\\src\\ipproject\\reflect1.jpg"); 
            ImageIO.write(mimg, "jpg", f); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: " + e); 
        } 
        
    
    
    }
    
    
    public static void  mirror(BufferedImage simg){
    // Get source image dimension 
        int width = simg.getWidth(); 
        int height = simg.getHeight(); 
  
        // BufferedImage for mirror image 
        BufferedImage mimg = new BufferedImage(width, height, 
                                        BufferedImage.TYPE_INT_ARGB); 
  
        // Create reflection image pixel by pixel 
        for (int y = 0; y < height; y++) 
        { 
            for (int lx = 0, rx = width - 1; lx < width; lx++, rx--) 
            { 
                
                int p = simg.getRGB(lx,y); 
  
                // set mirror image pixel value 
                mimg.setRGB(rx,y, p); 
            } 
        } 
  
        // save mirror image 
        try
        { 
           File f = new File("E:\\Documents\\NetBeansProjects\\IpProject\\src\\ipproject\\mirror1.jpg"); 
            ImageIO.write(mimg, "jpg", f); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: " + e); 
        } 
        
    
    
    }
    
    public static void  draw_heart(BufferedImage simg){
        try
        {
            // Get source image dimension
            int width = simg.getWidth();
            int height = simg.getHeight();
            
            BufferedImage rimg = null; 
            
            File f = new File("E:\\Documents\\NetBeansProjects\\IpProject\\src\\ipproject\\heart.png");
            rimg = ImageIO.read(f);
            int width1 = rimg.getWidth();
            int height1 = rimg.getHeight();
            // BufferedImage for mirror image
            BufferedImage mimg = new BufferedImage(width, height,
                    BufferedImage.TYPE_INT_ARGB);
            Color match = new Color(0, 0, 0);
            Color with = new Color(255, 0, 0);
            
            // pixel by pixel operation
            for (int y = 0,i=0; (y < height && i<height1); y++,i++)
            {
                for (int x=0,j=0;(x<width && j<width1);x++,j++)
                {
                    
                    int c = rimg.getRGB(j,i);
                    if(rimg.getRGB(j,i) == match.getRGB()){
                    mimg.setRGB(x,y, with.getRGB());
                    }
                    else{
                    int p = simg.getRGB(x,y);
                    mimg.setRGB(x,y, p);
                     } 
                }
            }
            
            // save mirror image
            try
            {
                File f1 = new File("E:\\Documents\\NetBeansProjects\\IpProject\\src\\ipproject\\heart_drawn.jpg");
                ImageIO.write(mimg, "jpg", f1);
            }
            catch(IOException e)
            {
                System.out.println("Error: " + e);
            }
            
            
            
        } 
        catch(IOException ex)
        { 
            Logger.getLogger(IpProject.class.getName()).log(Level.SEVERE, null, ex); 
        } 
        
    
    
    }
    
    
    public static void main(String[] args) {
     // BufferedImage for source image 
        BufferedImage simg = null; 
  
        // File object 
        
  
        // Read source image file 
        try
        { 
           File f = new File("E:\\Documents\\NetBeansProjects\\IpProject\\src\\ipproject\\in1.jpg"); 
            simg = ImageIO.read(f); 
        } 
  
        catch(IOException e) 
        { 
            System.out.println("Error: " + e); 
        } 
        reflection(simg);
        mirror(simg);
        draw_heart(simg);
         
    
    }
    
}
