package service.impl;

import exceptions.OutOfCardsException;
import models.Deck;
import models.Hand;
import service.Dealer;

public class DealerImpl implements Dealer {

    @Override
    public void shuffle(Deck deck) {
        int num = deck.size();    // num = カードの枚数
        int pos;                  // pos = 乱数で決まる交換対象のカードの位置

        for (int i=0; i<num; i++)
        {
            pos = (int)(Math.random() * num);  // 0～num-1の乱数を生成
            deck.swap(i, pos);                 // i番目とpos番目のカードを交換
        }
    }

    @Override
    public Hand deal(Deck deck) throws OutOfCardsException {

        return null;
    }
}
