package com.example.Merchandise.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClientExceptionMessage {

    WRONG_DOCUMENT_FORMAT("Please make sure your document starts with either CC, TI, or P, followed by a number. For example: TI-1025432560"),
    WRONG_NAME_FORMAT("Name can only contain letters, spaces, apostrophes, and hyphens"),
    WRONG_EMAIL_FORMAT("Invalid email. Please make sure it includes the @ symbol and a domain like .com or .net"),
    WRONG_ZIP_CODE_FORMAT("The ZIP code must be a numerical value. Please avoid entering letters, symbols, or spaces"),
    WRONG_ROL_FORMAT("Invalid role. Role must be ADMIN, USER, or MODERATOR"),
    WRONG_PHONE_FORMAT("Please ensure that you only enter numerical values (0-9) when filling in the phone number field"),
    WRONG_DEPARTMENT_FORMAT("To enter a valid department name, please use only letters (A-Z, a-z) and numbers (0-9). The name must be at least 3 characters long and no more than 20 characters long"),
    WRONG_MUNICIPALITY_FORMAT("The municipality name may contain letters (upper or lowercase), numbers, spaces, hyphens, and apostrophes. It must be between 3 and 50 characters long"),
    WRONG_ADDRESS_FORMAT("The address field requires a minimum of three parts separated by spaces. Each part can contain letters, numbers, spaces, hash symbols (#), and hyphens. For example: 123 Main St Anytown CA"),

    WRONG_DOCUMENT_LENGTH("The document cannot exceed 20 characters"),
    WRONG_ZIP_CODE_LENGTH("To comply with standard ZIP code formatting, please enter a maximum of 5 numerical digits."),

    CLIENT_ALREADY_EXIST("We found an existing user profile linked to this document, please try again with another one");

    private final String message;

}
