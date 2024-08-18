import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import com.adamglin.phosphor.AllIcons
import com.adamglin.phosphor.PhosphorIcon

@Composable
fun SampleApp() {
    val safePaddings = WindowInsets.safeContent.asPaddingValues()
    LazyVerticalGrid(
        columns = GridCells.Adaptive(40.dp)
    ) {
        PhosphorIcon.AllIcons.fastForEach {
            item {
                Icon(imageVector = it, contentDescription = null)
            }
        }
    }
}