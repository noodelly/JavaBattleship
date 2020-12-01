import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class Main extends JFrame
{

    char[] sentMap = new char[100];
    char[] receiveMap = new char[100];
    Tile[] sentTiles = new Tile[100];
    Tile[] receiveTiles = new Tile[100];

    Helper help = new Helper();

    public void setupGame()
    {
        JFrame frame = new JFrame();
        JPanel sentPanel = new JPanel();
        JPanel receivePanel = new JPanel();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.setResizable(false);
        frame.setTitle("JavaBattleships - Game Setup");
        frame.setLayout(new GridLayout(1, 2));
        frame.getContentPane().add(sentPanel);
        frame.getContentPane().add(receivePanel);
        frame.setLocationRelativeTo(null);
        //frame.getContentPane().add(receivePanel);
        sentPanel.setBackground(Color.GRAY);
        sentPanel.setLayout(new GridLayout(10, 10));
        receivePanel.setLayout(new GridLayout(10, 10));
        initializeMap();
        draw(sentPanel, receivePanel);
        frame.setVisible(true);
        help.showMsg("Place your ships!");
    }

    public void initializeMap()
    {
        for(int i=0; i < 100; i++)
        {
            sentMap[i] = '0';
            receiveMap[i] = '0';
            sentTiles[i] = new Tile(help.generateTileID(i), sentMap[i]);
            receiveTiles[i] = new Tile(help.generateTileID(i), receiveMap[i]);
        }
    }

    public void draw(JPanel sentPanel, JPanel receivePanel)
    {
        for(int i=0; i < 100; i++)
        {
            
            System.out.print(sentMap[i]);
            System.out.print(" " + sentTiles[i].getID() + " ");
            sentPanel.add(sentTiles[i]);
            receivePanel.add(receiveTiles[i]);
            
            
        }
    }



    public void loadGame()
    {
        
    }
    public static void main(String [] args)
    {
        Main main = new Main();
        System.out.println("JavaBattleships");
        System.out.println("James Foley 2020 (C)");
        System.out.println("1. New Game");
        System.out.println("2. Load Game");
        System.out.println("3. Exit");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        switch(input) {
            case 1: main.setupGame(); break; 
            case 2: main.loadGame(); break; 
            case 3: System.exit(0); break;
            default: break; }

        
    }
}