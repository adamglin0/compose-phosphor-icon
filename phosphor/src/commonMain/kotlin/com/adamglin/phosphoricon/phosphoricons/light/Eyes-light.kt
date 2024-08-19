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

public val LightGroup.`Eyes-light`: ImageVector
    get() {
        if (`_eyes-light` != null) {
            return `_eyes-light`!!
        }
        `_eyes-light` = Builder(name = "Eyes-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 34.0f)
                curveToRelative(-21.15f, 0.0f, -39.1f, 20.15f, -48.0f, 50.26f)
                curveTo(119.1f, 54.15f, 101.15f, 34.0f, 80.0f, 34.0f)
                curveToRelative(-30.28f, 0.0f, -54.0f, 41.29f, -54.0f, 94.0f)
                reflectiveCurveToRelative(23.72f, 94.0f, 54.0f, 94.0f)
                curveToRelative(21.15f, 0.0f, 39.1f, -20.15f, 48.0f, -50.26f)
                curveToRelative(8.9f, 30.11f, 26.85f, 50.26f, 48.0f, 50.26f)
                curveToRelative(30.28f, 0.0f, 54.0f, -41.29f, 54.0f, -94.0f)
                reflectiveCurveTo(206.28f, 34.0f, 176.0f, 34.0f)
                close()
                moveTo(80.0f, 210.0f)
                curveToRelative(-18.24f, 0.0f, -34.19f, -24.1f, -39.83f, -56.53f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 0.0f, -50.94f)
                curveTo(45.81f, 70.1f, 61.76f, 46.0f, 80.0f, 46.0f)
                curveToRelative(22.77f, 0.0f, 42.0f, 37.55f, 42.0f, 82.0f)
                reflectiveCurveTo(102.77f, 210.0f, 80.0f, 210.0f)
                close()
                moveTo(38.0f, 128.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 38.0f, 128.0f)
                close()
                moveTo(176.0f, 210.0f)
                curveToRelative(-18.24f, 0.0f, -34.19f, -24.1f, -39.83f, -56.53f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 0.0f, -50.94f)
                curveTo(141.81f, 70.1f, 157.76f, 46.0f, 176.0f, 46.0f)
                curveToRelative(22.77f, 0.0f, 42.0f, 37.55f, 42.0f, 82.0f)
                reflectiveCurveTo(198.77f, 210.0f, 176.0f, 210.0f)
                close()
                moveTo(134.0f, 128.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 134.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_eyes-light`!!
    }

private var `_eyes-light`: ImageVector? = null
