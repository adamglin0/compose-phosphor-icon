package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.45f, 40.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, -7.52f)
                curveTo(139.8f, 28.08f, 78.82f, 51.0f, 52.82f, 94.0f)
                arcToRelative(87.09f, 87.09f, 0.0f, false, false, -12.76f, 49.0f)
                curveToRelative(0.57f, 15.92f, 5.21f, 32.0f, 13.79f, 47.85f)
                lineToRelative(-19.51f, 19.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(19.5f, -19.51f)
                curveTo(81.0f, 210.73f, 97.09f, 215.37f, 113.0f, 215.94f)
                quadToRelative(1.67f, 0.06f, 3.33f, 0.06f)
                arcTo(86.93f, 86.93f, 0.0f, false, false, 162.0f, 203.18f)
                curveTo(205.0f, 177.18f, 227.93f, 116.21f, 223.45f, 40.07f)
                close()
                moveTo(153.75f, 189.5f)
                curveToRelative(-22.75f, 13.78f, -49.68f, 14.0f, -76.71f, 0.77f)
                lineToRelative(88.63f, -88.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(65.73f, 179.0f)
                curveToRelative(-13.19f, -27.0f, -13.0f, -54.0f, 0.77f, -76.71f)
                curveToRelative(22.09f, -36.47f, 74.6f, -56.44f, 141.31f, -54.06f)
                curveTo(210.2f, 114.89f, 190.22f, 167.41f, 153.75f, 189.5f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
