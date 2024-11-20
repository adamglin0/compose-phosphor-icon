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

public val LightGroup.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) {
            return _clockCountdown!!
        }
        _clockCountdown = Builder(name = "ClockCountdown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 136.49f)
                arcTo(102.12f, 102.12f, 0.0f, true, true, 119.51f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.0f, 12.0f)
                arcTo(90.13f, 90.13f, 0.0f, true, false, 218.0f, 135.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 1.0f)
                close()
                moveTo(122.0f, 72.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 122.0f)
                lineTo(134.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                close()
                moveTo(160.0f, 46.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 160.0f, 46.0f)
                close()
                moveTo(196.0f, 70.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 196.0f, 70.0f)
                close()
                moveTo(220.0f, 106.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 220.0f, 106.0f)
                close()
            }
        }
        .build()
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
