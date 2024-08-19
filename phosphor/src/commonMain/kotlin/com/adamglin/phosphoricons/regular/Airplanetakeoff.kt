package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Airplanetakeoff: ImageVector
    get() {
        if (_airplanetakeoff != null) {
            return _airplanetakeoff!!
        }
        _airplanetakeoff = Builder(name = "Airplanetakeoff", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(24.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(168.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 216.0f)
                close()
                moveTo(247.86f, 93.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.76f, 5.39f)
                lineToRelative(-147.41f, 88.0f)
                arcToRelative(40.18f, 40.18f, 0.0f, false, true, -20.26f, 5.52f)
                arcToRelative(39.78f, 39.78f, 0.0f, false, true, -27.28f, -10.87f)
                lineToRelative(-0.12f, -0.12f)
                lineTo(13.0f, 145.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 4.49f, -26.21f)
                lineToRelative(3.0f, -1.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.08f, -0.4f)
                lineToRelative(28.26f, 9.54f)
                lineTo(75.0f, 115.06f)
                lineTo(53.17f, 93.87f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 57.7f, 67.4f)
                lineToRelative(0.32f, -0.13f)
                lineToRelative(7.15f, -2.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.59f, 0.0f)
                lineTo(124.7f, 84.38f)
                lineTo(176.27f, 53.6f)
                arcToRelative(39.82f, 39.82f, 0.0f, false, true, 51.28f, 9.12f)
                lineToRelative(0.12f, 0.15f)
                lineToRelative(18.64f, 23.89f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 247.86f, 93.15f)
                close()
                moveTo(228.12f, 89.45f)
                lineTo(215.12f, 72.78f)
                arcToRelative(23.88f, 23.88f, 0.0f, false, false, -30.68f, -5.42f)
                lineToRelative(-54.8f, 32.72f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, true, -6.87f, 0.64f)
                lineTo(68.0f, 80.58f)
                lineToRelative(-4.0f, 1.53f)
                lineToRelative(0.21f, 0.2f)
                lineTo(93.57f, 110.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.43f, 12.58f)
                lineTo(59.93f, 142.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.7f, 0.73f)
                lineToRelative(-28.67f, -9.67f)
                lineToRelative(-0.19f, 0.1f)
                lineToRelative(-0.37f, 0.17f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, 0.13f, 0.12f)
                lineToRelative(36.0f, 35.26f)
                arcToRelative(23.85f, 23.85f, 0.0f, false, false, 28.42f, 3.18f)
                close()
            }
        }
        .build()
        return _airplanetakeoff!!
    }

private var _airplanetakeoff: ImageVector? = null
