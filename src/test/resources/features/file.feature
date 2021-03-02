Feature: 
  As a user, I should be able to upload file, move/rename or delete any selected file under Files modüle*

	@MEET-149
	Scenario: Delete any selected item
		Given user login with valid credentials
		When the user deleted any selected file
		Then verify the file deleted successfully
	@MEET-151
	Scenario: Move or copy any selected item
		Given user login with valid credentials
		When the user move or copy any selected item
		Then verify the file move or copy successfully