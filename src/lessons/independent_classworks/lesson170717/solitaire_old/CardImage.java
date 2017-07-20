package lessons.independent_classworks.lesson170717.solitaire_old;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class CardImage
{
    private static CardImage instance = new CardImage();

    private static final String HEART_DIR = "/lessons/independent_classworks/lesson170717/solitaire_old/pics/heart.png";
    private static final String SPADE_DIR = "/lessons/independent_classworks/lesson170717/solitaire_old/pics/spade.png";
    private static final String DIAMOND_DIR = "/lessons/independent_classworks/lesson170717/solitaire_old/pics/diamond.png";
    private static final String CLUB_DIR = "/lessons/independent_classworks/lesson170717/solitaire_old/pics/club.png";
    private static final String REVERSE_DIR = "/lessons/independent_classworks/lesson170717/solitaire_old/pics/reverse.png";

    private static final String ACE_DIR = "/lessons/independent_classworks/lesson170717/solitaire_old/pics/faces/A.png";
    private static final String KING_DIR = "/lessons/independent_classworks/lesson170717/solitaire_old/pics/faces/K.png";
    private static final String QUIN_DIR = "/lessons/independent_classworks/lesson170717/solitaire_old/pics/faces/Q.png";
    private static final String JACK_DIR = "/lessons/independent_classworks/lesson170717/solitaire_old/pics/faces/J.png";

    private BufferedImage heart;
    private BufferedImage spade;
    private BufferedImage diamond;
    private BufferedImage club;
    private BufferedImage reverse;

    private BufferedImage ace;
    private BufferedImage king;
    private BufferedImage quin;
    private BufferedImage jack;

    public static CardImage getInstance()
    {
        return instance;
    }

    private CardImage()
    {
    }

    //initializing card pics
    {
        try
        {
            heart = ImageIO.read(getClass().getResourceAsStream(HEART_DIR));
            spade = ImageIO.read(getClass().getResourceAsStream(SPADE_DIR));
            diamond = ImageIO.read(getClass().getResourceAsStream(DIAMOND_DIR));
            club = ImageIO.read(getClass().getResourceAsStream(CLUB_DIR));
            reverse = ImageIO.read(getClass().getResourceAsStream(REVERSE_DIR));

            ace = ImageIO.read(getClass().getResourceAsStream(ACE_DIR));
            king = ImageIO.read(getClass().getResourceAsStream(KING_DIR));
            quin = ImageIO.read(getClass().getResourceAsStream(QUIN_DIR));
            jack = ImageIO.read(getClass().getResourceAsStream(JACK_DIR));


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public Image getHeart()
    {
        return heart;
    }

    public Image getSpade()
    {
        return spade;
    }

    public Image getDiamond()
    {
        return diamond;
    }

    public Image getClub()
    {
        return club;
    }

    public BufferedImage getReverse()
    {
        return reverse;
    }

    public BufferedImage getAce()
    {
        return ace;
    }

    public BufferedImage getKing()
    {
        return king;
    }

    public BufferedImage getQuin()
    {
        return quin;
    }

    public BufferedImage getJack()
    {
        return jack;
    }
}
