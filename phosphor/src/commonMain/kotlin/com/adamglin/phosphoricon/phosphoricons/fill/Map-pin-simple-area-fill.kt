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

public val FillGroup.`Map-pin-simple-area-fill`: ImageVector
    get() {
        if (`_map-pin-simple-area-fill` != null) {
            return `_map-pin-simple-area-fill`!!
        }
        `_map-pin-simple-area-fill` = Builder(name = "Map-pin-simple-area-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 64.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 48.0f, 39.19f)
                lineTo(136.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 103.19f)
                arcTo(40.05f, 40.05f, 0.0f, false, true, 88.0f, 64.0f)
                close()
                moveTo(218.0f, 146.59f)
                curveToRelative(-12.26f, -6.94f, -29.12f, -12.27f, -48.77f, -15.42f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 166.73f, 147.0f)
                curveToRelative(17.54f, 2.82f, 33.0f, 7.63f, 43.42f, 13.55f)
                curveTo(219.0f, 165.5f, 224.0f, 171.14f, 224.0f, 176.0f)
                curveToRelative(0.0f, 13.36f, -36.52f, 32.0f, -96.0f, 32.0f)
                reflectiveCurveToRelative(-96.0f, -18.64f, -96.0f, -32.0f)
                curveToRelative(0.0f, -4.86f, 5.0f, -10.5f, 13.85f, -15.49f)
                curveToRelative(10.46f, -5.92f, 25.88f, -10.73f, 43.42f, -13.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -2.54f, -15.79f)
                curveToRelative(-19.65f, 3.15f, -36.51f, 8.48f, -48.77f, 15.42f)
                curveTo(19.81f, 156.87f, 16.0f, 168.26f, 16.0f, 176.0f)
                curveToRelative(0.0f, 31.18f, 57.71f, 48.0f, 112.0f, 48.0f)
                reflectiveCurveToRelative(112.0f, -16.82f, 112.0f, -48.0f)
                curveTo(240.0f, 168.26f, 236.19f, 156.87f, 218.0f, 146.59f)
                close()
            }
        }
        .build()
        return `_map-pin-simple-area-fill`!!
    }

private var `_map-pin-simple-area-fill`: ImageVector? = null
