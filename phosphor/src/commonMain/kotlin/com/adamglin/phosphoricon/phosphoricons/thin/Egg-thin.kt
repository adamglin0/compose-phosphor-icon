package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Egg-thin`: ImageVector
    get() {
        if (`_egg-thin` != null) {
            return `_egg-thin`!!
        }
        `_egg-thin` = Builder(name = "Egg-thin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                curveTo(92.87f, 20.0f, 44.0f, 86.52f, 44.0f, 152.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveTo(212.0f, 86.52f, 163.13f, 20.0f, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 228.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, -76.0f)
                curveToRelative(0.0f, -28.46f, 10.0f, -59.73f, 27.33f, -85.78f)
                curveTo(94.81f, 43.0f, 113.91f, 28.0f, 128.0f, 28.0f)
                reflectiveCurveToRelative(33.19f, 15.0f, 48.67f, 38.22f)
                curveTo(194.0f, 92.27f, 204.0f, 123.54f, 204.0f, 152.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 228.0f)
                close()
            }
        }
        .build()
        return `_egg-thin`!!
    }

private var `_egg-thin`: ImageVector? = null
