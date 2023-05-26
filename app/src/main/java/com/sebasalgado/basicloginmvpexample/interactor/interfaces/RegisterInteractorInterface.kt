package com.sebasalgado.basicloginmvpexample.interactor.interfaces

import com.sebasalgado.basicloginmvpexample.presenter.interfaces.RegisterPresenterInterface

interface RegisterInteractorInterface {

    fun validarRegistroUsuario(
        username: String,
        email: String,
        password: String,
        repitePassword: String, presenter: RegisterPresenterInterface
    ) {
        TODO("Not yet implemented")
    }

    fun registrarUsuario(
        username: String,
        email: String,
        password: String,
        presenter: RegisterPresenterInterface
    ) {
        TODO("Not yet implemented")
    }
}