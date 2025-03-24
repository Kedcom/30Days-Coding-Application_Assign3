package com.example.a30dayscoding_ass3

import android.os.Bundle
//import android.provider.ContactsContract.RawContacts.Data
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30dayscoding_ass3.Data.Data
import com.example.a30dayscoding_ass3.Data.datas
import com.example.a30dayscoding_ass3.ui.theme._30DaysCoding_Ass3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysCoding_Ass3Theme {
                CodingApp()
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CodingTopAppBar() {
    CenterAlignedTopAppBar(  //Title
        title = {
            Text(
                "30 Days Coding Challenge",
                style = MaterialTheme.typography.headlineSmall
            )
        }
    )
}

@Composable
fun CodingApp(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CodingTopAppBar()
        }
    ) { innerPadding ->
        LazyColumn(contentPadding = innerPadding)
        {
            items(datas) { item ->
                CodingCard(
                    item,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                )
            }
        }
    }
}


@Composable
fun CodingCard(data: Data, modifier: Modifier = Modifier) {

    var expanded by remember { mutableStateOf(false) }

    val color by animateColorAsState(
        targetValue = if(expanded) MaterialTheme.colorScheme.tertiaryContainer
        else MaterialTheme.colorScheme.primaryContainer
    )
    Card(
        modifier = modifier.padding(8.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioHighBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
            .background(MaterialTheme.colorScheme.primary),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(  //number of days (e.g Day1)
                text = "${data.day}",
                style = MaterialTheme.typography.headlineSmall,
                color = Color.White,
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.Start) // Align's text to the left...
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            Image(
                painter = painterResource(data.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(194.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            AnimatedVisibility(
                visible = expanded,
                enter = fadeIn(),
                exit = fadeOut()
            ) {
                Column (modifier = Modifier.fillMaxWidth()) {
                    Text( //Bold header Title
                        text = stringResource(data.stringResourceId),
                        style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 22.dp) //bottom padding to create space
                    )
                    Text(  //Description section...
                        modifier = Modifier.padding(start = 8.dp),
                        text = stringResource(data.DescriptionResourceId),
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button (onClick = {
                expanded = !expanded
            }
            ) {
                Icon(
                    imageVector =  if (expanded) Icons.Filled.KeyboardArrowUp
                    else Icons.Filled.KeyboardArrowDown,
                    contentDescription = null
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCodingApp() {
    _30DaysCoding_Ass3Theme {
        CodingApp()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreviewDark() {
    _30DaysCoding_Ass3Theme(darkTheme= true) {
        CodingApp()
    }
}