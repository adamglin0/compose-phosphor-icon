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

public val BoldGroup.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) {
            return _parallelogram!!
        }
        _parallelogram = Builder(name = "Parallelogram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.78f, 45.14f)
                arcTo(19.92f, 19.92f, 0.0f, false, false, 232.0f, 36.0f)
                horizontalLineTo(88.81f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 70.57f, 47.79f)
                lineToRelative(-64.8f, 144.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 24.0f, 220.0f)
                horizontalLineTo(167.19f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 18.24f, -11.79f)
                lineToRelative(64.8f, -144.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 248.78f, 45.14f)
                close()
                moveTo(164.6f, 196.0f)
                horizontalLineTo(30.2f)
                lineTo(91.4f, 60.0f)
                horizontalLineTo(225.8f)
                close()
            }
        }
        .build()
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
