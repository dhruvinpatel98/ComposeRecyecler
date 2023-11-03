import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.util.Product
import com.example.myapplication.util.ProductDetail

@Composable
fun productCard(product: Product) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .background(Color.Green)
            .fillMaxSize(),
        shape = RoundedCornerShape(2.dp),


        ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = product.title,
                fontSize = 22.sp,
                style = TextStyle(
                    color = Color.Black,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = product.price.toString(), fontSize = 22.sp,
                style = TextStyle(
                    color = Color.Black,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Black
                )
            )
            Text(
                product.discretion, fontSize = 22.sp,
                style = TextStyle(
                    color = Color.Black,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold
                )
            )

        }
    }
}

@Composable
fun showProductDetail() {
    val productList = remember {
        ProductDetail.productDetailList
    }
    LazyColumn(contentPadding = PaddingValues(8.dp)) {
        items(productList) {
            productCard(product = it)
        }
    }
}