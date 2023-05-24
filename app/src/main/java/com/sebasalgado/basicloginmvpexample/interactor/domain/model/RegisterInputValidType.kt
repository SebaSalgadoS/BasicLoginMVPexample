package com.sebasalgado.basicloginmvpexample.interactor.domain.model

enum class RegisterInputValidType {
    EmptyField,
    NoEmail,
    PasswordsDoNoMatch,
    PasswordTooShort,
    PasswordUpperCaseMissing,
    PasswordNumberMissing,
    PasswordSpecialCharMissing,
    Valid
}