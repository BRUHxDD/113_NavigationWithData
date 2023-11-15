package com.example.activity6.ui.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.activity6.Greeting
import com.example.activity6.R
import com.example.activity6.data.ContactUiState
import com.example.activity6.ui.theme.Activity6Theme

@Composable
fun HalamanDua(
    contactUiState: ContactUiState,
    onBackButtonClicked: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = stringResource(id = R.string.nama))
        Text(text = contactUiState.nama)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))

        Text(text = stringResource(id = R.string.alamat))
        Text(text = contactUiState.alamat)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))

        Text(text = stringResource(id = R.string.notlp))
        Text(text = contactUiState.tlp)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))

        Button(onClick = onBackButtonClicked) {
            Text(text = stringResource(id = R.string.btn_back))
        }
    }
}