import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.WhitePoint
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import androidx.compose.ui.window.Dialog
import com.adamglin.AllIcons
import com.adamglin.PhosphorIcons

@Composable
fun SampleApp() {
    MaterialTheme {
        var detailIcon by remember { mutableStateOf<ImageVector?>(null) }
        Scaffold {
            LazyVerticalGrid(
                modifier = Modifier.padding(it),
                columns = GridCells.FixedSize(40.dp)
            ) {
                PhosphorIcons.AllIcons.fastForEach {
                    item {
                        Icon(
                            imageVector = it,
                            contentDescription = null,
                            modifier = Modifier.border(width = 1.dp, color = Color.Black).clickable { detailIcon = it }
                        )
                    }
                }
            }
        }

        if (detailIcon != null) {
            Dialog(
                onDismissRequest = { detailIcon = null }
            ) {
                Box(Modifier.background(Color.White).padding(50.dp), contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = detailIcon!!,
                        contentDescription = null,
                        modifier = Modifier.border(width = 1.dp, color = Color.Blue)
                    )
                }
            }
        }
    }
}