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

public val RegularGroup.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) {
            return _circleNotch!!
        }
        _circleNotch = Builder(name = "CircleNotch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, -208.0f, 0.0f)
                curveToRelative(0.0f, -41.0f, 23.81f, -78.36f, 60.66f, -95.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.68f, 14.54f)
                curveTo(60.15f, 61.59f, 40.0f, 93.27f, 40.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveToRelative(0.0f, -34.73f, -20.15f, -66.41f, -51.34f, -80.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.68f, -14.54f)
                curveTo(208.19f, 49.64f, 232.0f, 87.0f, 232.0f, 128.0f)
                close()
            }
        }
        .build()
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
