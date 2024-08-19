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

public val LightGroup.`Line-segment-light`: ImageVector
    get() {
        if (`_line-segment-light` != null) {
            return `_line-segment-light`!!
        }
        `_line-segment-light` = Builder(name = "Line-segment-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.23f, 42.77f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 167.0f, 80.54f)
                lineTo(80.54f, 167.0f)
                arcToRelative(30.07f, 30.07f, 0.0f, false, false, -37.77f, 3.81f)
                horizontalLineToRelative(0.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 89.0f, 175.46f)
                lineTo(175.46f, 89.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 37.77f, -46.25f)
                close()
                moveTo(76.72f, 204.77f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, -25.46f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 76.72f, 204.74f)
                close()
                moveTo(204.72f, 76.77f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.46f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 25.46f, 0.0f)
                close()
            }
        }
        .build()
        return `_line-segment-light`!!
    }

private var `_line-segment-light`: ImageVector? = null
