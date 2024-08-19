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

public val LightGroup.Exclamationmark: ImageVector
    get() {
        if (_exclamationmark != null) {
            return _exclamationmark!!
        }
        _exclamationmark = Builder(name = "Exclamationmark", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 142.0f, 200.0f)
                close()
                moveTo(128.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(134.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 158.0f)
                close()
            }
        }
        .build()
        return _exclamationmark!!
    }

private var _exclamationmark: ImageVector? = null
