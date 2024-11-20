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

public val LightGroup.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = Builder(name = "MapPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 66.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 128.0f, 66.0f)
                close()
                moveTo(128.0f, 130.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 130.0f)
                close()
                moveTo(128.0f, 18.0f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, -86.0f, 86.0f)
                curveToRelative(0.0f, 30.91f, 14.34f, 63.74f, 41.47f, 94.94f)
                arcToRelative(252.32f, 252.32f, 0.0f, false, false, 41.09f, 38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.88f, 0.0f)
                arcToRelative(252.32f, 252.32f, 0.0f, false, false, 41.09f, -38.0f)
                curveToRelative(27.13f, -31.2f, 41.47f, -64.0f, 41.47f, -94.94f)
                arcTo(86.1f, 86.1f, 0.0f, false, false, 128.0f, 18.0f)
                close()
                moveTo(128.0f, 224.51f)
                curveTo(113.0f, 212.93f, 54.0f, 163.62f, 54.0f, 104.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, 148.0f, 0.0f)
                curveTo(202.0f, 163.62f, 143.0f, 212.93f, 128.0f, 224.51f)
                close()
            }
        }
        .build()
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
