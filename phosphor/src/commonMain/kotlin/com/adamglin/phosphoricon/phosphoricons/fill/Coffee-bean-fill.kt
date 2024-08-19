package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Coffee-bean-fill`: ImageVector
    get() {
        if (`_coffee-bean-fill` != null) {
            return `_coffee-bean-fill`!!
        }
        `_coffee-bean-fill` = Builder(name = "Coffee-bean-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.22f, 190.47f)
                arcToRelative(108.88f, 108.88f, 0.0f, false, true, -33.84f, 9.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.89f, -2.0f)
                curveToRelative(-8.67f, -15.28f, -11.52f, -34.29f, -8.0f, -55.15f)
                curveToRelative(4.49f, -26.92f, 19.09f, -53.87f, 41.12f, -75.9f)
                reflectiveCurveToRelative(49.0f, -36.63f, 75.9f, -41.12f)
                curveToRelative(22.79f, -3.79f, 43.37f, 0.0f, 59.29f, 10.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.25f, 7.23f)
                arcToRelative(121.0f, 121.0f, 0.0f, false, false, -21.82f, 7.46f)
                curveToRelative(-21.77f, 9.9f, -49.6f, 31.06f, -58.52f, 75.7f)
                curveTo(114.1f, 156.73f, 97.63f, 178.27f, 71.22f, 190.47f)
                close()
                moveTo(222.51f, 58.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.88f, -2.0f)
                arcToRelative(108.5f, 108.5f, 0.0f, false, false, -33.85f, 9.16f)
                curveToRelative(-26.41f, 12.2f, -42.88f, 33.74f, -48.94f, 64.0f)
                curveToRelative(-8.93f, 44.64f, -36.75f, 65.8f, -58.52f, 75.7f)
                arcToRelative(121.0f, 121.0f, 0.0f, false, true, -21.82f, 7.46f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 54.27f, 220.0f)
                curveToRelative(11.87f, 7.92f, 26.32f, 12.0f, 42.35f, 12.0f)
                arcToRelative(103.66f, 103.66f, 0.0f, false, false, 16.92f, -1.44f)
                curveToRelative(26.91f, -4.49f, 53.87f, -19.09f, 75.9f, -41.12f)
                reflectiveCurveToRelative(36.63f, -49.0f, 41.12f, -75.9f)
                curveTo(234.0f, 92.68f, 231.18f, 73.66f, 222.51f, 58.38f)
                close()
            }
        }
        .build()
        return `_coffee-bean-fill`!!
    }

private var `_coffee-bean-fill`: ImageVector? = null
