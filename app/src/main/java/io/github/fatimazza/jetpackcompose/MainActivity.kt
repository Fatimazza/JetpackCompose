package io.github.fatimazza.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Android", "This is a message")
        }
    }
}

@Composable
fun Greeting(author: String, body: String) {
    Text(text = "Hello $author!")
    Text(text = "$body")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Android", "This is a message")
}
