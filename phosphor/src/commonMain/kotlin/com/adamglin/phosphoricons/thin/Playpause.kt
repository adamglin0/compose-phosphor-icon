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

public val ThinGroup.Playpause: ImageVector
    get() {
        if (_playpause != null) {
            return _playpause!!
        }
        _playpause = Builder(name = "Playpause", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 64.0f)
                lineTo(180.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(172.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(224.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(220.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(228.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 60.0f)
                close()
                moveTo(140.0f, 128.0f)
                arcToRelative(11.76f, 11.76f, 0.0f, false, true, -5.48f, 10.0f)
                lineTo(46.33f, 194.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.18f, 0.39f)
                arcTo(11.66f, 11.66f, 0.0f, false, true, 28.0f, 184.15f)
                lineTo(28.0f, 71.85f)
                arcToRelative(11.66f, 11.66f, 0.0f, false, true, 6.15f, -10.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.18f, 0.39f)
                lineTo(134.52f, 118.0f)
                arcTo(11.76f, 11.76f, 0.0f, false, true, 140.0f, 128.0f)
                close()
                moveTo(132.0f, 128.0f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, false, -1.78f, -3.22f)
                lineTo(42.0f, 68.63f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 39.91f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.91f, 0.5f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, false, -2.0f, 3.35f)
                verticalLineToRelative(112.3f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, false, 2.0f, 3.35f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, 4.0f, -0.13f)
                lineToRelative(88.18f, -56.15f)
                arcTo(3.77f, 3.77f, 0.0f, false, false, 132.0f, 128.0f)
                close()
            }
        }
        .build()
        return _playpause!!
    }

private var _playpause: ImageVector? = null
