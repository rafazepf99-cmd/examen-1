package com.example.examen.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examen.ui.theme.ExamenTheme

@Composable
fun ProfileScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Column {

            Text(
                text = "Onion Math",
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text("kyzamiz - Grade 4")

            Spacer(modifier = Modifier.height(20.dp))

            Text("Learning")

            Spacer(modifier = Modifier.height(10.dp))

            CourseBox(
                "Autumn Term",
                "Week 1",
                Color(0xFF7E57C2)
            )

            Spacer(modifier = Modifier.height(12.dp))

            CourseBox(
                "Try for 7 Days",
                "Day 2",
                Color(0xFF4FC3F7)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ExamenTheme {
        Surface {
            ProfileScreen()
        }
    }
}