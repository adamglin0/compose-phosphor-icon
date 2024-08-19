package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Chart-donut-light`: ImageVector
    get() {
        if (`_chart-donut-light` != null) {
            return `_chart-donut-light`!!
        }
        `_chart-donut-light` = Builder(name = "Chart-donut-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, -29.45f, 17.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.2f, -8.2f)
                lineToRelative(-48.5f, -28.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 39.65f, 77.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 128.0f, 26.0f)
                close()
                moveTo(47.21f, 88.29f)
                lineToRelative(38.29f, 22.1f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 82.0f, 128.0f)
                arcToRelative(47.64f, 47.64f, 0.0f, false, false, 0.4f, 6.0f)
                lineTo(39.7f, 145.45f)
                arcToRelative(90.27f, 90.27f, 0.0f, false, true, 7.51f, -57.16f)
                close()
                moveTo(42.81f, 157.0f)
                lineToRelative(42.7f, -11.44f)
                arcToRelative(46.12f, 46.12f, 0.0f, false, false, 36.49f, 28.0f)
                verticalLineToRelative(44.2f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 42.81f, 157.0f)
                close()
                moveTo(134.0f, 217.8f)
                verticalLineTo(173.6f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, -91.21f)
                verticalLineTo(38.2f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, 0.0f, 179.6f)
                close()
            }
        }
        .build()
        return `_chart-donut-light`!!
    }

private var `_chart-donut-light`: ImageVector? = null
