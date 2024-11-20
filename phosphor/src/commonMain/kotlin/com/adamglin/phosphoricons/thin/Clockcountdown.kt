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

public val ThinGroup.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) {
            return _clockCountdown!!
        }
        _clockCountdown = Builder(name = "ClockCountdown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 136.33f)
                arcTo(100.13f, 100.13f, 0.0f, true, true, 119.67f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.66f, 8.0f)
                arcTo(92.13f, 92.13f, 0.0f, true, false, 220.0f, 135.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.66f)
                close()
                moveTo(128.0f, 132.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(132.0f, 124.0f)
                lineTo(132.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 132.0f)
                close()
                moveTo(160.0f, 44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 44.0f)
                close()
                moveTo(196.0f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 196.0f, 68.0f)
                close()
                moveTo(220.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 220.0f, 104.0f)
                close()
            }
        }
        .build()
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
