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

public val LightGroup.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) {
            return _mapPinLine!!
        }
        _mapPinLine = Builder(name = "MapPinLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 226.0f)
                lineTo(145.22f, 226.0f)
                arcToRelative(266.37f, 266.37f, 0.0f, false, false, 27.31f, -27.06f)
                curveToRelative(27.13f, -31.2f, 41.47f, -64.0f, 41.47f, -94.94f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, -172.0f, 0.0f)
                curveToRelative(0.0f, 30.91f, 14.34f, 63.74f, 41.47f, 94.94f)
                arcTo(266.37f, 266.37f, 0.0f, false, false, 110.78f, 226.0f)
                lineTo(56.0f, 226.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(200.0f, 238.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(54.0f, 104.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, 148.0f, 0.0f)
                curveToRelative(0.0f, 59.62f, -59.0f, 108.93f, -74.0f, 120.51f)
                curveTo(113.0f, 212.93f, 54.0f, 163.62f, 54.0f, 104.0f)
                close()
                moveTo(166.0f, 104.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 166.0f, 104.0f)
                close()
                moveTo(102.0f, 104.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 102.0f, 104.0f)
                close()
            }
        }
        .build()
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
