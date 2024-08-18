package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Goggles: ImageVector
    get() {
        if (_goggles != null) {
            return _goggles!!
        }
        _goggles = Builder(name = "Goggles", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 136.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, false, -72.0f, -72.0f)
                lineTo(72.0f, 64.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, false, 0.0f, 136.0f)
                arcToRelative(24.06f, 24.06f, 0.0f, false, false, 17.0f, 23.0f)
                curveToRelative(6.06f, 20.37f, 37.63f, 33.0f, 55.0f, 33.0f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, false, 39.2f, -32.0f)
                horizontalLineToRelative(33.6f)
                arcTo(40.07f, 40.07f, 0.0f, false, false, 184.0f, 192.0f)
                curveToRelative(17.33f, 0.0f, 48.9f, -12.66f, 55.0f, -33.0f)
                arcTo(24.06f, 24.06f, 0.0f, false, false, 256.0f, 136.0f)
                close()
                moveTo(45.45f, 167.74f)
                curveTo(37.0f, 162.76f, 32.0f, 156.88f, 32.0f, 152.0f)
                reflectiveCurveToRelative(4.91f, -10.61f, 13.13f, -15.55f)
                lineToRelative(37.21f, 37.2f)
                arcTo(23.74f, 23.74f, 0.0f, false, true, 72.0f, 176.0f)
                curveTo(64.47f, 176.0f, 53.8f, 172.68f, 45.45f, 167.74f)
                close()
                moveTo(93.65f, 162.34f)
                lineTo(61.0f, 129.7f)
                arcTo(42.66f, 42.66f, 0.0f, false, true, 72.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                arcTo(23.74f, 23.74f, 0.0f, false, true, 93.65f, 162.34f)
                close()
                moveTo(160.0f, 152.0f)
                arcToRelative(23.88f, 23.88f, 0.0f, false, true, 5.46f, -15.22f)
                lineTo(201.0f, 172.32f)
                curveToRelative(-6.0f, 2.3f, -12.15f, 3.68f, -17.0f, 3.68f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 160.0f, 152.0f)
                close()
                moveTo(215.63f, 164.31f)
                lineTo(179.71f, 128.39f)
                arcTo(24.19f, 24.19f, 0.0f, false, true, 184.0f, 128.0f)
                curveToRelative(7.53f, 0.0f, 18.2f, 3.32f, 26.55f, 8.26f)
                reflectiveCurveTo(224.0f, 147.12f, 224.0f, 152.0f)
                curveTo(224.0f, 155.79f, 221.0f, 160.2f, 215.63f, 164.31f)
                close()
                moveTo(237.68f, 141.62f)
                curveTo(229.34f, 123.25f, 200.34f, 112.0f, 184.0f, 112.0f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, false, -39.2f, 32.0f)
                lineTo(111.2f, 144.0f)
                arcTo(40.07f, 40.07f, 0.0f, false, false, 72.0f, 112.0f)
                curveToRelative(-16.34f, 0.0f, -45.34f, 11.25f, -53.68f, 29.62f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 136.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 72.0f, 80.0f)
                lineTo(184.0f, 80.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, 56.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 237.68f, 141.62f)
                close()
            }
        }
        .build()
        return _goggles!!
    }

private var _goggles: ImageVector? = null
