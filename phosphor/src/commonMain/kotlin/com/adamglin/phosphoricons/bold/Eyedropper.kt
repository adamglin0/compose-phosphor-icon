package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) {
            return _eyedropper!!
        }
        _eyedropper = Builder(name = "Eyedropper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 67.24f)
                arcToRelative(39.77f, 39.77f, 0.0f, false, false, -12.51f, -28.52f)
                curveTo(199.91f, 24.0f, 174.71f, 24.5f, 159.29f, 39.93f)
                lineTo(142.48f, 56.84f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -35.64f, 3.29f)
                lineToRelative(-9.0f, 9.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.73f, 27.49f)
                lineTo(48.9f, 144.84f)
                arcTo(43.76f, 43.76f, 0.0f, false, false, 37.0f, 185.28f)
                lineToRelative(-7.5f, 17.19f)
                arcToRelative(17.66f, 17.66f, 0.0f, false, false, 3.71f, 19.65f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 22.15f, 4.19f)
                lineToRelative(16.31f, -7.13f)
                arcToRelative(43.88f, 43.88f, 0.0f, false, false, 39.45f, -12.09f)
                lineToRelative(48.24f, -48.26f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 27.47f, -0.73f)
                lineToRelative(9.0f, -9.0f)
                arcToRelative(28.06f, 28.06f, 0.0f, false, false, 3.26f, -35.72f)
                lineToRelative(17.23f, -17.33f)
                arcTo(39.69f, 39.69f, 0.0f, false, false, 228.0f, 67.24f)
                close()
                moveTo(94.15f, 190.11f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 5.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -8.32f, 0.47f)
                lineTo(57.0f, 199.38f)
                lineTo(60.69f, 191.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.37f, -8.64f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, true, 4.81f, -20.55f)
                lineToRelative(48.2f, -48.22f)
                lineToRelative(28.28f, 28.3f)
                close()
                moveTo(199.29f, 79.11f)
                lineTo(173.92f, 104.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 16.95f)
                lineToRelative(4.88f, 4.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-6.14f, 6.15f)
                lineToRelative(-55.0f, -55.05f)
                lineToRelative(6.14f, -6.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.65f, 0.0f)
                lineTo(134.35f, 82.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, 3.51f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 151.34f, 82.0f)
                lineToRelative(24.94f, -25.08f)
                curveToRelative(6.3f, -6.3f, 16.48f, -6.63f, 22.71f, -0.74f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.3f, 23.0f)
                close()
            }
        }
        .build()
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
