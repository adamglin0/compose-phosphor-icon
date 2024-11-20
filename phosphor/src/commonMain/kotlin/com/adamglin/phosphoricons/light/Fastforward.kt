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

public val LightGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.59f, 116.35f)
                lineTo(159.41f, 60.18f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.22f, -0.46f)
                arcTo(13.83f, 13.83f, 0.0f, false, false, 138.0f, 71.84f)
                verticalLineToRelative(41.0f)
                lineTo(55.41f, 60.18f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.22f, -0.46f)
                arcTo(13.83f, 13.83f, 0.0f, false, false, 34.0f, 71.84f)
                lineTo(34.0f, 184.16f)
                arcToRelative(13.83f, 13.83f, 0.0f, false, false, 7.19f, 12.12f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.22f, -0.46f)
                lineTo(138.0f, 143.21f)
                verticalLineToRelative(40.95f)
                arcToRelative(13.83f, 13.83f, 0.0f, false, false, 7.19f, 12.12f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.22f, -0.46f)
                lineToRelative(88.18f, -56.17f)
                arcToRelative(13.79f, 13.79f, 0.0f, false, false, 0.0f, -23.3f)
                close()
                moveTo(137.15f, 129.53f)
                lineTo(49.0f, 185.69f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.0f, 0.06f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, -1.0f, -1.59f)
                lineTo(46.0f, 71.84f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, 1.0f, -1.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, -0.26f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, 1.0f, 0.32f)
                lineToRelative(88.19f, 56.16f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.0f, 3.06f)
                close()
                moveTo(241.15f, 129.53f)
                lineTo(153.0f, 185.69f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.0f, 0.06f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, -1.0f, -1.59f)
                lineTo(150.0f, 71.84f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, 1.0f, -1.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, -0.26f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, 1.0f, 0.32f)
                lineToRelative(88.19f, 56.16f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.0f, 3.06f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
