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

public val FillGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.45f, 40.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, -7.52f)
                curveTo(139.8f, 28.08f, 78.82f, 51.0f, 52.82f, 94.0f)
                arcToRelative(87.09f, 87.09f, 0.0f, false, false, -12.76f, 49.0f)
                arcTo(101.72f, 101.72f, 0.0f, false, false, 46.7f, 175.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.61f, 1.43f)
                lineToRelative(85.0f, -86.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(56.74f, 195.94f)
                lineTo(42.55f, 210.13f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -0.6f, 11.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.71f, 0.43f)
                lineToRelative(16.79f, -16.79f)
                curveToRelative(14.14f, 6.84f, 28.41f, 10.57f, 42.56f, 11.07f)
                quadToRelative(1.67f, 0.06f, 3.33f, 0.06f)
                arcTo(86.93f, 86.93f, 0.0f, false, false, 162.0f, 203.18f)
                curveTo(205.0f, 177.18f, 227.93f, 116.21f, 223.45f, 40.07f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
