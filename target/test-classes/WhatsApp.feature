Feature: To extract data from WhatsApp
Scenario: To get the number of people who have read a particular input message in a group
Given To launch the chrome browser and maximize the window
When To launch the URL of the WhatsApp
And To scan the QR code manually through mobile
And To click the WhatsApp Group
And To send message in the group
And To read the peolpe count and display
And To delete the sent message
And To click the menu
And To click the log out
Then Close the browser