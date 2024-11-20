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

public val RegularGroup.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) {
            return _mapPinSimple!!
        }
        _mapPinSimple = Builder(name = "MapPinSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 72.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -64.0f, 55.42f)
                lineTo(120.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 127.42f)
                arcTo(56.09f, 56.09f, 0.0f, false, false, 184.0f, 72.0f)
                close()
                moveTo(128.0f, 112.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 112.0f)
                close()
            }
        }
        .build()
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
