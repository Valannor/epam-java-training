package lessons.independent_classworks.lesson170717.solitaire_old;

import java.awt.*;

class CardPile
{
    // coordinates of the card pile
    protected int x;
    protected int y;
    private Card topCard;
    protected Card chosenCard;

    CardPile(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
        topCard = null;
    }

    // access to cards are not overridden
    public Card top()
    {
        return topCard;
    }

    public boolean empty()
    {
        return topCard == null;
    }

    public void push(Card aCard)
    {
        aCard.prevCard = topCard;

        if (topCard != null)
            topCard.nextCard = aCard;

        topCard = aCard;

        if (aCard.nextCard != null)
        {
            push(aCard.nextCard);
        }
    }

    public Card pop()
    {
        Card result = null;

        if (chosenCard == null)
        {
            if (topCard != null)
            {
                result = topCard;

                if (topCard.prevCard != null)
                    topCard.prevCard.nextCard = null;

                topCard = topCard.prevCard;
            }
        }
        else
        {
            if (chosenCard != null)
            {
                result = chosenCard;

                if (chosenCard.prevCard != null)
                    chosenCard.prevCard.nextCard = null;

                topCard = chosenCard.prevCard;
            }
        }
        return result;
    }

    // the following are sometimes overridden
    public boolean includes(int clickX, int clickY)
    {
        return x <= clickX && clickX <= x + Card.width &&
                y <= clickY && clickY <= y + Card.height;
    }

    public boolean includesOne(Card card, int clickX, int clickY)
    {
        return x <= clickX && clickX <= x + Card.width &&
                card.getY() <= clickY && clickY <= top().getY() + Card.height;
    }

    public void select(int tx, int ty)
    {
        // do nothing
    }

    public void display(Graphics g)
    {
        g.setColor(Color.black);
        if (topCard == null)
        {
            g.drawRect(x, y, Card.width, Card.height);
        } else
        {
            topCard.draw(g, x, y);
        }
    }

    public boolean canTake(Card aCard)
    {
        return false;
    }

    @Override
    public String toString()
    {
        String result = top() + ", ";
        Card temp = top();
        while (temp.prevCard != null)
        {
            temp = temp.prevCard;
            result += temp + ", ";
        }

        return result;
    }
}
