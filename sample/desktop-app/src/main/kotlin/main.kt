import androidx.compose.ui.window.singleWindowApplication
import kotlin.io.path.Path
import kotlin.io.path.createDirectory


fun main() {
    singleWindowApplication {
        SampleApp()
    }
}
