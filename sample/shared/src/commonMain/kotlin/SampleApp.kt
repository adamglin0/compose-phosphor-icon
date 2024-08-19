import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import com.adamglin.AllIcons
import com.adamglin.PhosphorIcons

@Composable
fun SampleApp() {
    MaterialTheme {
        Scaffold {
            LazyVerticalGrid(
                modifier = Modifier.padding(it),
                columns = GridCells.Adaptive(40.dp)
            ) {
                PhosphorIcons.AllIcons.fastForEach {
                    item {
                        Icon(imageVector = it, contentDescription = null)
                    }
                }
            }
        }
    }
}