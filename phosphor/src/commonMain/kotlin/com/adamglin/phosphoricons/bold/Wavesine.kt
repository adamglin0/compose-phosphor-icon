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

public val BoldGroup.Wavesine: ImageVector
    get() {
        if (_wavesine != null) {
            return _wavesine!!
        }
        _wavesine = Builder(name = "Wavesine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.86f, 133.1f)
                curveToRelative(-23.0f, 49.0f, -43.0f, 70.9f, -64.82f, 70.9f)
                curveToRelative(-27.64f, 0.0f, -43.8f, -34.44f, -60.9f, -70.9f)
                curveTo(110.0f, 117.78f, 102.53f, 102.0f, 94.92f, 90.73f)
                curveTo(88.39f, 81.09f, 82.53f, 76.0f, 78.0f, 76.0f)
                curveToRelative(-3.82f, 0.0f, -18.24f, 4.12f, -43.09f, 57.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -21.73f, -10.2f)
                curveToRelative(23.0f, -49.0f, 43.0f, -70.9f, 64.82f, -70.9f)
                curveToRelative(27.64f, 0.0f, 43.8f, 34.44f, 60.9f, 70.9f)
                curveToRelative(7.19f, 15.32f, 14.61f, 31.15f, 22.22f, 42.37f)
                curveToRelative(6.53f, 9.64f, 12.39f, 14.73f, 17.0f, 14.73f)
                curveToRelative(3.82f, 0.0f, 18.24f, -4.12f, 43.09f, -57.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 21.73f, 10.2f)
                close()
            }
        }
        .build()
        return _wavesine!!
    }

private var _wavesine: ImageVector? = null
