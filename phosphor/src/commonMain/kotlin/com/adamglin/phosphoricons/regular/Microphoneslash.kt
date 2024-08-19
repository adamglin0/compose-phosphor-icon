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

public val RegularGroup.Microphoneslash: ImageVector
    get() {
        if (_microphoneslash != null) {
            return _microphoneslash!!
        }
        _microphoneslash = Builder(name = "Microphoneslash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 218.62f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.08f, 53.38f)
                lineTo(80.0f, 95.09f)
                lineTo(80.0f, 128.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 69.11f, 43.12f)
                lineToRelative(11.1f, 12.2f)
                arcTo(63.41f, 63.41f, 0.0f, false, true, 128.0f, 192.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(80.11f, 80.11f, 0.0f, false, false, 72.0f, 79.6f)
                lineTo(120.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 207.59f)
                arcToRelative(78.83f, 78.83f, 0.0f, false, false, 35.16f, -12.22f)
                lineToRelative(30.92f, 34.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(96.0f, 112.69f)
                lineToRelative(41.66f, 45.82f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 160.0f)
                close()
                moveTo(185.52f, 156.09f)
                arcTo(63.32f, 63.32f, 0.0f, false, false, 192.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(79.16f, 79.16f, 0.0f, false, true, -8.11f, 35.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.19f, 4.49f)
                arcToRelative(7.88f, 7.88f, 0.0f, false, true, -3.51f, -0.82f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 185.52f, 156.09f)
                close()
                moveTo(84.0f, 44.87f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 176.0f, 64.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(49.19f, 49.19f, 0.0f, false, true, -0.26f, 5.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 7.17f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, -0.84f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.12f, -8.79f)
                curveToRelative(0.11f, -1.1f, 0.17f, -2.24f, 0.17f, -3.36f)
                lineTo(159.95f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 98.64f, 51.25f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 84.0f, 44.87f)
                close()
            }
        }
        .build()
        return _microphoneslash!!
    }

private var _microphoneslash: ImageVector? = null
