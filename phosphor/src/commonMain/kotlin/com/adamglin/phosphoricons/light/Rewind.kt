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

public val LightGroup.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.81f, 59.72f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.22f, 0.46f)
                lineTo(126.0f, 112.79f)
                lineTo(126.0f, 71.84f)
                arcToRelative(13.83f, 13.83f, 0.0f, false, false, -7.19f, -12.12f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.22f, 0.46f)
                lineTo(16.41f, 116.35f)
                arcToRelative(13.79f, 13.79f, 0.0f, false, false, 0.0f, 23.3f)
                lineToRelative(88.18f, 56.17f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.22f, 0.46f)
                arcTo(13.83f, 13.83f, 0.0f, false, false, 126.0f, 184.16f)
                lineTo(126.0f, 143.21f)
                lineToRelative(82.59f, 52.61f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.22f, 0.46f)
                arcTo(13.83f, 13.83f, 0.0f, false, false, 230.0f, 184.16f)
                lineTo(230.0f, 71.84f)
                arcTo(13.83f, 13.83f, 0.0f, false, false, 222.81f, 59.72f)
                close()
                moveTo(114.0f, 184.16f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, -1.0f, 1.59f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.0f, -0.06f)
                lineTo(22.85f, 129.53f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.0f, -3.06f)
                lineTo(111.0f, 70.31f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, 1.0f, -0.32f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 0.26f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, 1.0f, 1.59f)
                close()
                moveTo(218.0f, 184.16f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, -1.0f, 1.59f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.0f, -0.06f)
                lineToRelative(-88.19f, -56.16f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.0f, -3.06f)
                lineTo(215.0f, 70.31f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, 1.0f, -0.32f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 0.26f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, 1.0f, 1.59f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
