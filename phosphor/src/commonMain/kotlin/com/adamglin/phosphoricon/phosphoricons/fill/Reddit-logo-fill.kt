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

public val FillGroup.`Reddit-logo-fill`: ImageVector
    get() {
        if (`_reddit-logo-fill` != null) {
            return `_reddit-logo-fill`!!
        }
        `_reddit-logo-fill` = Builder(name = "Reddit-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 104.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -52.94f, -24.19f)
                curveToRelative(-16.75f, -8.9f, -36.76f, -14.28f, -57.66f, -15.53f)
                lineToRelative(5.19f, -31.17f)
                lineToRelative(17.72f, 2.72f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 2.87f, -15.74f)
                lineToRelative(-26.0f, -4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.11f, 6.59f)
                lineTo(121.2f, 64.16f)
                curveToRelative(-21.84f, 0.94f, -42.82f, 6.38f, -60.26f, 15.65f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -42.59f, 47.74f)
                arcTo(59.0f, 59.0f, 0.0f, false, false, 16.0f, 144.0f)
                curveToRelative(0.0f, 21.93f, 12.0f, 42.35f, 33.91f, 57.49f)
                curveTo(70.88f, 216.0f, 98.61f, 224.0f, 128.0f, 224.0f)
                reflectiveCurveToRelative(57.12f, -8.0f, 78.09f, -22.51f)
                curveTo(228.0f, 186.35f, 240.0f, 165.93f, 240.0f, 144.0f)
                arcToRelative(59.0f, 59.0f, 0.0f, false, false, -2.35f, -16.45f)
                arcTo(32.16f, 32.16f, 0.0f, false, false, 248.0f, 104.0f)
                close()
                moveTo(72.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 128.0f)
                close()
                moveTo(163.75f, 183.07f)
                arcToRelative(76.18f, 76.18f, 0.0f, false, true, -71.5f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.5f, -14.14f)
                arcToRelative(60.18f, 60.18f, 0.0f, false, false, 56.5f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.5f, 14.14f)
                close()
                moveTo(168.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 168.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_reddit-logo-fill`!!
    }

private var `_reddit-logo-fill`: ImageVector? = null
