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

public val RegularGroup.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(158.66f, 196.44f)
                lineToRelative(-32.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.32f, -8.88f)
                lineToRelative(32.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.32f, 8.88f)
                close()
                moveTo(232.0f, 92.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, 76.0f)
                lineTo(132.28f, 168.0f)
                lineToRelative(-29.62f, 44.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.32f, -8.88f)
                lineTo(113.05f, 168.0f)
                lineTo(76.0f, 168.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 76.0f, 64.0f)
                arcToRelative(53.26f, 53.26f, 0.0f, false, true, 8.92f, 0.76f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 232.0f, 92.0f)
                close()
                moveTo(216.0f, 92.0f)
                arcTo(60.06f, 60.06f, 0.0f, false, false, 96.0f, 88.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, -0.92f)
                quadToRelative(0.21f, -3.66f, 0.77f, -7.23f)
                arcTo(38.11f, 38.11f, 0.0f, false, false, 76.0f, 80.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 72.0f)
                horizontalLineToRelative(80.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 216.0f, 92.0f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
