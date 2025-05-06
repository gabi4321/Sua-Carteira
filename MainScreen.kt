package com.example.carteira.ui

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.AttachMoney

@Composable
fun MainScreen() {
    val items = listOf("Cartões", "Compras", "Dívidas", "Receitas", "Config")
    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEach { label ->
                    NavigationBarItem(
                        icon = { Icon(Icons.Default.AttachMoney, contentDescription = label) },
                        label = { Text(label) },
                        selected = false,
                        onClick = { /* TODO: navegar */ }
                    )
                }
            }
        }
    ) { innerPadding ->
        // TODO: conteúdo das telas
        Text("Bem-vindo ao Carteira!", modifier = androidx.compose.ui.Modifier.padding(innerPadding).padding(16.dp))
    }
}
