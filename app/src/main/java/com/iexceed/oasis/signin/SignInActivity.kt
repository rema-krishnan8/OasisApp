package com.iexceed.oasis.signin

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun SignInActivity(
    state: SignInState,
    onSignInClick: () -> Unit
) {
    // error handling
    val context = LocalContext.current
    LaunchedEffect(key1 = state.isError) {
        state.isError?.let { err ->
            Toast.makeText(context, err, Toast.LENGTH_LONG).show()
        }
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = { onSignInClick() }) {
            Text(text = "Sign in to get started")
        }
    }
}
