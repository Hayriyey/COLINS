@order
  Feature: Order an Item
    Scenario: A user can send an order to the basket

      Given user navigates to "Giriş" page
      When user types valid username "username" and "password"
      And user click to login button
      And the user clicks "Kadın" and "Kaban"
      And the user clicks "Düğme Detaylı Kapüşonlu Haki  Kaban" button
      Then the user selects beden
      Then the user should click "Sepete Ekle"

