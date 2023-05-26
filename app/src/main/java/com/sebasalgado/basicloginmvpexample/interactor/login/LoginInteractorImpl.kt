package com.sebasalgado.basicloginmvpexample.interactor.login

import com.sebasalgado.basicloginmvpexample.interactor.interfaces.LoginInteractorInterface
import com.sebasalgado.basicloginmvpexample.presenter.interfaces.LoginPresenterInterface

class LoginInteractorImpl: LoginInteractorInterface{


    override fun validarUsuario(
        email: String,
        password: String,
        presenterInterface: LoginPresenterInterface
    ) {
        TODO("Not yet implemented")
    }
}