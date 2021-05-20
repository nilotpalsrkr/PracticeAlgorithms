package other.general.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;



class CoinTest {

    @Test
    void arrangeCoins() {
        List<Long> coins = new ArrayList<>();
        coins.add(2L);
        coins.add(5L);
        coins.add(8L);
        coins.add(3L);
        Coin.arrangeCoins(coins);
    }
}