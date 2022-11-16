@Smoke

  Feature: User could have results matching his search
Scenario Outline: Searching for products using keywords
Given user enter a "<Keyword>" in search box and click on search button
  Then search results matching "<Keyword>" should appears

Examples:
|Keyword|
|book|
|laptop|
|nike|

    Scenario Outline: Searching for products using product SKU
      Given user enter a serial "<SKU>" in search box and click on search button
      And user click on appeared product
      Then Sku appears in results equals entered "<SKU>"
      Examples:
        |SKU|
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|