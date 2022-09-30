Feature:  Search hotels
  As a quality analyst you want to verify the rates charged to customers
  To validate that the price is correct

  Scenario Outline:  The user Daniela wants to verify the rate charged for the cheapest destinations
    Given that the user is on the main page
    When search hotel with
      | location   | checkout   | checkin   | rooms   | adults   | children   |
      | <location> | <checkout> | <checkin> | <rooms> | <adults> | <children> |

    Then he should see the title <title>
    Examples:
      | location | checkout  | checkin   | rooms | adults | children | title             |
      | Honolulu | 09/30/2022 | 09/29/2022 | 1     | 1      | 0        | Honolulu, HI, USA |
      | New York | 10/03/2022 | 09/30/2022 | 1     | 1      | 0        | New York, NY, USA|











