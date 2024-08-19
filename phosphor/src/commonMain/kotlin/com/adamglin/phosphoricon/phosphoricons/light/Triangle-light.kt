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

public val LightGroup.`Triangle-light`: ImageVector
    get() {
        if (`_triangle-light` != null) {
            return `_triangle-light`!!
        }
        `_triangle-light` = Builder(name = "Triangle-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.07f, 189.09f)
                lineTo(147.61f, 37.22f)
                arcToRelative(22.75f, 22.75f, 0.0f, false, false, -39.22f, 0.0f)
                lineTo(20.93f, 189.09f)
                arcToRelative(21.53f, 21.53f, 0.0f, false, false, 0.0f, 21.72f)
                arcTo(22.35f, 22.35f, 0.0f, false, false, 40.55f, 222.0f)
                horizontalLineToRelative(174.9f)
                arcToRelative(22.35f, 22.35f, 0.0f, false, false, 19.6f, -11.19f)
                arcTo(21.53f, 21.53f, 0.0f, false, false, 235.07f, 189.09f)
                close()
                moveTo(224.66f, 204.8f)
                arcToRelative(10.46f, 10.46f, 0.0f, false, true, -9.21f, 5.2f)
                horizontalLineTo(40.55f)
                arcToRelative(10.46f, 10.46f, 0.0f, false, true, -9.21f, -5.2f)
                arcToRelative(9.49f, 9.49f, 0.0f, false, true, 0.0f, -9.72f)
                lineTo(118.79f, 43.21f)
                arcToRelative(10.75f, 10.75f, 0.0f, false, true, 18.42f, 0.0f)
                lineToRelative(87.46f, 151.87f)
                arcTo(9.49f, 9.49f, 0.0f, false, true, 224.66f, 204.8f)
                close()
            }
        }
        .build()
        return `_triangle-light`!!
    }

private var `_triangle-light`: ImageVector? = null
