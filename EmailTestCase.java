package userregistration;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class EmailTestCase {
	String email;
	boolean expectedOutput;
	//constructor
	public EmailTestCase(String email, boolean expectedOutput) {
		super();
		this.email = email;
		this.expectedOutput = expectedOutput;
	}

	@Parameterized.Parameters
	public static Collection emailIdsWithExpectedOutput() {
		//sample Email to test
		return Arrays.asList(new Object[][] { { "abc@gmail.com", true }, { "abc-100@gmail.com", true },
				{ "abc.100@gmail.com", true }, { "abc-100@Abc.com", true }, { "abc-100@Abc.net", true },
				{ "abc.100@Abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@yahoo.com", true }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@Abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },

		});
	}
	//comparing actual and expected output
	@Test
	public void givenEmailId_WithExpectedOutput_ShouldReturnExpectedResult() {
		UserRegistration userRegistration = new UserRegistration();
		boolean actualResult = userRegistration.validateEmail(email);
		Assert.assertEquals(this.expectedOutput, actualResult);
	}
}
