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

public val ThinGroup.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) {
            return _lineSegment!!
        }
        _lineSegment = Builder(name = "LineSegment", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.81f, 44.19f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -42.23f, 36.57f)
                lineTo(80.76f, 169.58f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -36.57f, 2.63f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 42.23f, 3.0f)
                lineToRelative(88.82f, -88.82f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 36.57f, -42.23f)
                close()
                moveTo(78.14f, 206.19f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -28.28f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 78.14f, 206.15f)
                close()
                moveTo(206.14f, 78.19f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.28f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 28.28f, 0.0f)
                close()
            }
        }
        .build()
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
