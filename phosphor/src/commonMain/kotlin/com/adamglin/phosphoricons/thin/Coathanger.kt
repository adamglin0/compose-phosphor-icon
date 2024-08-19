package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Coathanger: ImageVector
    get() {
        if (_coathanger != null) {
            return _coathanger!!
        }
        _coathanger = Builder(name = "Coathanger", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.18f, 174.4f)
                lineTo(134.67f, 96.0f)
                lineToRelative(27.72f, -20.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 164.0f, 72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -72.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 55.92f, -2.0f)
                lineToRelative(-30.26f, 22.7f)
                lineToRelative(-0.14f, 0.1f)
                lineTo(16.82f, 174.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 196.0f)
                lineTo(232.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.2f, -21.6f)
                close()
                moveTo(235.77f, 185.27f)
                arcTo(3.88f, 3.88f, 0.0f, false, true, 232.0f, 188.0f)
                lineTo(24.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.4f, -7.2f)
                lineTo(128.0f, 101.0f)
                lineToRelative(106.38f, 79.8f)
                arcTo(3.88f, 3.88f, 0.0f, false, true, 235.77f, 185.27f)
                close()
            }
        }
        .build()
        return _coathanger!!
    }

private var _coathanger: ImageVector? = null
