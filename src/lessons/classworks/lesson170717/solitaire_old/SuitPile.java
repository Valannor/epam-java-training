package lessons.classworks.lesson170717.solitaire_old;

class SuitPile extends CardPile
{

    SuitPile(int x, int y)
    {
        super(x, y);
    }

    @Override
    public boolean canTake(Card aCard)
    {
        if (empty())
        {
            return aCard.rank() == 0;
        }
        Card topCard = top();
        return (aCard.suit() == topCard.suit()) &&
                (aCard.rank() == 1 + topCard.rank());
    }
}
