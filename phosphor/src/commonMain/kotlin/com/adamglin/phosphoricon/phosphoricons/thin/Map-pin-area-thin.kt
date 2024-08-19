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

public val ThinGroup.`Map-pin-area-thin`: ImageVector
    get() {
        if (`_map-pin-area-thin` != null) {
            return `_map-pin-area-thin`!!
        }
        `_map-pin-area-thin` = Builder(name = "Map-pin-area-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 80.0f)
                close()
                moveTo(97.08f, 147.73f)
                curveTo(78.05f, 127.35f, 68.0f, 103.93f, 68.0f, 80.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 120.0f, 0.0f)
                curveToRelative(0.0f, 23.93f, -10.05f, 47.35f, -29.08f, 67.73f)
                arcTo(136.54f, 136.54f, 0.0f, false, true, 130.0f, 171.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcTo(136.54f, 136.54f, 0.0f, false, true, 97.08f, 147.73f)
                close()
                moveTo(76.0f, 80.0f)
                curveToRelative(0.0f, 47.09f, 42.25f, 77.0f, 52.0f, 83.3f)
                curveToRelative(9.75f, -6.28f, 52.0f, -36.21f, 52.0f, -83.3f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 76.0f, 80.0f)
                close()
                moveTo(201.38f, 151.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.76f, 7.51f)
                curveToRelative(18.67f, 6.89f, 29.38f, 16.0f, 29.38f, 25.11f)
                curveToRelative(0.0f, 17.39f, -40.18f, 36.0f, -100.0f, 36.0f)
                reflectiveCurveTo(28.0f, 201.39f, 28.0f, 184.0f)
                curveToRelative(0.0f, -9.07f, 10.71f, -18.22f, 29.38f, -25.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.76f, -7.51f)
                curveTo(32.29f, 159.62f, 20.0f, 171.21f, 20.0f, 184.0f)
                curveToRelative(0.0f, 12.46f, 11.73f, 23.83f, 33.0f, 32.0f)
                curveToRelative(20.09f, 7.73f, 46.72f, 12.0f, 75.0f, 12.0f)
                reflectiveCurveToRelative(54.89f, -4.25f, 75.0f, -12.0f)
                curveToRelative(21.29f, -8.19f, 33.0f, -19.56f, 33.0f, -32.0f)
                curveTo(236.0f, 171.21f, 223.71f, 159.62f, 201.38f, 151.38f)
                close()
            }
        }
        .build()
        return `_map-pin-area-thin`!!
    }

private var `_map-pin-area-thin`: ImageVector? = null
