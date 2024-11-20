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

public val FillGroup.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) {
            return _lineSegment!!
        }
        _lineSegment = Builder(name = "LineSegment", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.81f, 83.79f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -33.12f, 4.83f)
                lineTo(88.62f, 178.69f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -44.43f, -6.48f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 33.12f, -4.83f)
                lineToRelative(90.07f, -90.07f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 44.43f, 6.48f)
                close()
            }
        }
        .build()
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
