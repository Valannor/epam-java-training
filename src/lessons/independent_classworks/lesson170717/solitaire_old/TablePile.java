package lessons.independent_classworks.lesson170717.solitaire_old;

import java.awt.*;

class TablePile extends CardPile
{
//    private Card chosenCard;

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
        if (x <= clickX && clickX <= x + Card.width &&
                y <= clickY && clickY <= top().getY() + Card.height)
        {
            Card temp = top();
            while (!includesOne(temp, clickX, clickY))
            {
                temp = temp.prevCard;
            }

            chosenCard = temp;
            return true;
        }

        return false;
    }

    public boolean includesSpec(int clickX, int clickY)
    {
        return x <= clickX && clickX <= x + Card.width &&
                y <= clickY && clickY <= top().getY() + Card.height;
    }

    @Override
    public void select(int tx, int ty)
    {
        if (empty())
        {
            return;
        }

        Card topCard;

        if (tx != -1 && ty != -1)
        {
            for (int i = 0; i < 7; i++)
            {
                if (this != Solitaire.tableau[i] && Solitaire.tableau[i].includesSpec(tx, ty))
                {
                    if (Solitaire.tableau[i].canTake(chosenCard))
                    {
                        if (chosenCard.prevCard != null && !chosenCard.prevCard.isFaceUp())
                        {
                            chosenCard.prevCard.flip();
                        }

                        topCard = pop();
                        Solitaire.tableau[i].push(topCard);
                        return;
                    }
                }
            }
        }
        chosenCard = null;

        // else see if any getSuit pile can take card
        topCard = pop();
        if (selectForSuit(topCard)) return;

        // else see if any other table pile can take card
        for (int i = 0; i < 7; i++)
        {
            if (Solitaire.tableau[i] != this && Solitaire.tableau[i].canTake(topCard))
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


    public void selectInDoubleClick()
    {
        TablePile tablePile = this;
        Card topCard = tablePile.pop();

        if (selectForSuit(topCard)) return;

        tablePile.push(topCard);
    }

    private boolean selectForSuit(Card topCard)
    {
        for (int j = 0; j < 4; j++)
        {
            if (Solitaire.suitPile[j].canTake(topCard))
            {
                if (topCard.prevCard != null && !topCard.prevCard.isFaceUp())
                {
                    topCard.prevCard.flip();
                }

                Solitaire.suitPile[j].push(topCard);
                return true;
            }
        }
        return false;
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
