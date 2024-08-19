package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Microphoneslash: ImageVector
    get() {
        if (_microphoneslash != null) {
            return _microphoneslash!!
        }
        _microphoneslash = Builder(name = "Microphoneslash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.44f, 220.0f)
                lineTo(52.44f, 44.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 52.0f)
                lineTo(82.0f, 94.32f)
                lineTo(82.0f, 128.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 67.56f, 40.64f)
                lineToRelative(13.75f, 15.12f)
                arcTo(65.26f, 65.26f, 0.0f, false, true, 128.0f, 194.0f)
                arcToRelative(66.08f, 66.08f, 0.0f, false, true, -66.0f, -66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcToRelative(78.09f, 78.09f, 0.0f, false, false, 72.0f, 77.75f)
                lineTo(122.0f, 240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 205.77f)
                arcToRelative(76.93f, 76.93f, 0.0f, false, false, 37.48f, -13.0f)
                lineTo(203.56f, 228.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -34.0f, -34.0f)
                lineTo(94.0f, 107.52f)
                lineToRelative(47.12f, 51.84f)
                arcTo(33.82f, 33.82f, 0.0f, false, true, 128.0f, 162.0f)
                close()
                moveTo(187.32f, 157.0f)
                arcTo(65.38f, 65.38f, 0.0f, false, false, 194.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(77.33f, 77.33f, 0.0f, false, true, -7.9f, 34.25f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 187.32f, 157.0f)
                close()
                moveTo(85.8f, 45.67f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 174.0f, 64.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(45.17f, 45.17f, 0.0f, false, true, -0.25f, 4.81f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 5.38f)
                quadToRelative(-0.31f, 0.0f, -0.63f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.34f, -6.59f)
                arcTo(35.41f, 35.41f, 0.0f, false, false, 162.0f, 128.0f)
                lineTo(162.0f, 64.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 96.8f, 50.45f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.0f, -4.78f)
                close()
            }
        }
        .build()
        return _microphoneslash!!
    }

private var _microphoneslash: ImageVector? = null
