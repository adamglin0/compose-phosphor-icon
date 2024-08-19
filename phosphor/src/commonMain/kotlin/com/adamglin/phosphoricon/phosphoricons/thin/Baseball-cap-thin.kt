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

public val ThinGroup.`Baseball-cap-thin`: ImageVector
    get() {
        if (`_baseball-cap-thin` != null) {
            return `_baseball-cap-thin`!!
        }
        `_baseball-cap-thin` = Builder(name = "Baseball-cap-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.12f, 100.12f, 0.0f, false, false, 28.0f, 128.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 31.84f, 16.12f)
                curveTo(72.46f, 191.0f, 94.53f, 180.0f, 128.0f, 180.0f)
                reflectiveCurveToRelative(55.54f, 10.94f, 68.16f, 20.12f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 21.0f, 1.67f)
                arcTo(19.87f, 19.87f, 0.0f, false, false, 228.0f, 184.0f)
                lineTo(228.0f, 128.0f)
                arcTo(100.12f, 100.12f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(220.0f, 128.0f)
                verticalLineToRelative(16.23f)
                arcToRelative(162.31f, 162.31f, 0.0f, false, false, -48.67f, -22.47f)
                arcToRelative(162.56f, 162.56f, 0.0f, false, false, -34.15f, -85.31f)
                arcTo(92.12f, 92.12f, 0.0f, false, true, 220.0f, 128.0f)
                close()
                moveTo(163.1f, 119.74f)
                arcToRelative(166.58f, 166.58f, 0.0f, false, false, -70.2f, 0.0f)
                curveTo(97.64f, 76.93f, 120.0f, 47.31f, 128.0f, 38.0f)
                curveTo(136.0f, 47.32f, 158.36f, 76.93f, 163.1f, 119.75f)
                close()
                moveTo(118.82f, 36.46f)
                arcToRelative(162.56f, 162.56f, 0.0f, false, false, -34.15f, 85.31f)
                arcTo(162.31f, 162.31f, 0.0f, false, false, 36.0f, 144.24f)
                lineTo(36.0f, 128.0f)
                arcTo(92.12f, 92.12f, 0.0f, false, true, 118.82f, 36.46f)
                close()
                moveTo(213.48f, 194.67f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, true, -12.61f, -1.0f)
                curveTo(187.29f, 183.78f, 163.62f, 172.0f, 128.0f, 172.0f)
                reflectiveCurveToRelative(-59.29f, 11.77f, -72.87f, 21.65f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, true, -12.61f, 1.0f)
                arcTo(11.75f, 11.75f, 0.0f, false, true, 36.0f, 184.0f)
                lineTo(36.0f, 154.0f)
                arcToRelative(156.0f, 156.0f, 0.0f, false, true, 184.0f, 0.0f)
                verticalLineToRelative(30.0f)
                arcTo(11.75f, 11.75f, 0.0f, false, true, 213.48f, 194.67f)
                close()
            }
        }
        .build()
        return `_baseball-cap-thin`!!
    }

private var `_baseball-cap-thin`: ImageVector? = null
