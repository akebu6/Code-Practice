Create an algorithm that prevents an e-wallet account from going into negative balance. The account should be debited for each purchase sequentially while the balance allows it.

The input should include:

On the first line, a single integer number representing the available balance.
On the second line, a sequence of integers representing purchase payments, which should be processed one after another.
The output should contain:

If there is not enough money for a purchase, output Error, insufficient funds for the purchase. Your balance is N, but you need M., where N is the remaining balance on the account and M is the cost of the items you cannot afford.
If there is enough money for all the purchases, output Thank you for choosing us to manage your account! Your balance is N., where N is the amount of money left after the purchases.
