@smoke
  Feature: F09_WishList | user could add product to wish list
    Scenario: when user click on wish button sucess message appears
      Given user click on wish list button for a product
      Then Green success message appears


      Scenario: Quantity value of product is >1 when user add product to wishList
        Given user click on wish list button for a product
        Then user click on wish List tab on top page
        Then user find product quantity valu is mor than one