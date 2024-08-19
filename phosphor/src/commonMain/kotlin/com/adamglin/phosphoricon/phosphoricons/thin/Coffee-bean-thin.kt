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

public val ThinGroup.`Coffee-bean-thin`: ImageVector
    get() {
        if (`_coffee-bean-thin` != null) {
            return `_coffee-bean-thin`!!
        }
        `_coffee-bean-thin` = Builder(name = "Coffee-bean-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.0f, 47.0f)
                curveToRelative(-32.36f, -32.35f, -95.0f, -22.33f, -139.7f, 22.34f)
                reflectiveCurveTo(14.63f, 176.66f, 47.0f, 209.0f)
                curveToRelative(12.82f, 12.81f, 30.38f, 19.0f, 49.71f, 19.0f)
                curveToRelative(29.46f, 0.0f, 63.0f, -14.34f, 90.0f, -41.32f)
                curveTo(231.35f, 142.0f, 241.37f, 79.34f, 209.0f, 47.0f)
                close()
                moveTo(75.0f, 75.0f)
                curveToRelative(25.47f, -25.46f, 57.0f, -39.09f, 84.26f, -39.09f)
                curveToRelative(14.51f, 0.0f, 27.83f, 3.87f, 38.43f, 11.84f)
                curveToRelative(-25.76f, 7.05f, -63.0f, 26.4f, -73.6f, 79.49f)
                curveToRelative(-10.5f, 52.52f, -49.25f, 69.26f, -72.91f, 74.58f)
                curveTo(23.77f, 172.12f, 34.16f, 115.81f, 75.0f, 75.0f)
                close()
                moveTo(181.0f, 181.0f)
                curveToRelative(-39.0f, 39.0f, -92.17f, 50.23f, -122.71f, 27.25f)
                curveToRelative(25.75f, -7.0f, 63.0f, -26.39f, 73.62f, -79.48f)
                curveToRelative(10.5f, -52.53f, 49.25f, -69.26f, 72.91f, -74.59f)
                curveTo(232.23f, 83.88f, 221.84f, 140.19f, 181.0f, 181.0f)
                close()
            }
        }
        .build()
        return `_coffee-bean-thin`!!
    }

private var `_coffee-bean-thin`: ImageVector? = null
