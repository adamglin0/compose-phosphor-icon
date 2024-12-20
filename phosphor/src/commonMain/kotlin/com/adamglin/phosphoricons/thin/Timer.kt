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

public val ThinGroup.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 44.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, false, 92.0f, 92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 128.0f, 44.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(170.83f, 93.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.66f, -5.66f)
                lineToRelative(40.0f, -40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 170.83f, 93.17f)
                close()
                moveTo(100.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(104.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 100.0f, 16.0f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
