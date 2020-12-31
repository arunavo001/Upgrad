package com.upgrad.ublog.exceptions;

/**
 * TODO: 2.7. Convert this class to a custom Exception class.
 * TODO: 2.8. Provide a constructor which accepts a custom message as input
 *  parameter and passes it to its base class.
 */

public class UserNotFoundException extends Throwable {

    public UserNotFoundException(String custom_message) {
        super(custom_message);
    }

    public static void main(String[] args) {
        try {
            throw new UserNotFoundException("Custom Message");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

        /**
         * Your output should look like this.
         * Custom Message
         */
    }
}
