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

public val ThinGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.45f, 40.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.76f, -3.76f)
                curveTo(141.06f, 32.16f, 81.46f, 54.39f, 56.24f, 96.0f)
                curveTo(39.0f, 124.56f, 39.9f, 158.37f, 58.8f, 191.54f)
                lineTo(37.17f, 213.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(21.63f, -21.64f)
                curveToRelative(17.39f, 9.91f, 35.0f, 14.89f, 51.83f, 14.89f)
                arcTo(83.43f, 83.43f, 0.0f, false, false, 160.0f, 199.76f)
                curveTo(201.61f, 174.54f, 223.84f, 114.93f, 219.45f, 40.31f)
                close()
                moveTo(155.82f, 192.92f)
                curveToRelative(-25.37f, 15.37f, -55.56f, 14.75f, -85.48f, -1.61f)
                lineToRelative(92.5f, -92.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                lineToRelative(-92.49f, 92.5f)
                curveToRelative(-16.36f, -29.92f, -17.0f, -60.11f, -1.61f, -85.48f)
                curveTo(86.34f, 61.77f, 141.72f, 41.0f, 211.66f, 44.34f)
                curveTo(215.0f, 114.28f, 194.23f, 169.66f, 155.82f, 192.92f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
