Feature: This is a Subscribe To NewsLetter feature

@NEXT1
Scenario: Verify Subscribe To Newsletter is displaying in home page footer

Given Open NEXTeTICKET <"URL"> application
Then scroll down til Subscribe To Newsletter area
Then verify Subscribe To Newsletter is displaying in home page footer


@NEXT2
Scenario: Verify Email field is displaying in Subscribe To Newsletter

Given Open NEXTeTICKET <"URL"> application
Then scroll down til Subscribe To Newsletter area
Then Verify Email field is displaying in Subscribe To Newsletter


@NEXT3
Scenario: Verify send button is displaying in Subscribe To Newsletter

Given Open NEXTeTICKET <"URL"> application
Then scroll down til Subscribe To Newsletter area
Then Verify send button is displaying in Subscribe To Newsletter


@NEXT4
Scenario: Verify success message(Your submission was successful)appeared when send with email

Given Open NEXTeTICKET <"URL"> application
Then scroll down til Subscribe To Newsletter area
Then Enter valid email address and click send button
Then Verify success message(Your submission was successful)appeared when send with email


@NEXT5
Scenario: Verify error message(Please fill out this field)appeared when send without email

Given Open NEXTeTICKET <"URL"> application
Then scroll down til Subscribe To Newsletter area
Then skip email address and click send button
Then Verify error message(Please fill out this field)appeared when send without email






