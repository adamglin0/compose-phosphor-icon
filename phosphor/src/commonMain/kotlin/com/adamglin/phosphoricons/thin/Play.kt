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

public val ThinGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.32f, 117.9f)
                lineTo(86.24f, 29.79f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, false, -12.17f, -0.23f)
                arcTo(11.71f, 11.71f, 0.0f, false, false, 68.0f, 39.89f)
                lineTo(68.0f, 216.11f)
                arcToRelative(11.71f, 11.71f, 0.0f, false, false, 6.07f, 10.33f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, false, 12.17f, -0.23f)
                lineTo(230.32f, 138.1f)
                arcToRelative(11.82f, 11.82f, 0.0f, false, false, 0.0f, -20.2f)
                close()
                moveTo(226.14f, 131.27f)
                lineTo(82.06f, 219.39f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.07f, 0.07f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, true, -2.0f, -3.35f)
                lineTo(75.99f, 39.89f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, true, 2.0f, -3.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.07f, 0.07f)
                lineToRelative(144.08f, 88.12f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.0f, 6.54f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
