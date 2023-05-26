package com.sebasalgado.basicloginmvpexample.presenter.interfaces

interface RegisterPresenterInterface {

    fun validarRegistroUsuario(
        username: String,
        email: String,
        password: String,
        repitePassword: String
    )

    fun registrarUsuario(username: String, email: String, password: String)

}