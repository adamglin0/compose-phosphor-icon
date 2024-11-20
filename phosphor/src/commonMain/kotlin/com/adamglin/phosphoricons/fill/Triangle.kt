package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.78f, 211.81f)
                arcTo(24.34f, 24.34f, 0.0f, false, true, 215.45f, 224.0f)
                horizontalLineTo(40.55f)
                arcToRelative(24.34f, 24.34f, 0.0f, false, true, -21.33f, -12.19f)
                arcToRelative(23.51f, 23.51f, 0.0f, false, true, 0.0f, -23.72f)
                lineTo(106.65f, 36.22f)
                arcToRelative(24.76f, 24.76f, 0.0f, false, true, 42.7f, 0.0f)
                lineTo(236.8f, 188.09f)
                arcTo(23.51f, 23.51f, 0.0f, false, true, 236.78f, 211.81f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
