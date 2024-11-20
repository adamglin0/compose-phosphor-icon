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

public val ThinGroup.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) {
            return _circleNotch!!
        }
        _circleNotch = Builder(name = "CircleNotch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, true, -200.0f, 0.0f)
                curveToRelative(0.0f, -39.4f, 22.9f, -75.37f, 58.33f, -91.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.34f, 7.27f)
                curveTo(57.07f, 58.6f, 36.0f, 91.71f, 36.0f, 128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveToRelative(0.0f, -36.29f, -21.07f, -69.4f, -53.67f, -84.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.34f, -7.27f)
                curveTo(205.1f, 52.63f, 228.0f, 88.6f, 228.0f, 128.0f)
                close()
            }
        }
        .build()
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
