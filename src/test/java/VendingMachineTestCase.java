// 1) Given there are no items in stock
//When I check the vending machine
//Then I should see it is empty

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VendingMachineTestCase {
    VendingMachine vm;
    @BeforeEach
    public void setUp(){
        vm = new VendingMachine();
    }
   @Test
    public void checkEmptyVendingMachine(){
        assertEquals(0, vm.getSize());
   }
    @Test
    public void testAddItem(){
        vm.addItem(new Item("orange",1.00, 1));
        assertEquals(1, vm.getSize());
    }

    @Test
    public void testGetBalance() {
      // assertEqual(Double.valueOf(0.0).compareTo(vm.getBalance()));
        assertEquals(0.0,vm.getBalance());
    }



    @Test
    public void testWithdraw() {
        // assertEqual(Double.valueOf(0.0).compareTo(vm.getBalance()));
        vm.depositBalance(500);
        vm.withdrawBalance(100);
        assertEquals(400.00,vm.getBalance());
    }

    @Test
    public void testWithdrawGreaterThanBalance() {
        vm.setBalance(500);

        assertThrows(IllegalArgumentException.class,() -> vm.withdrawBalance(1000));
    }

    @Test
    public void testDepositBalance() {

        vm.depositBalance(1000);
        assertEquals(1000,vm.getBalance());
    }
}



// We need to have item that contain some info: itemName,price, quantity
// *** code VendingMachine.java



// in vending machine: starting out as empty
// Vending machine need to have a list of items

//2) Given there are no items in stock
//When I add some items
//Then I should see them in the vending machine

// When we add item in stock, check item to see if its in stock (getItem method)

//3) Given there are some balance
//When I check the balance of the vending machine
//Then I should see the current balance

// Vending machine should have balance field (getBalance method)

// 4) When I withdraw money from the vending machine
//Then I should see the balance decrease
//
//When I deposit money to the vending machine
//Then I should see the balance increase

// create withdraw method, balance - withdraw:

//5)Given there are items in stock
//When I check what is available
//Then I should see the name, price and code of the items

// 6)Given I have inserted some money into the vending machine
       // When I check amount inserted
       // Then I should see the amount

//7) Given I have inserted enough money for an item
//When I enter the item code
//Then I get the item
//And the balance of the vending machine goes up by that amount
//And the item is removed from the stock

//8)Given I have inserted some amount of money
//When I enter a non-existent item code
//Then the vending machine shows no such item

//9)Given I have inserted some amount of money
//When I enter an item code of an item that costs more that I have inserted
//Then the vending machine shows insufficient fund

//10) Given I have inserted some amount of money
//When I enter an item code of an item that costs less that I have inserted
//Then I get the item and the change

//11) Given I have inserted some amount of money
//When I press the cancel button
//Then I get the full amount refunded

