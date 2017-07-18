package lessons.classworks.lesson170717.solitaire_old;

import java.awt.*;

class CardPile
{
    // coordinates of the card pile
    protected int x;
    protected int y;
    private Card firstCard;

    CardPile(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
        firstCard = null;
    }

    // access to cards are not overridden
    public Card top()
    {
        return firstCard;
    }

    public boolean empty()
    {
        return firstCard == null;
    }

    public void push(Card aCard)
    {
        aCard.link = firstCard;
        firstCard = aCard;
    }

    public Card pop()
    {
        Card result = null;
        if (firstCard != null)
        {
            result = firstCard;
            firstCard = firstCard.link;
        }
        return result;
    }

    // the following are sometimes overridden
    public boolean includes(int clickX, int clickY)
    {
        return x <= clickX && clickX <= x + Card.width &&
                y <= clickY && clickY <= y + Card.height;
    }

    public void select(int tx, int ty)
    {
        // do nothing
    }

    public void display(Graphics g)
    {
        g.setColor(Color.black);
        if (firstCard == null)
        {
            g.drawRect(x, y, Card.width, Card.height);
        } else
        {
            firstCard.draw(g, x, y);
        }
    }

    public boolean canTake(Card aCard)
    {
        return false;
    }
}
