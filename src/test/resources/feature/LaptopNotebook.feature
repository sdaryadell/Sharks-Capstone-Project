@NoteBookLaptop
Feature: Laptop & NoteBooks 

Background: 
Given User is on Retail websitee
When User click on Laptop &NoteBook tab
And User click on Show all Laptop &NoteBook option

@AddRemove
Scenario: Add and Remove a Mac book from Cart
Given User click on MacBook item
And User click add to Cart button
Then User should see a message laptop "Success: You have added MacBook to your shopping cart!"
And User should see "1 tem(s)-602.00" showed to the cart
And User click on cart option
And user click on red X button to remove the item from car
Then item should be removed and cart should show "0 item(s)"

@Comparison
Scenario: Product Comparison
Given User click on product comparison icon on "MacBook"
And User click on product comparison icon onn "MacBook Air"
Then User should see a message laptop2 "Success: You have added MacBook Air to your product comparison!"
And User click on Product comparison link
Then User should see Product Comparison Chart

@WishList
Scenario: Adding an item to Wish list
And User click on heart icon to add "Sony VaIO" laptop to wish list
Then User should get a message "You must login or create an account to save Sony VAIO to your wish list!"

@Validate
Scenario: Validate the price of MacBook Pro is 2000
And User click on "MacBook Pro" item
Then User should see "$2,000.00" price tag is present on UI.