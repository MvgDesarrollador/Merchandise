package com.example.Merchandise.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClientExceptionCode {

    CODE_WRONG_DOCUMENT_FORMAT("E101F"),
    CODE_WRONG_NAME_FORMAT("E102F"),
    CODE_WRONG_EMAIL_FORMAT("E103F"),
    CODE_WRONG_ZIP_CODE_FORMAT("E104F"),
    CODE_WRONG_ROL_FORMAT("E105F"),
    CODE_WRONG_PHONE_FORMAT("E106F"),
    CODE_WRONG_DEPARTMENT_FORMAT("E107F"),
    CODE_WRONG_MUNICIPALITY_FORMAT("E108F"),
    CODE_WRONG_ADDRESS_FORMAT("E109F"),

    CODE_WRONG_DOCUMENT_LENGTH("E201L"),
    CODE_WRONG_ZIP_CODE_LENGTH("E202L"),

    CODE_CLIENT_ALREADY_EXIST("E301E");

    private final String code;

}
