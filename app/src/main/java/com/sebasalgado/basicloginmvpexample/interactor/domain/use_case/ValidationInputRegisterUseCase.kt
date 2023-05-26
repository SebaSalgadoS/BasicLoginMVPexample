package com.sebasalgado.basicloginmvpexample.interactor.domain.use_case

import com.sebasalgado.basicloginmvpexample.interactor.domain.model.RegisterInputValidType
import com.sebasalgado.basicloginmvpexample.utils.*

class ValidationInputRegisterUseCase {

    operator fun invoke(
        email: String,
        password: String,
        repitePassword: String
    ): RegisterInputValidType {
        if (email.isEmpty() || password.isEmpty() || repitePassword.isEmpty()) {
            return RegisterInputValidType.EmptyField
        }
        if (EMAIL_SIMBOL !in email) {
            return RegisterInputValidType.NoEmail
        }
        if (password != repitePassword) {
            return RegisterInputValidType.PasswordsDoNoMatch
        }
        if (password.count() < MIN_PASS_LENGTH) {
            return RegisterInputValidType.PasswordTooShort
        }
        if (!password.containSpecialChar()) {
            return RegisterInputValidType.PasswordSpecialCharMissing
        }
        if (!password.containsUpperCase()) {
            return RegisterInputValidType.PasswordUpperCaseMissing
        }
        if (!password.containsNumbers()) {
            return RegisterInputValidType.PasswordNumberMissing
        }
        return RegisterInputValidType.Valid
    }
}