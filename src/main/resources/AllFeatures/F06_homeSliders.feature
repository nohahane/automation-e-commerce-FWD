@smoke
Feature: F06_Sliders | users could open sliders pages
  Scenario: Nokia page open when user click on Nokia phone slider
    Given user click on Nokia slider
    Then "https://demo.nopcommerce.com/nokia-lumia-1020" is opened

  Scenario: Iphone page open when user click on Iphone phone slider
    Given user click on Iphone slider
    Then " https://demo.nopcommerce.com/iphone-6" is opened