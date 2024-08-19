package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Map-pin-simple-area-bold`: ImageVector
    get() {
        if (`_map-pin-simple-area-bold` != null) {
            return `_map-pin-simple-area-bold`!!
        }
        `_map-pin-simple-area-bold` = Builder(name = "Map-pin-simple-area-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 106.32f)
                verticalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(106.32f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -24.0f, 0.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(244.0f, 176.0f)
                curveToRelative(0.0f, 21.59f, -23.9f, 34.0f, -38.15f, 39.48f)
                curveTo(184.86f, 223.56f, 157.22f, 228.0f, 128.0f, 228.0f)
                curveToRelative(-57.64f, 0.0f, -116.0f, -17.86f, -116.0f, -52.0f)
                curveToRelative(0.0f, -22.23f, 26.12f, -40.2f, 69.88f, -48.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 4.24f, 23.62f)
                curveTo(51.93f, 157.71f, 36.0f, 169.78f, 36.0f, 176.0f)
                curveToRelative(0.0f, 4.0f, 7.12f, 11.07f, 22.77f, 17.08f)
                curveToRelative(18.3f, 7.0f, 42.89f, 10.92f, 69.23f, 10.92f)
                reflectiveCurveToRelative(50.93f, -3.88f, 69.23f, -10.92f)
                curveTo(212.87f, 187.07f, 220.0f, 180.0f, 220.0f, 176.0f)
                curveToRelative(0.0f, -6.22f, -15.93f, -18.29f, -50.12f, -24.44f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 4.24f, -23.62f)
                curveTo(217.88f, 135.8f, 244.0f, 153.77f, 244.0f, 176.0f)
                close()
            }
        }
        .build()
        return `_map-pin-simple-area-bold`!!
    }

private var `_map-pin-simple-area-bold`: ImageVector? = null
