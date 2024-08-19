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

public val LightGroup.`Map-pin-simple-area-light`: ImageVector
    get() {
        if (`_map-pin-simple-area-light` != null) {
            return `_map-pin-simple-area-light`!!
        }
        `_map-pin-simple-area-light` = Builder(name = "Map-pin-simple-area-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.0f, 101.52f)
                verticalLineTo(176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(101.52f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -12.0f, 0.0f)
                close()
                moveTo(128.0f, 38.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(238.0f, 176.0f)
                curveToRelative(0.0f, 13.34f, -12.18f, 25.38f, -34.31f, 33.88f)
                curveTo(183.38f, 217.7f, 156.5f, 222.0f, 128.0f, 222.0f)
                reflectiveCurveToRelative(-55.38f, -4.3f, -75.69f, -12.12f)
                curveTo(30.18f, 201.38f, 18.0f, 189.34f, 18.0f, 176.0f)
                curveToRelative(0.0f, -19.6f, 26.46f, -36.0f, 69.05f, -42.86f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 89.0f, 145.0f)
                curveToRelative(-18.0f, 2.89f, -33.27f, 7.66f, -44.09f, 13.78f)
                curveTo(35.28f, 164.2f, 30.0f, 170.32f, 30.0f, 176.0f)
                curveToRelative(0.0f, 16.08f, 40.25f, 34.0f, 98.0f, 34.0f)
                reflectiveCurveToRelative(98.0f, -17.92f, 98.0f, -34.0f)
                curveToRelative(0.0f, -5.68f, -5.28f, -11.8f, -14.86f, -17.23f)
                curveToRelative(-10.82f, -6.12f, -26.07f, -10.89f, -44.09f, -13.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.9f, -11.85f)
                curveTo(211.54f, 140.0f, 238.0f, 156.4f, 238.0f, 176.0f)
                close()
            }
        }
        .build()
        return `_map-pin-simple-area-light`!!
    }

private var `_map-pin-simple-area-light`: ImageVector? = null
