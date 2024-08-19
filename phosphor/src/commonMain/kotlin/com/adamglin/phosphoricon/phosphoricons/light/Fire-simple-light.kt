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

public val LightGroup.`Fire-simple-light`: ImageVector
    get() {
        if (`_fire-simple-light` != null) {
            return `_fire-simple-light`!!
        }
        `_fire-simple-light` = Builder(name = "Fire-simple-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.1f, 19.38f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.47f, 2.56f)
                lineTo(109.54f, 85.25f)
                lineTo(83.2f, 59.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.0f, 0.67f)
                curveTo(52.85f, 88.39f, 42.0f, 116.53f, 42.0f, 144.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 85.4f, 163.72f, 37.33f, 142.1f, 19.38f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, -74.0f)
                curveToRelative(0.0f, -23.0f, 8.67f, -46.87f, 25.77f, -70.91f)
                lineToRelative(28.05f, 27.22f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.82f, -2.25f)
                lineTo(140.93f, 34.2f)
                curveTo(163.35f, 54.16f, 202.0f, 95.6f, 202.0f, 144.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return `_fire-simple-light`!!
    }

private var `_fire-simple-light`: ImageVector? = null
