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

public val RegularGroup.`Map-pin-area`: ImageVector
    get() {
        if (`_map-pin-area` != null) {
            return `_map-pin-area`!!
        }
        `_map-pin-area` = Builder(name = "Map-pin-area", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 80.0f)
                close()
                moveTo(64.0f, 80.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f)
                curveToRelative(0.0f, 59.95f, -57.58f, 93.54f, -60.0f, 94.95f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.94f, 0.0f)
                curveTo(121.58f, 173.54f, 64.0f, 140.0f, 64.0f, 80.0f)
                close()
                moveTo(80.0f, 80.0f)
                curveToRelative(0.0f, 42.2f, 35.84f, 70.21f, 48.0f, 78.5f)
                curveToRelative(12.15f, -8.28f, 48.0f, -36.3f, 48.0f, -78.5f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f)
                close()
                moveTo(202.77f, 147.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.54f, 15.0f)
                curveTo(213.74f, 168.74f, 224.0f, 176.92f, 224.0f, 184.0f)
                curveToRelative(0.0f, 13.36f, -36.52f, 32.0f, -96.0f, 32.0f)
                reflectiveCurveToRelative(-96.0f, -18.64f, -96.0f, -32.0f)
                curveToRelative(0.0f, -7.08f, 10.26f, -15.26f, 26.77f, -21.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.54f, -15.0f)
                curveTo(29.22f, 156.49f, 16.0f, 169.41f, 16.0f, 184.0f)
                curveToRelative(0.0f, 31.18f, 57.71f, 48.0f, 112.0f, 48.0f)
                reflectiveCurveToRelative(112.0f, -16.82f, 112.0f, -48.0f)
                curveTo(240.0f, 169.41f, 226.78f, 156.49f, 202.77f, 147.63f)
                close()
            }
        }
        .build()
        return `_map-pin-area`!!
    }

private var `_map-pin-area`: ImageVector? = null
