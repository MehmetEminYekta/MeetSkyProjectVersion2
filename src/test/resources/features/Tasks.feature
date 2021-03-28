@MEET-169
Feature:

	Background:
		#@MEET-184
		Given user login with valid credentials
		When the user click on "tasks" module
		

	#the user should see all tasks list under Task module
	@MEET-183 @MEET-182
	Scenario: Display all tasks as a list
		Then the user should see all tasks list under Task module	

	#User can add a sub-task to any selected task
	@MEET-185 @MEET-182
	Scenario: Add a sub-task to any selected task
		Then user can add a sub-task to any selected task	

	#User can delete any selected task
	@MEET-186 @MEET-182
	Scenario: Delete any selected task
		Then User can delete any selected task