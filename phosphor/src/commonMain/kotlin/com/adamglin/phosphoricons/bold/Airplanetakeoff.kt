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

public val BoldGroup.Airplanetakeoff: ImageVector
    get() {
        if (_airplanetakeoff != null) {
            return _airplanetakeoff!!
        }
        _airplanetakeoff = Builder(name = "Airplanetakeoff", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(24.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -24.0f)
                lineTo(168.0f, 204.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 216.0f)
                close()
                moveTo(251.79f, 89.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.64f, 8.1f)
                lineTo(98.75f, 186.0f)
                lineToRelative(-0.13f, 0.07f)
                arcToRelative(43.74f, 43.74f, 0.0f, false, true, -52.2f, -5.94f)
                lineToRelative(-0.19f, -0.18f)
                lineToRelative(-36.0f, -35.25f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 15.78f, 112.0f)
                lineToRelative(2.94f, -1.44f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.12f, -0.59f)
                lineToRelative(26.5f, 8.94f)
                lineToRelative(14.15f, -8.56f)
                lineTo(50.42f, 92.78f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 5.7f, -33.05f)
                lineToRelative(0.48f, -0.2f)
                lineToRelative(7.15f, -2.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.4f, 0.0f)
                lineTo(124.29f, 76.0f)
                lineToRelative(49.93f, -29.8f)
                arcToRelative(43.8f, 43.8f, 0.0f, false, true, 56.43f, 10.0f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, true, 0.17f, 0.22f)
                lineTo(249.46f, 80.3f)
                arcTo(11.94f, 11.94f, 0.0f, false, true, 251.79f, 89.88f)
                close()
                moveTo(222.18f, 84.34f)
                lineTo(212.0f, 71.29f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, -25.54f, -4.48f)
                lineToRelative(-54.77f, 32.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.3f, 1.0f)
                lineToRelative(-46.0f, -16.94f)
                lineToRelative(21.0f, 20.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.15f, 18.87f)
                lineTo(62.0f, 142.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.0f, 1.1f)
                lineToRelative(-13.35f, -4.5f)
                lineToRelative(24.31f, 23.8f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 23.6f, 2.65f)
                close()
            }
        }
        .build()
        return _airplanetakeoff!!
    }

private var _airplanetakeoff: ImageVector? = null
