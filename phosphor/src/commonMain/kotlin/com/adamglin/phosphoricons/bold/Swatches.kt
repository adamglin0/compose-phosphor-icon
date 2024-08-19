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

public val BoldGroup.Swatches: ImageVector
    get() {
        if (_swatches != null) {
            return _swatches!!
        }
        _swatches = Builder(name = "Swatches", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.79f, 149.32f)
                lineTo(223.7f, 97.11f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 198.12f, 85.2f)
                lineToRelative(-61.31f, 22.22f)
                lineTo(147.7f, 45.18f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 131.55f, 22.0f)
                lineTo(76.87f, 12.31f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 53.76f, 28.55f)
                lineToRelative(-25.0f, 143.13f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 67.4f, 227.26f)
                arcToRelative(51.19f, 51.19f, 0.0f, false, false, 8.7f, 0.74f)
                lineTo(224.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 156.19f)
                arcTo(21.74f, 21.74f, 0.0f, false, false, 242.79f, 149.32f)
                close()
                moveTo(99.0f, 184.18f)
                arcToRelative(23.84f, 23.84f, 0.0f, false, true, -9.86f, 15.56f)
                arcToRelative(23.28f, 23.28f, 0.0f, false, true, -17.56f, 3.89f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -19.23f, -27.82f)
                lineTo(76.71f, 36.66f)
                lineTo(123.37f, 45.0f)
                lineTo(99.0f, 184.18f)
                close()
                moveTo(122.64f, 188.31f)
                lineTo(132.03f, 134.67f)
                lineTo(202.52f, 109.13f)
                lineTo(218.82f, 153.72f)
                lineTo(122.59f, 188.59f)
                curveTo(122.62f, 188.5f, 122.65f, 188.41f, 122.66f, 188.31f)
                close()
                moveTo(220.0f, 204.0f)
                lineTo(150.52f, 204.0f)
                lineTo(220.0f, 178.82f)
                close()
                moveTo(89.22f, 174.07f)
                lineToRelative(-1.4f, 8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 76.0f, 192.0f)
                arcToRelative(12.35f, 12.35f, 0.0f, false, true, -2.08f, -0.18f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.75f, -13.89f)
                lineToRelative(1.4f, -8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.64f, 4.14f)
                close()
            }
        }
        .build()
        return _swatches!!
    }

private var _swatches: ImageVector? = null
