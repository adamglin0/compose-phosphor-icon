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

public val LightGroup.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.77f, 50.34f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 29.67f, 65.42f)
                lineToRelative(0.06f, 0.07f)
                lineTo(98.0f, 138.38f)
                lineTo(98.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 21.77f, 11.64f)
                lineToRelative(32.0f, -21.33f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 158.0f, 194.66f)
                lineTo(158.0f, 138.38f)
                lineToRelative(68.33f, -73.0f)
                arcTo(13.82f, 13.82f, 0.0f, false, false, 228.77f, 50.34f)
                close()
                moveTo(217.51f, 57.28f)
                lineTo(147.62f, 131.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 146.0f, 136.0f)
                verticalLineToRelative(58.66f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.89f, 1.67f)
                lineToRelative(-32.0f, 21.33f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 110.0f, 216.0f)
                lineTo(110.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.62f, -4.1f)
                lineTo(38.53f, 57.32f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 54.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.83f, 1.19f)
                arcTo(1.86f, 1.86f, 0.0f, false, true, 217.51f, 57.28f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
