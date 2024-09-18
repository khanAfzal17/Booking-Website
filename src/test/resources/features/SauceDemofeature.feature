#
#
#Feature:  Saucedemo 
#@sanity
#
#Scenario: Successful login and checkout
#
#Given user on the Saucedemo login page
#When user enter username "<username>"
#
#When user enter password "<password>"
#
#When user click the login button
#When user should see the products page
#
#When user add the "Sauce Labs Backpack" to cart
#
#When user click the shopping cart link
#
#When user click the checkout button
#
#Then user should see the checkout information page
#
#When user enter first name "Afzal"
#
#When user enter last name "Khan"
#
#When user enter postal code "2473473"
#
#When user click the continue button
#
#When user should see the checkout overview page
#
#When user click the finish button
#
#Then user is navigated to the thank you page
#
#Examples:
#|username|                    |password|
#|standard_user|               |secret_sauce|
#|locked_out_user|             |secret_sauce|
#|problem_user|                |secret_sauce|
#|performance_glitch_user|     |secret_sauce|
#
