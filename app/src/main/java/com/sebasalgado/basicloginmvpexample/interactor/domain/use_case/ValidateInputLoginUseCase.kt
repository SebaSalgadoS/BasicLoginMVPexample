package com.sebasalgado.basicloginmvpexample.interactor.domain.use_case

import com.sebasalgado.basicloginmvpexample.interactor.domain.model.LoginInputValidationType
import com.sebasalgado.basicloginmvpexample.utils.EMAIL_SIMBOL

class ValidateInputLoginUseCase {

    operator fun invoke(email: String, password: String): LoginInputValidationType {
        if (email.isEmpty() || password.isEmpty()) {
            return LoginInputValidationType.EmptyField
        }
        if (EMAIL_SIMBOL !in email) {
            return LoginInputValidationType.NoEmail
        }
        return LoginInputValidationType.Valid
    }
}