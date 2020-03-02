@ContactsPage
Feature: Test Contacts Page

Scenario Outline: Create User
Given Send firstName "<firstName>" lastName "<lastName>" and Email "<email>"

Examples:
	|firstName|lastName|email|
	|Alex|ander|alexander@gmail.com|
	|Paul|Walker|paulwalker@gmail.com|