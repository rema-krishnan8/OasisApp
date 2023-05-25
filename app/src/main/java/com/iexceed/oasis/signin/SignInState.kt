package com.iexceed.oasis.signin

data class SignInState(
    val isSuccessful: Boolean = false,
    val isError: String? = null
)
