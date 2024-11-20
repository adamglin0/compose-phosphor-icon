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

public val LightGroup.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) {
            return _lessThanOrEqual!!
        }
        _lessThanOrEqual = Builder(name = "LessThanOrEqual", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.93f, -5.63f)
                lineToRelative(152.0f, -56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 4.15f, 11.26f)
                lineTo(65.36f, 104.0f)
                lineToRelative(136.71f, 50.37f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 200.0f, 166.0f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, true, -2.08f, -0.37f)
                lineToRelative(-152.0f, -56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 42.0f, 104.0f)
                close()
                moveTo(200.0f, 194.0f)
                lineTo(48.0f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(200.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
