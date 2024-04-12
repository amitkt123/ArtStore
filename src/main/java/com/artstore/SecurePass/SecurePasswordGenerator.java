package com.artstore.SecurePass;

import java.security.SecureRandom;
import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class SecurePasswordGenerator {

	public static String generateSecurePassword() {
		// Configure password length and character set
		int passwordLength = 12; // Adjust as needed (minimum recommended is 12)
		String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[{]};':\\|,.<>/?";

		// Register Bouncy Castle provider
		Security.addProvider(new BouncyCastleProvider());

		// Create SecureRandom object using Bouncy Castle
		SecureRandom random = new SecureRandom();

		// Select characters from the character set
		StringBuilder password = new StringBuilder(passwordLength);
		for (int i = 0; i < passwordLength; i++) {
			int index = random.nextInt(charSet.length());
			password.append(charSet.charAt(index));
		}

		return password.toString();
	}

}