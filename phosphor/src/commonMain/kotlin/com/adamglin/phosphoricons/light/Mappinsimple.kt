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

public val LightGroup.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) {
            return _mapPinSimple!!
        }
        _mapPinSimple = Builder(name = "MapPinSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.0f, 72.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, false, -60.0f, 53.66f)
                lineTo(122.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 125.66f)
                arcTo(54.07f, 54.07f, 0.0f, false, false, 182.0f, 72.0f)
                close()
                moveTo(128.0f, 114.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 42.0f, -42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 128.0f, 114.0f)
                close()
            }
        }
        .build()
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
