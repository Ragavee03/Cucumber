Feature: verify  hotel bookong in Adactin Hotel App

  Scenario: verify whether user is able to book Hotel rooms successfully or not
    Given User has already registered
    When User enters details
      | username  | password |
      | Monkey123 |   123456 |
    And login should be successfull
    And User selects options for Hotel search
      | Location | Hotel        | RoomType | NoOfRooms | CheckInDate | CheckOutDate | Adults | Children |
      | London   | Hotel Hervey | Double   |         4 | 01/01/2020  | 08/03/2020   |      2 |        2 |
    And User should select hotel and continue
    And User fills details on confrim hotel
      | firstname | lastname | address     | creditcardNo     | CardType | ExpiryMon | Expiryear | CVV |
      | Rags      | Raki     | Main Street | 1234567890876545 | VISA     |         2 |      2020 | 675 |
    Then User should  Successfully book hotel