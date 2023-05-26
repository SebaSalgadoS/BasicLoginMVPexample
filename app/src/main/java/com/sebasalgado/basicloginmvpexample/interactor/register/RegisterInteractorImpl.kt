package com.sebasalgado.basicloginmvpexample.interactor.register

import com.sebasalgado.basicloginmvpexample.interactor.interfaces.RegisterInteractorInterface
import com.sebasalgado.basicloginmvpexample.presenter.interfaces.RegisterPresenterInterface


class RegisterInteractorImpl : RegisterInteractorInterface {

    override fun validarRegistroUsuario(
        username: String,
        email: String,
        password: String,
        repitePassword: String,
        presenter: RegisterPresenterInterface
    ) {
        super.validarRegistroUsuario(username, email, password, repitePassword, presenter)
    }

    override fun registrarUsuario(
        username: String,
        email: String,
        password: String,
        presenter: RegisterPresenterInterface
    ) {
        super.registrarUsuario(username, email, password, presenter)
    }
}