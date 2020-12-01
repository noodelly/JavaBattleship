import javax.swing.*;

public class Tile extends JButton
{
    private String id;
    private char contains;

    public Tile(String id, char contains)
    {
        this.id = id;
        this.contains = contains;
        setImage(contains);
    }

    public char getContains()
    {
        return this.contains;
    }

    public String getID()
    {
        return this.id;
    }

    public void makeUnclickable()
    {
        this.setEnabled(false);
    }

    private void setImage(char type)
    {
        switch(type)
        {
            case 'M':
                this.setIcon(new ImageIcon(this.getClass().getResource("res/tile_MISS.png")));
            break;
            case 'H':
                this.setIcon(new ImageIcon(this.getClass().getResource("res/tile_HIT.png")));
            break;
            case '0':
                this.setIcon(new ImageIcon(this.getClass().getResource("res/tile_EMPTY.png")));
            break;
        }
    }
}