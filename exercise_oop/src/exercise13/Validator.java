package exercise13;

import exercise13.Exception.BirthdayException;
import exercise13.Exception.EmailException;
import exercise13.Exception.FullNameException;
import exercise13.Exception.PhoneException;

public class Validator {
	public static void checkEmail(String email) throws EmailException {
		if (!email.matches(
				"^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
			throw new EmailException("Email invalid");
		}
	}

	public static void checkPhone(String phone) throws PhoneException {
		if (!phone.matches("^(0|\\+84|84)(3|5|7|8|9)[0-9]{8}")) {
			throw new PhoneException("Phone invalid");
		}
	}

	public static void checkBirthDay(String birthDay) throws BirthdayException {
		if (!birthDay.matches("^(0[1-9]|[12][0-9]|3[01])([\\/\\-])(0[1-9]|1[0-2])\\2(19|20)[0-9]{2}$")) {
			throw new BirthdayException("BirthDay invalid");
		}
	}

	public static void checkFullName(String fullName) throws FullNameException {
		if (!fullName.matches("^[A-Za-z]+( [A-Za-z]+)+$")) {
			throw new FullNameException("FullName invalid");
		}
	}
}
