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

public val LightGroup.HighHeel: ImageVector
    get() {
        if (_highHeel != null) {
            return _highHeel!!
        }
        _highHeel = Builder(name = "HighHeel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.53f, 158.14f)
                lineTo(179.0f, 146.53f)
                lineTo(68.24f, 35.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.67f, 0.19f)
                curveTo(37.92f, 59.62f, 26.0f, 89.47f, 26.0f, 120.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(72.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(86.0f, 139.65f)
                arcToRelative(115.0f, 115.0f, 0.0f, false, true, 51.74f, 57.69f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 13.0f, 8.66f)
                lineTo(240.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineToRelative(-4.73f)
                arcTo(29.73f, 29.73f, 0.0f, false, false, 230.53f, 158.14f)
                close()
                moveTo(74.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(40.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 126.18f)
                arcTo(112.75f, 112.75f, 0.0f, false, true, 74.0f, 134.0f)
                close()
                moveTo(242.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(150.72f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.86f, -1.18f)
                arcToRelative(126.53f, 126.53f, 0.0f, false, false, -45.58f, -56.65f)
                arcToRelative(125.13f, 125.13f, 0.0f, false, false, -65.12f, -22.0f)
                curveTo(39.47f, 90.66f, 48.6f, 67.83f, 64.31f, 48.79f)
                lineTo(171.76f, 156.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.92f, 1.61f)
                lineToRelative(53.23f, 12.0f)
                arcTo(17.81f, 17.81f, 0.0f, false, true, 242.0f, 187.31f)
                close()
            }
        }
        .build()
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
