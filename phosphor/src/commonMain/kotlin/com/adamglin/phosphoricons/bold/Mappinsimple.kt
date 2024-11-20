package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) {
            return _mapPinSimple!!
        }
        _mapPinSimple = Builder(name = "MapPinSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 72.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, -72.0f, 58.79f)
                lineTo(116.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 130.79f)
                arcTo(60.09f, 60.09f, 0.0f, false, false, 188.0f, 72.0f)
                close()
                moveTo(128.0f, 108.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 108.0f)
                close()
            }
        }
        .build()
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
