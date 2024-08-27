package com.amckinn9.namebadge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amckinn9.namebadge.ui.theme.NameBadgeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NameBadgeTheme {
                NameBadge()
            }
        }
    }
}

@Composable
fun NameBadge() {
    //Outer Frame
    Column(
        modifier = Modifier
            .padding(10.dp)
            .graphicsLayer(
                translationX = 1f,  // Adjust position horizontally
                translationY = -1f   // Adjust position vertically
            )
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center,

        ) {
        //Inner Frame
        Column( modifier = Modifier
            .padding(6.dp)
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.secondary
            )
            .scale(.85f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
            ) {
            Text(
                text = "Ashleigh",
                style = MaterialTheme.typography.headlineLarge,
                fontSize = 64.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "McKinney",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 15.dp))
            BadgePhoto()
            BoldBodyText(text = "COMPUTER SCIENCE",
                modifier = Modifier
                    .padding(top = 20.dp))
            BoldBodyText(text = "Senior",
                modifier = Modifier
                    .padding(bottom = 15.dp))
            BodyText("GitHub: @ashmicmck1")
            BodyText("Email: amckinn9@xula.edu")
            BodyText("LinkedIn: https://www.linkedin.com/in/ashleigh-mckinney-b3b73722a/ ",
                textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun BoldBodyText(text: String, modifier :Modifier = Modifier) {
    Text(text= text,
        modifier = modifier,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold)
}

@Composable
fun BodyText(text: String, textAlign: TextAlign = TextAlign.Left) {
    Text(text= text,
        textAlign = textAlign,
        fontSize = 12.sp,
        style = MaterialTheme.typography.bodySmall)

}

@Composable
fun BadgePhoto() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center,
        modifier = Modifier.size(279.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.badge_photo),
            contentDescription = "Badge picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun NameBadgePreview() {
    NameBadgeTheme {
        NameBadge()
    }
}