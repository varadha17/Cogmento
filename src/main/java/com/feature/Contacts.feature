@ContactsPage
Feature: Test Contacts Page

Scenario Outline: Create User
Given Send firstName "<firstName>" lastName "<lastName>" and Email "<email/position>"

Examples:
	|firstName|lastName|email/position|
	|Alex|ander|alexander@gmail.com,Manager|
	|Paul|Walker|paulwalker@gmail.com,Asst. Manger|