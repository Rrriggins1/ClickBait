package com.example.clickbait

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.clickbait.data.DataSource
import com.example.clickbait.data.DataSource.baits
import com.example.clickbait.model.Bait
import com.example.clickbait.ui.theme.ClickBaitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClickBaitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ClickBaitApp()
                }
            }
        }
    }
}
@Preview
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ClickBaitApp(){
    Scaffold(
        topBar = {
            TopAppBar()
        }
    ) { it ->
        LazyVerticalGrid(
            contentPadding = it,
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(8.dp)
        ) {
            items(DataSource.baits) { baits -> ClickBaitCard(baits) }
        }
    }
}

@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Row() {
                Text(
                    text = "Top Headlines"
                )
            }
        },
        modifier = modifier
    )
}



@Composable
fun ClickBaitCard(bait: Bait, modifier: Modifier = Modifier){
    Card{
        Row{
            Image(
                painter = painterResource(id = bait.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height = 150.dp)
            )
        }
        Row{
            Text(
                text = stringResource(id = bait.source),
                maxLines = 4,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier.padding(
                    start = 16.dp,
                    top = 8.dp,
                    bottom = 8.dp
                )
            )
        }
        Row{
            Text(
                text = stringResource(id = bait.desc),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(16.dp)
            )
        }
        Row{
            Divider()
        }
        Row{
            Text(
                text = stringResource(id = bait.time),
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Composable
fun Divider(
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    color: Color = Color(android.graphics.Color.GRAY),
    startIndent: Dp = 0.dp
) {
}