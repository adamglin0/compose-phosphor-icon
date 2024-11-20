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

public val LightGroup.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 42.0f)
                arcToRelative(94.0f, 94.0f, 0.0f, true, false, 94.0f, 94.0f)
                arcTo(94.11f, 94.11f, 0.0f, false, false, 128.0f, 42.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, true, true, 82.0f, -82.0f)
                arcTo(82.1f, 82.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(172.24f, 91.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, -8.48f)
                lineToRelative(40.0f, -40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 172.24f, 91.76f)
                close()
                moveTo(98.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(104.0f, 22.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 98.0f, 16.0f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
