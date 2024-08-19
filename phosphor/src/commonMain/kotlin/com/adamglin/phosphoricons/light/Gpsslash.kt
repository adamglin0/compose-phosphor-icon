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

public val LightGroup.Gpsslash: ImageVector
    get() {
        if (_gpsslash != null) {
            return _gpsslash!!
        }
        _gpsslash = Builder(name = "Gpsslash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(213.79f, 134.0f)
                arcToRelative(85.2f, 85.2f, 0.0f, false, true, -7.3f, 29.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.48f, 3.55f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, true, -2.45f, -0.53f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.0f, -7.93f)
                arcToRelative(74.05f, 74.05f, 0.0f, false, false, -91.28f, -100.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.84f, -11.37f)
                arcTo(85.64f, 85.64f, 0.0f, false, true, 122.0f, 42.22f)
                lineTo(122.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(134.0f, 42.23f)
                arcTo(86.12f, 86.12f, 0.0f, false, true, 213.77f, 122.0f)
                lineTo(240.0f, 122.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 128.0f)
                close()
                moveTo(212.44f, 212.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.88f, 8.08f)
                lineToRelative(-22.3f, -24.54f)
                arcTo(85.73f, 85.73f, 0.0f, false, true, 134.0f, 213.77f)
                lineTo(134.0f, 240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 213.77f)
                arcTo(86.12f, 86.12f, 0.0f, false, true, 42.23f, 134.0f)
                lineTo(16.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(42.22f, 122.0f)
                arcTo(86.23f, 86.23f, 0.0f, false, true, 65.86f, 68.56f)
                lineTo(43.56f, 44.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 52.44f, 36.0f)
                close()
                moveTo(173.17f, 186.6f)
                lineTo(74.0f, 77.48f)
                arcTo(74.0f, 74.0f, 0.0f, false, false, 173.17f, 186.6f)
                close()
            }
        }
        .build()
        return _gpsslash!!
    }

private var _gpsslash: ImageVector? = null
