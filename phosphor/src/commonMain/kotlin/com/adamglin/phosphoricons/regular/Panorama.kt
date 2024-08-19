package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(name = "Panorama", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.75f, 51.32f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, -13.86f, -2.77f)
                lineToRelative(-3.48f, 0.94f)
                curveTo(205.61f, 54.56f, 170.61f, 64.0f, 128.0f, 64.0f)
                reflectiveCurveTo(50.39f, 54.56f, 31.59f, 49.49f)
                lineToRelative(-3.48f, -0.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                arcToRelative(16.22f, 16.22f, 0.0f, false, false, 4.18f, -0.55f)
                lineToRelative(3.18f, -0.86f)
                curveTo(50.13f, 201.49f, 85.17f, 192.0f, 128.0f, 192.0f)
                reflectiveCurveToRelative(77.87f, 9.49f, 96.69f, 14.59f)
                lineToRelative(3.18f, 0.86f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 248.0f, 192.0f)
                verticalLineTo(64.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 241.75f, 51.32f)
                close()
                moveTo(27.42f, 64.93f)
                curveTo(46.94f, 70.2f, 83.27f, 80.0f, 128.0f, 80.0f)
                reflectiveCurveToRelative(81.06f, -9.8f, 100.58f, -15.07f)
                lineTo(232.0f, 64.0f)
                verticalLineTo(182.76f)
                lineToRelative(-58.07f, -58.07f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineToRelative(-20.0f, 20.0f)
                lineToRelative(-44.0f, -44.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineTo(24.0f, 141.37f)
                verticalLineTo(64.0f)
                close()
                moveTo(213.84f, 187.21f)
                arcToRelative(391.22f, 391.22f, 0.0f, false, false, -49.0f, -9.0f)
                lineTo(142.63f, 156.0f)
                lineToRelative(20.0f, -20.0f)
                close()
                moveTo(27.13f, 191.14f)
                lineTo(24.0f, 192.0f)
                verticalLineTo(164.0f)
                lineToRelative(52.0f, -52.0f)
                lineToRelative(64.25f, 64.25f)
                quadToRelative(-6.0f, -0.24f, -12.25f, -0.25f)
                curveTo(83.0f, 176.0f, 45.28f, 186.23f, 27.13f, 191.14f)
                close()
                moveTo(192.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 108.0f)
                close()
            }
        }
        .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
