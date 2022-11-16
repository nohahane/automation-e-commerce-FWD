@smoke
  Feature: User could hover on one of home page categories and select sub category
    Scenario:user could choose subcategory from categories
      Given user hover on a category
      Then Title of selected subcategory is equal to subcategory name
