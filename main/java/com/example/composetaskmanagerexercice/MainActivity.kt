package com.example.composetaskmanagerexercice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetaskmanagerexercice.ui.theme.ComposeTaskManagerExerciceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTaskManagerExerciceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(stringResource(R.string.status), stringResource(R.string.congrats))
                }
            }
        }
    }
}

@Composable
fun Greeting(status: String, congrats: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
            Row {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.size(250.dp)
                )
            }
            Row {
                Text(
                    text = status,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding(top = 24.dp)
                        .padding(bottom = 8.dp),
                    textAlign = TextAlign.Center
                )
            }
            Row {
                Text(
                    text = congrats,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTaskManagerExerciceTheme {
        Greeting(stringResource(id = R.string.status), stringResource(id = R.string.congrats))
    }
}