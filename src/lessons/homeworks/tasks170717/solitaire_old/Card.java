package lessons.homeworks.tasks170717.solitaire_old;

import java.awt.*;

class Card
{
    final static int heart = 0;
    final static int spade = 1;
    final static int diamond = 2;
    final static int club = 3;

    final static int red = 0;
    final static int black = 1;

    final static int width = 125;
    final static int height = 180;

    private int xPile;
    private int yPile;

    private static String names[] = {"A", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "J", "Q", "K"};

    final static CardImage cardImage = CardImage.getInstance();

    private boolean faceup;
    private int rank;
    private int suit;

    public Card prevCard;
    public Card nextCard; //may need this one day

    // constructor
    Card(int suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
        faceup = false;
    }

    // access attributes of card
    public int getX()
    {
        return xPile;
    }

    public void setX(int xPile)
    {
        this.xPile = xPile;
    }

    public int getY()
    {
        return yPile;
    }

    public void setY(int yPile)
    {
        this.yPile = yPile;
    }

    public int getRank()
    {
        return rank;
    }

    public int getSuit()
    {
        return suit;
    }

    public boolean isFaceUp()
    {
        return faceup;
    }

    public int getColor()
    {
        if (getSuit() == heart || getSuit() == diamond)
        {
            return red;
        }
        return black;
    }

    public void flip()
    {
        faceup = !faceup;
    }

    public void draw(Graphics g, int x, int y)
    {
        // saving coordinates of each card
        this.xPile = x;
        this.yPile = y;

        // clear rectangle, draw border
        g.clearRect(x, y, width, height);
        g.setColor(Color.black);
        //g.drawRect(x, y, width, height);
        g.fillRect(x, y, width, height);

        // draw body of card
        if (isFaceUp())
        {
            if (getColor() == red)
            {
                g.setColor(Color.red);
            } else
            {
                g.setColor(Color.black);
            }
            if (getSuit() == heart)
            {
                g.drawImage(cardImage.getHeart(), x, y, null);
            } else if (getSuit() == spade)
            {
                g.drawImage(cardImage.getSpade(), x, y, null);
            } else if (getSuit() == diamond)
            {
                g.drawImage(cardImage.getDiamond(), x, y, null);
            } else if (getSuit() == club)
            {
                g.drawImage(cardImage.getClub(), x, y, null);
            }

            //drawing the rank
            g.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            g.drawString(names[getRank()], x + 10, y + 30);

            if (names[getRank()].equals("A"))
                g.drawImage(cardImage.getAce(), x + 55, y + 15, null);
            if (names[getRank()].equals("K"))
                g.drawImage(cardImage.getKing(), x + 55, y + 15, null);
            if (names[getRank()].equals("Q"))
                g.drawImage(cardImage.getQuin(), x + 55, y + 15, null);
            if (names[getRank()].equals("J"))
                g.drawImage(cardImage.getJack(), x + 55, y + 15, null);
        } else
        { // face down
            g.drawImage(cardImage.getReverse(), x, y, null);
        }
    }

    @Override
    public String toString()
    {
        String suit = null;
        if (getSuit() == heart)
            suit = "heart";
        if (getSuit() == spade)
            suit = "spade";
        if (getSuit() == diamond)
            suit = "diamond";
        if (getSuit() == club)
            suit = "club";

        return "Rank: " + names[getRank()] + " || Suit: " + suit;
    }
}
