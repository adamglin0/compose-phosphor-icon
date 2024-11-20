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

public val ThinGroup.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) {
            return _lineSegments!!
        }
        _lineSegments = Builder(name = "LineSegments", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.81f, 36.19f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 39.6f)
                arcToRelative(26.62f, 26.62f, 0.0f, false, false, 3.14f, 2.71f)
                lineToRelative(-29.73f, 55.21f)
                arcToRelative(28.08f, 28.08f, 0.0f, false, false, -26.38f, 3.87f)
                lineToRelative(-24.82f, -24.82f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 76.2f, 76.19f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 3.14f, 42.31f)
                lineTo(49.6f, 173.72f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -29.41f, 6.49f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 39.6f, 0.0f)
                arcToRelative(28.63f, 28.63f, 0.0f, false, false, -3.14f, -2.71f)
                lineToRelative(29.73f, -55.21f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 26.38f, -3.87f)
                lineToRelative(24.82f, 24.82f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 39.09f, -5.74f)
                lineTo(206.4f, 82.28f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 29.41f, -46.09f)
                close()
                moveTo(54.13f, 214.19f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -28.28f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 54.13f, 214.15f)
                close()
                moveTo(81.85f, 110.19f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 28.29f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 81.85f, 110.14f)
                close()
                moveTo(174.15f, 174.19f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -28.29f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 174.15f, 174.15f)
                close()
                moveTo(230.15f, 70.19f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -28.29f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 230.15f, 70.14f)
                close()
            }
        }
        .build()
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
