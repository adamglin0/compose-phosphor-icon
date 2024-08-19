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

public val FillGroup.`Map-pin-area-fill`: ImageVector
    get() {
        if (`_map-pin-area-fill` != null) {
            return `_map-pin-area-fill`!!
        }
        `_map-pin-area-fill` = Builder(name = "Map-pin-area-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 175.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.94f, 0.0f)
                curveToRelative(2.45f, -1.41f, 60.0f, -35.0f, 60.0f, -94.95f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 64.0f, 80.0f)
                curveTo(64.0f, 140.0f, 121.58f, 173.54f, 124.0f, 175.0f)
                close()
                moveTo(128.0f, 56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 56.0f)
                close()
                moveTo(240.0f, 184.0f)
                curveToRelative(0.0f, 31.18f, -57.71f, 48.0f, -112.0f, 48.0f)
                reflectiveCurveTo(16.0f, 215.18f, 16.0f, 184.0f)
                curveToRelative(0.0f, -14.59f, 13.22f, -27.51f, 37.23f, -36.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.54f, 15.0f)
                curveTo(42.26f, 168.74f, 32.0f, 176.92f, 32.0f, 184.0f)
                curveToRelative(0.0f, 13.36f, 36.52f, 32.0f, 96.0f, 32.0f)
                reflectiveCurveToRelative(96.0f, -18.64f, 96.0f, -32.0f)
                curveToRelative(0.0f, -7.08f, -10.26f, -15.26f, -26.77f, -21.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.54f, -15.0f)
                curveTo(226.78f, 156.49f, 240.0f, 169.41f, 240.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_map-pin-area-fill`!!
    }

private var `_map-pin-area-fill`: ImageVector? = null
