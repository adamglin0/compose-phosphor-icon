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

public val LightGroup.`Eye-light`: ImageVector
    get() {
        if (`_eye-light` != null) {
            return `_eye-light`!!
        }
        `_eye-light` = Builder(name = "Eye-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.48f, 125.57f)
                curveToRelative(-0.34f, -0.78f, -8.66f, -19.23f, -27.24f, -37.81f)
                curveTo(201.0f, 70.54f, 171.38f, 50.0f, 128.0f, 50.0f)
                reflectiveCurveTo(55.0f, 70.54f, 37.76f, 87.76f)
                curveToRelative(-18.58f, 18.58f, -26.9f, 37.0f, -27.24f, 37.81f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 4.88f)
                curveToRelative(0.34f, 0.77f, 8.66f, 19.22f, 27.24f, 37.8f)
                curveTo(55.0f, 185.47f, 84.62f, 206.0f, 128.0f, 206.0f)
                reflectiveCurveToRelative(73.0f, -20.53f, 90.24f, -37.75f)
                curveToRelative(18.58f, -18.58f, 26.9f, -37.0f, 27.24f, -37.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 245.48f, 125.57f)
                close()
                moveTo(128.0f, 194.0f)
                curveToRelative(-31.38f, 0.0f, -58.78f, -11.42f, -81.45f, -33.93f)
                arcTo(134.77f, 134.77f, 0.0f, false, true, 22.69f, 128.0f)
                arcTo(134.56f, 134.56f, 0.0f, false, true, 46.55f, 95.94f)
                curveTo(69.22f, 73.42f, 96.62f, 62.0f, 128.0f, 62.0f)
                reflectiveCurveToRelative(58.78f, 11.42f, 81.45f, 33.94f)
                arcTo(134.56f, 134.56f, 0.0f, false, true, 233.31f, 128.0f)
                curveTo(226.94f, 140.21f, 195.0f, 194.0f, 128.0f, 194.0f)
                close()
                moveTo(128.0f, 82.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f)
                arcTo(46.06f, 46.06f, 0.0f, false, false, 128.0f, 82.0f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 128.0f, 162.0f)
                close()
            }
        }
        .build()
        return `_eye-light`!!
    }

private var `_eye-light`: ImageVector? = null
