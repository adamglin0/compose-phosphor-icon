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

public val RegularGroup.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) {
            return _circleHalf!!
        }
        _circleHalf = Builder(name = "CircleHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(136.0f, 40.37f)
                arcToRelative(86.4f, 86.4f, 0.0f, false, true, 16.0f, 3.0f)
                lineTo(152.0f, 212.67f)
                arcToRelative(86.4f, 86.4f, 0.0f, false, true, -16.0f, 3.0f)
                close()
                moveTo(168.0f, 49.63f)
                arcToRelative(87.81f, 87.81f, 0.0f, false, true, 16.0f, 10.54f)
                lineTo(184.0f, 195.83f)
                arcToRelative(87.81f, 87.81f, 0.0f, false, true, -16.0f, 10.54f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(88.11f, 88.11f, 0.0f, false, true, 80.0f, -87.63f)
                lineTo(120.0f, 215.63f)
                arcTo(88.11f, 88.11f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(200.0f, 178.54f)
                lineTo(200.0f, 77.46f)
                arcToRelative(87.82f, 87.82f, 0.0f, false, true, 0.0f, 101.08f)
                close()
            }
        }
        .build()
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
