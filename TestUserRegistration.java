package userregistration;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

	public class TestUserRegistration {
	@Before
	public void setup() {
		UserRegistration userRegistration=new UserRegistration();
	}
	//positive test case  for userName return->true
	@Test
	public void givenFirstName_WhenFirstNameCapital_ShouldReturnTrue() {
		UserRegistration userRegistration=new UserRegistration();
		boolean actual=userRegistration.validateUsername("Pranav");
		
		Assert.assertTrue(actual);
	}
	//negative test case for userName return->false
	@Test
	public void givenFirstName_WhenFirstNameCapital_ShouldReturnFalse() {
		UserRegistration userRegistration=new UserRegistration();
		boolean actual=userRegistration.validateUsername("abc");
		Assert.assertFalse(actual);
	}
	
		//positive test case for LastName return->true
		@Test
		public void givenLastName_WhenLastNameCapital_ShouldReturnTrue() {
			UserRegistration userRegistration=new UserRegistration();
			boolean actual=userRegistration.validateLastname("Abcd");
			Assert.assertTrue(actual);
		}
		//negative test case for userName return->false
		@Test
		public void givenlastName_WhenlastNameCapital_ShouldReturnFalse() {
			UserRegistration userRegistration=new UserRegistration();
			boolean actual=userRegistration.validateLastname("abcd");
			Assert.assertFalse(actual);
		}
		
		//positive test case for PhoneNo return->true
		@Test
		public void givenphoneNo_WhenPhoneNoTendigit_ShouldReturnTrue() {
			UserRegistration userRegistration=new UserRegistration();
			boolean actual=userRegistration.validateMobileNo("917894567456");
			Assert.assertTrue(actual);
		}
		//negative test case for PhoneNo return->false
		@Test
		public void givenPhoneNo_WhenPhoneNoTendigit_Capital_ShouldReturnFalse() {
			UserRegistration userRegistration=new UserRegistration();
			boolean actual=userRegistration.validateMobileNo("4785748596");
			Assert.assertFalse(actual);
		}
		
		//positive test case for PhoneNo return->true
		@Test
		public void givenPassword_WhenPasswordCondition_ShouldReturnTrue() {
			UserRegistration userRegistration=new UserRegistration();
			boolean actual=userRegistration.validatePassword("Pranavv@1");
			Assert.assertTrue(actual);
		}
		//negative test case for PhoneNo return->false
		@Test
		public void givenPhoneNo_WhenPasswordCondition_Capital_ShouldReturnFalse() {
			UserRegistration userRegistration=new UserRegistration();
			boolean actual=userRegistration.validatePassword("pranav");
			Assert.assertFalse(actual);
		}
	
		
}
