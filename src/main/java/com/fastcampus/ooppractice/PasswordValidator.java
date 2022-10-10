package com.fastcampus.ooppractice;

public class PasswordValidator {

    public static void validate(String password) {

        // 올바르지 않게 짬.
        if (password.length() < 8 || password.length() > 12) {
            throw new IllegalArgumentException("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
        }
    }
}
