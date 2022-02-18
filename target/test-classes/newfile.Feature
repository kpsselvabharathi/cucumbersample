Feature: login with Adactin hotel application
Scenario Outline: Adactin login homepage 
Given user is on adactin homepage
When user Enter "<username>" and "<password>"
And user should click login button
When search hotel "<select location>","<hotel  name>","<room type>","<date in>","<date out>","<adult per room>","<child per room>" And user should click button
When user select Hotel
When user enter "<firstname>","<lastname>","<address>","<credit num>","<cc type>","<exp month>","<exp year>","<cvv no>" And user should click book now btn
Then user verify homepage
Examples:
      |username|password|select location|hotel  name|room type|date in|date out|adult per room|child per room|firstname|lastname|address|credit num|cc type|exp month|exp year|cvv no|
      |selvabharathi031|MYCD04|London|Hotel Creek|Deluxe|18/02/2022|22/02/2022|2 - Two|2 - Two|selva|bharathi|omr|9876543212345678|VISA|March|2024|7654|
      |selvabharathi031|MYCD04|London|Hotel Creek|Deluxe|18/02/2022|22/02/2022|2 - Two|2 - Two|selva|bharathi|omr|9876543212345678|VISA|March|2024|7654|
      |selvabharathi031|MYCD04|London|Hotel Creek|Deluxe|18/02/2022|22/02/2022|2 - Two|2 - Two|selva|bharathi|omr|9876543212345678|VISA|March|2024|7654|
      |selvabharathi031|MYCD04|London|Hotel Creek|Deluxe|18/02/2022|22/02/2022|2 - Two|2 - Two|selva|bharathi|omr|9876543212345678|VISA|March|2024|7654|
      |selvabharathi031|MYCD04|London|Hotel Creek|Deluxe|18/02/2022|22/02/2022|2 - Two|2 - Two|selva|bharathi|omr|9876543212345678|VISA|March|2024|7654|
      |selvabharathi031|MYCD04|London|Hotel Creek|Deluxe|18/02/2022|22/02/2022|2 - Two|2 - Two|selva|bharathi|omr|9876543212345678|VISA|March|2024|7654|
      |selvabharathi031|MYCD04|London|Hotel Creek|Deluxe|18/02/2022|22/02/2022|2 - Two|2 - Two|selva|bharathi|omr|9876543212345678|VISA|March|2024|7654|
      |selvabharathi031|MYCD04|London|Hotel Creek|Deluxe|18/02/2022|22/02/2022|2 - Two|2 - Two|selva|bharathi|omr|9876543212345678|VISA|March|2024|7654|
      |selvabharathi031|MYCD04|London|Hotel Creek|Deluxe|18/02/2022|22/02/2022|2 - Two|2 - Two|selva|bharathi|omr|9876543212345678|VISA|March|2024|7654|
      |selvabharathi031|MYCD04|London|Hotel Creek|Deluxe|18/02/2022|22/02/2022|2 - Two|2 - Two|selva|bharathi|omr|9876543212345678|VISA|March|2024|7654|
      |selvabharathi031|MYCD04|London|Hotel Creek|Deluxe|18/02/2022|22/02/2022|2 - Two|2 - Two|selva|bharathi|omr|9876543212345678|VISA|March|2024|7654|
      