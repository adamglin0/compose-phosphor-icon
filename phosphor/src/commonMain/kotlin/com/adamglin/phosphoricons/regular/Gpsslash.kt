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

public val RegularGroup.Gpsslash: ImageVector
    get() {
        if (_gpsslash != null) {
            return _gpsslash!!
        }
        _gpsslash = Builder(name = "Gpsslash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(215.64f, 136.0f)
                arcToRelative(87.0f, 87.0f, 0.0f, false, true, -7.33f, 28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.3f, 4.73f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.27f, -0.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.0f, -10.57f)
                arcToRelative(72.06f, 72.06f, 0.0f, false, false, -88.81f, -97.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -5.13f, -15.15f)
                arcTo(87.21f, 87.21f, 0.0f, false, true, 120.0f, 40.37f)
                lineTo(120.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(136.0f, 40.37f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 215.63f, 120.0f)
                lineTo(240.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 128.0f)
                close()
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(181.0f, 198.23f)
                arcToRelative(87.69f, 87.69f, 0.0f, false, true, -45.0f, 17.4f)
                lineTo(136.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 215.63f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 40.37f, 136.0f)
                lineTo(16.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(40.37f, 120.0f)
                arcTo(88.31f, 88.31f, 0.0f, false, true, 63.14f, 68.54f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(170.2f, 186.32f)
                lineTo(74.0f, 80.45f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 170.2f, 186.32f)
                close()
            }
        }
        .build()
        return _gpsslash!!
    }

private var _gpsslash: ImageVector? = null
