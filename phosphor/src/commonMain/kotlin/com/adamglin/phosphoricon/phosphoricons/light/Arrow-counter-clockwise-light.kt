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

public val LightGroup.`Arrow-counter-clockwise-light`: ImageVector
    get() {
        if (`_arrow-counter-clockwise-light` != null) {
            return `_arrow-counter-clockwise-light`!!
        }
        `_arrow-counter-clockwise-light` = Builder(name = "Arrow-counter-clockwise-light",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 128.0f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, true, -92.74f, 94.0f)
                horizontalLineTo(128.0f)
                arcToRelative(93.43f, 93.43f, 0.0f, false, true, -64.5f, -25.65f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.24f, -8.72f)
                arcTo(82.0f, 82.0f, 0.0f, true, false, 70.0f, 70.0f)
                lineToRelative(-0.19f, 0.19f)
                lineTo(39.44f, 98.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                verticalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineTo(90.34f)
                lineTo(61.63f, 61.4f)
                arcTo(94.0f, 94.0f, 0.0f, false, true, 222.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_arrow-counter-clockwise-light`!!
    }

private var `_arrow-counter-clockwise-light`: ImageVector? = null
