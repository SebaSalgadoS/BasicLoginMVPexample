package com.sebasalgado.basicloginmvpexample.interactor.interfaces

import com.sebasalgado.basicloginmvpexample.presenter.interfaces.LoginPresenterInterface

interface LoginInteractorInterface {

    fun validarUsuario(email: String, password: String, presenterInterface: LoginPresenterInterface)

}