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

public val LightGroup.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) {
            return _circleHalf!!
        }
        _circleHalf = Builder(name = "CircleHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(134.0f, 38.2f)
                arcToRelative(89.86f, 89.86f, 0.0f, false, true, 20.0f, 3.63f)
                lineTo(154.0f, 214.17f)
                arcToRelative(89.86f, 89.86f, 0.0f, false, true, -20.0f, 3.63f)
                close()
                moveTo(166.0f, 46.43f)
                arcToRelative(90.48f, 90.48f, 0.0f, false, true, 20.0f, 12.81f)
                lineTo(186.0f, 196.76f)
                arcToRelative(90.48f, 90.48f, 0.0f, false, true, -20.0f, 12.81f)
                close()
                moveTo(38.0f, 128.0f)
                arcToRelative(90.12f, 90.12f, 0.0f, false, true, 84.0f, -89.8f)
                lineTo(122.0f, 217.8f)
                arcTo(90.12f, 90.12f, 0.0f, false, true, 38.0f, 128.0f)
                close()
                moveTo(198.0f, 184.5f)
                lineTo(198.0f, 71.5f)
                arcToRelative(89.81f, 89.81f, 0.0f, false, true, 0.0f, 113.0f)
                close()
            }
        }
        .build()
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
