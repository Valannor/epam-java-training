package lessons.independent_classworks.lesson170717.solitaire_old;

import java.awt.*;

class TablePile extends CardPile
{
    TablePile(int x, int y, int c)
    {
        // initialize the parent class
        super(x, y);

        // then initialize our pile of cards
        for (int i = 0; i < c; i++)
        {
            push(Solitaire.deckPile.pop());
        }

        // flip topmost card face up
        top().flip();
    }

    @Override
    public boolean canTake(Card aCard)
    {
        if (empty())
        {
            return aCard.getRank() == 12;
        }
        Card topCard = top();
        return (aCard.getColor() != topCard.getColor()) &&
                (aCard.getRank() == topCard.getRank() - 1);
    }

    @Override
    public boolean includes(int clickX, int clickY)
    {
        // don't test bottom of card
        return x <= clickX && clickX <= x + Card.width &&
                y <= clickY;
    }

    @Override
    public void select(int tx, int ty)
    {
        if (empty())
        {
            return;
        }

        // if face down, then flip
        Card topCard = top();
        if (!topCard.isFaceUp())
        {
            topCard.flip();
            return;
        }

        // else see if any getSuit pile can take card
        topCard = pop();
        for (int i = 0; i < 4; i++)
        {
            if (Solitaire.suitPile[i].canTake(topCard))
            {
                if (topCard.prevCard != null && !topCard.prevCard.isFaceUp())
                {
                    topCard.prevCard.flip();
                }

                Solitaire.suitPile[i].push(topCard);
                return;
            }
        }

        // else see if any other table pile can take card
        for (int i = 0; i < 7; i++)
        {
            if (Solitaire.tableau[i].canTake(topCard))
            {
                if (topCard.prevCard != null && !topCard.prevCard.isFaceUp())
                {
                    topCard.prevCard.flip();
                }

                Solitaire.tableau[i].push(topCard);
                return;
            }
        }

        // else put it back on our pile
        push(topCard);
    }

    public void selectDrag(int tx, int ty)
    {
        if (empty())
        {
            return;
        }

        // if face down, then flip
        Card topCard = top();
        if (!topCard.isFaceUp())
        {
            topCard.flip();
            return;
        }

        // else see if any getSuit pile can take card
        topCard = pop();
        for (int i = 0; i < 4; i++)
        {
            if (Solitaire.suitPile[i].canTake(topCard))
            {
                Solitaire.suitPile[i].push(topCard);
                return;
            }
        }

        // else see if any other table pile can take card
        for (int i = 0; i < 7; i++)
        {
            if (Solitaire.tableau[i].canTake(topCard))
            {
                Solitaire.tableau[i].push(topCard);
                return;
            }
        }

        // else put it back on our pile
        push(topCard);
    }

    private int stackDisplay(Graphics g, Card aCard)
    {
        int localy;
        if (aCard == null)
        {
            return y;
        }
        localy = stackDisplay(g, aCard.prevCard);
        aCard.draw(g, x, localy);
        return localy + 35;
    }

    @Override
    public void display(Graphics g)
    {
        stackDisplay(g, top());
    }

}
