package io.github.fatimazza.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCard(
                Message ("Android", "This is a message"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun GreetingCard(msg: Message) {
    Column {
        Image(
            painterResource(R.drawable.sample_image),
            "Contact profile picture",
        )
        Text(text = msg.author)
        Text(text = msg.body)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingCard(
        msg = Message ("Android", "This is a message")
    )
}
