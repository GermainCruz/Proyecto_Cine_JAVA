/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuentes;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author ASUS
 */
public class Fuentes {
    private Font font=null;
    public String montserratRegular= "Montserrat-Regular.ttf";
    public String montserratBold= "Montserrat-Bold.ttf";
    public String montserratBlack= "Montserrat-Black.ttf";
    public String latoRegular="Lato-Regular.ttf";
    public String latoBold="Lato-Bold.ttf";
    public String latoBlack="Lato-Black.ttf";
    
    public Font fuente(String nombre, float tamaño){
        try{
            InputStream is= getClass().getResourceAsStream(nombre);
            font= Font.createFont(Font.TRUETYPE_FONT, is);
        }catch(Exception ex){
            font= new Font("Arial",Font.PLAIN,14);
        }
        Font tfont= font.deriveFont(tamaño);
        return tfont;
    }
    
}
