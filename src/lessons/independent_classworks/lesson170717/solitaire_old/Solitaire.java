package lessons.independent_classworks.lesson170717.solitaire_old;

/*
Simple Solitaire Card Game in Java
Written by Tim Budd, Oregon State University, 1996
*/

import java.applet.Applet;
import java.awt.*;

public class Solitaire extends Applet
{
    static DeckPile deckPile;
    static DiscardPile discardPile;
    static TablePile tableau[];
    static SuitPile suitPile[];
    static CardPile allPiles[];

    @Override
    public void init()
    {
        //Background properties
        this.setBackground(Color.GREEN);
        this.setSize(1025, 800);

        // first allocate the arrays
        allPiles = new CardPile[13];
        suitPile = new SuitPile[4];
        tableau = new TablePile[7];

        // then fill them in
        allPiles[0] = deckPile = new DeckPile(870, 30);
        allPiles[1] = discardPile = new DiscardPile(730, 30);
        for (int i = 0; i < 4; i++)
        {
            allPiles[2 + i] = suitPile[i] =
                    new SuitPile(30 + 140 * i, 30);
        }
        for (int i = 0; i < 7; i++)
        {
            allPiles[6 + i] = tableau[i] =
                    new TablePile(30 + 140 * i, 225, i + 1);
        }
    }

    @Override
    public void paint(Graphics g)
    {
        for (int i = 0; i < 13; i++)
        {
            allPiles[i].display(g);
        }
    }

    boolean isIncluded = false;
    CardPile pile = null;
    @Override
    public boolean mouseDown(Event evt, int x, int y)
    {
        for (int i = 0; i < 13; i++)
        {
            if (allPiles[i].includes(x, y))
            {
                isIncluded = true;
                pile = allPiles[i];

                return true;
            }
        }
        return true;
    }

    @Override
    public boolean mouseUp(Event evt, int x, int y)
    {
        if (isIncluded)
        {
            pile.select(x, y);
            repaint();
            isIncluded = false;
        }
        return true;
    }
}
