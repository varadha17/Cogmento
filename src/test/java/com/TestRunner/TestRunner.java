package com.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


    //-------------------------------------------------------//
//	  | ANDing, ORing tags and Ignoring tests				|
//	  | 													|
//	  |	OR  - {"@tag1 , @tag2"}								|
//    |	AND - {"@tag1","@tag2"}								|
//	  | Ignore cucumber test - {"~@tag1","~@tag2"}			|
//	  |														|
    //-------------------------------------------------------//

@RunWith(Cucumber.class)
@Cucumber.Options(
		
		features="C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\cogmentoProject\\src\\main\\java\\com\\feature\\Contacts.feature",
		glue="com.stepDefinition", // path of step definition files
		format={"pretty","html:test-output", "junit:junit_xml/cucumber.xml"}, // to generate different types of reports
		tags={"@ContactsPage"}, // It will execute the tagged scenarios mentioned inside tags
		monochrome=true, // It will display the console output in proper readable format
		strict = false, // It will check if any step is not defined in step definition file
		dryRun = false // It will check the mapping between feature file and step definition file
		
		)

public class TestRunner{

}











