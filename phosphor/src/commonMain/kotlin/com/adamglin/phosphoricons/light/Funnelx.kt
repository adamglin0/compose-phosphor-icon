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

public val LightGroup.Funnelx: ImageVector
    get() {
        if (_funnelx != null) {
            return _funnelx!!
        }
        _funnelx = Builder(name = "Funnelx", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.79f, 50.34f)
                arcTo(13.83f, 13.83f, 0.0f, false, false, 216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 29.67f, 65.42f)
                lineToRelative(0.06f, 0.06f)
                lineTo(98.0f, 138.38f)
                lineTo(98.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 21.76f, 11.64f)
                lineToRelative(32.0f, -21.33f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 158.0f, 194.66f)
                lineTo(158.0f, 138.38f)
                lineToRelative(68.34f, -73.0f)
                arcTo(13.83f, 13.83f, 0.0f, false, false, 228.79f, 50.34f)
                close()
                moveTo(217.53f, 57.28f)
                lineTo(147.63f, 131.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 146.0f, 136.0f)
                verticalLineToRelative(58.66f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.89f, 1.67f)
                lineToRelative(-32.0f, 21.33f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 110.0f, 216.0f)
                lineTo(110.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.62f, -4.1f)
                lineTo(38.53f, 57.32f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, true, -0.33f, -2.13f)
                arcTo(1.91f, 1.91f, 0.0f, false, true, 40.0f, 54.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.82f, 1.19f)
                arcTo(1.87f, 1.87f, 0.0f, false, true, 217.53f, 57.28f)
                close()
                moveTo(244.24f, 211.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(216.0f, 200.49f)
                lineToRelative(-19.75f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, -8.48f)
                lineTo(207.52f, 192.0f)
                lineToRelative(-19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.49f, -8.49f)
                lineTo(216.0f, 183.52f)
                lineToRelative(19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.49f)
                lineTo(224.49f, 192.0f)
                close()
            }
        }
        .build()
        return _funnelx!!
    }

private var _funnelx: ImageVector? = null
