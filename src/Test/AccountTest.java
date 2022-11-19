package Test;

import main.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AccountTest {

    @Test
    void single(){
        var account = new Account();
        assertEquals(12248.16,account.single(75000));

    }
    @Test
    void married_filed_jointly(){
        var account = new Account();
        assertEquals(668550.34,account.married_filed_jointly(1978458));
    }

    @Test
    void married_filing_separately(){
        var account = new Account();
        assertEquals(15926.6576, account.married_filing_separately(91275.99));
    }

    @Test
    void head_of_household(){
        var account = new Account();
        assertEquals(1159493.4024999999, account.head_of_household(3234789.25));

    }
  
}