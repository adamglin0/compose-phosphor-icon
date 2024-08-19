package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Coffee-bean`: ImageVector
    get() {
        if (`_coffee-bean` != null) {
            return `_coffee-bean`!!
        }
        `_coffee-bean` = Builder(name = "Coffee-bean", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.75f, 44.25f)
                curveTo(195.0f, 27.47f, 170.37f, 20.79f, 142.46f, 25.44f)
                curveToRelative(-26.91f, 4.49f, -53.87f, 19.09f, -75.9f, 41.12f)
                reflectiveCurveToRelative(-36.63f, 49.0f, -41.12f, 75.9f)
                curveToRelative(-4.65f, 27.91f, 2.0f, 52.51f, 18.81f, 69.29f)
                curveTo(57.54f, 225.05f, 75.75f, 232.0f, 96.62f, 232.0f)
                arcToRelative(103.66f, 103.66f, 0.0f, false, false, 16.92f, -1.44f)
                curveToRelative(26.91f, -4.49f, 53.87f, -19.09f, 75.9f, -41.12f)
                reflectiveCurveToRelative(36.63f, -49.0f, 41.12f, -75.9f)
                curveTo(235.21f, 85.63f, 228.53f, 61.0f, 211.75f, 44.25f)
                close()
                moveTo(77.87f, 77.87f)
                curveTo(102.56f, 53.19f, 133.0f, 39.93f, 159.15f, 39.93f)
                arcToRelative(62.26f, 62.26f, 0.0f, false, true, 29.0f, 6.67f)
                arcTo(108.48f, 108.48f, 0.0f, false, false, 157.1f, 63.54f)
                curveToRelative(-19.2f, 15.16f, -31.63f, 36.32f, -36.94f, 62.89f)
                curveToRelative(-9.72f, 48.58f, -44.7f, 65.18f, -67.48f, 70.84f)
                curveTo(28.71f, 168.76f, 39.4f, 116.35f, 77.87f, 77.87f)
                close()
                moveTo(178.13f, 178.13f)
                curveToRelative(-34.69f, 34.68f, -80.71f, 46.78f, -110.32f, 31.27f)
                arcTo(108.72f, 108.72f, 0.0f, false, false, 98.9f, 192.46f)
                curveToRelative(19.2f, -15.16f, 31.63f, -36.32f, 36.94f, -62.89f)
                curveToRelative(9.72f, -48.58f, 44.7f, -65.18f, 67.48f, -70.84f)
                curveTo(227.29f, 87.24f, 216.6f, 139.65f, 178.13f, 178.13f)
                close()
            }
        }
        .build()
        return `_coffee-bean`!!
    }

private var `_coffee-bean`: ImageVector? = null
