package package_;

import enigma.core.Enigma;
import enigma.event.TextMouseEvent;
import enigma.event.TextMouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import enigma.console.TextAttributes;
import java.awt.Color;

public class Game {	
   private Random random = new Random();
   public enigma.console.Console cn = Enigma.getConsole("Robot Olympics");
   public TextMouseListener tmlis; 
   public KeyListener klis;
   // ------ Standard variables for mouse and keyboard ------
   public int mousepr;          // mouse pressed?
   public int mousex, mousey;   // mouse text cords.
   public int keypr;   // key pressed?
   public int rkey;    // key   (for press/release)
   // ----------------------------------------------------
   
   
   Game() throws Exception {   // --- Constructor
	   Piece piece = new Piece(4,random.nextInt(5));
	   cn.getTextWindow().setCursorPosition(32, 4);
	   cn.getTextWindow().output(piece.appereance());
	   
	   /*Piece piece2 = new Piece(4,random.nextInt(5));
	   cn.getTextWindow().setCursorPosition(50, 4);
	   cn.getTextWindow().output(piece2.appereance());
	   
	   Piece piece3 = new Piece(4,random.nextInt(5));
	   cn.getTextWindow().setCursorPosition(68, 4);
	   cn.getTextWindow().output(piece3.appereance());
	   
	   Piece piece4 = new Piece(4,random.nextInt(5));
	   cn.getTextWindow().setCursorPosition(86, 4);
	   cn.getTextWindow().output(piece4.appereance());*/
	   
	   //Cube cube = new Cube(75,75);
	   //System.out.println(cube.appereance());
	   //int x = 32;
	   //int y = 4;
	   //cn.getTextWindow().setCursorPosition(32, 4);
	   
      // ------ Standard code for mouse and keyboard ------ Do not change
      tmlis=new TextMouseListener() {
         public void mouseClicked(TextMouseEvent arg0) {}
         public void mousePressed(TextMouseEvent arg0) {
            if(mousepr==0) {
               mousepr=1;
               mousex=arg0.getX();
               mousey=arg0.getY();
            }
         }
         public void mouseReleased(TextMouseEvent arg0) {}
      };
      cn.getTextWindow().addTextMouseListener(tmlis);
    
      klis=new KeyListener() {
         public void keyTyped(KeyEvent e) {}
         public void keyPressed(KeyEvent e) {
            if(keypr==0) {
               keypr=1;
               rkey=e.getKeyCode();
            }
         }
         public void keyReleased(KeyEvent e) {}
      };
      cn.getTextWindow().addKeyListener(klis);
      // ----------------------------------------------------

      int px=5,py=5;
      //cn.getTextWindow().output(px,py,'P');
      while(true) {
         if(mousepr==1) {  // if mouse button pressed
            cn.getTextWindow().output(mousex,mousey,'#');  // write a char to x,y position without changing cursor position
            px=mousex; py=mousey;
            
            mousepr=0;     // last action  
         }
         if(keypr==1) {    // if keyboard button pressed
            if(rkey==KeyEvent.VK_LEFT) px--;   
            if(rkey==KeyEvent.VK_RIGHT) px++;
            if(rkey==KeyEvent.VK_UP) py--;
            if(rkey==KeyEvent.VK_DOWN) py++;
            
            char rckey=(char)rkey;
            //        left          right          up            down
            if(rckey=='%' || rckey=='\'' || rckey=='&' || rckey=='(') cn.getTextWindow().output(px,py,'P'); // VK kullanmadan test teknigi
            else cn.getTextWindow().output(rckey);
            
            if(rkey==KeyEvent.VK_SPACE) {
               String str;         
               str=cn.readLine();     // keyboardlistener running and readline input by using enter 
               cn.getTextWindow().setCursorPosition(5, 20);
               cn.getTextWindow().output(str);
            }
            
            keypr=0;    // last action  
         }
         Thread.sleep(20);
      }
   }
}

