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

public val ThinGroup.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) {
            return _clockClockwise!!
        }
        _clockClockwise = Builder(name = "ClockClockwise", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 80.0f)
                verticalLineToRelative(45.74f)
                lineToRelative(38.06f, 22.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.12f, 6.86f)
                lineToRelative(-40.0f, -24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 124.0f, 128.0f)
                lineTo(124.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(224.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(220.0f, 92.85f)
                curveTo(211.33f, 82.46f, 203.0f, 73.0f, 193.05f, 63.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, false, -1.9f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.5f, -5.82f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 1.73f, -120.5f)
                curveTo(197.7f, 79.0f, 206.39f, 89.0f, 215.53f, 100.0f)
                lineTo(184.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(228.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 60.0f)
                close()
            }
        }
        .build()
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
