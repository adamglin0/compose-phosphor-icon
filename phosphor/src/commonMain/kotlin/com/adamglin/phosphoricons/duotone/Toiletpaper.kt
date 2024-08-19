package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Toiletpaper: ImageVector
    get() {
        if (_toiletpaper != null) {
            return _toiletpaper!!
        }
        _toiletpaper = Builder(name = "Toiletpaper", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(104.0f, 120.0f)
                curveToRelative(0.0f, 44.18f, -17.91f, 80.0f, -40.0f, 80.0f)
                reflectiveCurveToRelative(-40.0f, -35.82f, -40.0f, -80.0f)
                reflectiveCurveTo(41.91f, 40.0f, 64.0f, 40.0f)
                reflectiveCurveTo(104.0f, 75.82f, 104.0f, 120.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 76.0f, 120.0f)
                close()
                moveTo(240.0f, 120.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(112.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(96.0f, 186.35f)
                curveTo(87.37f, 200.37f, 76.18f, 208.0f, 64.0f, 208.0f)
                curveToRelative(-13.87f, 0.0f, -26.46f, -9.89f, -35.44f, -27.85f)
                curveTo(20.46f, 164.0f, 16.0f, 142.59f, 16.0f, 120.0f)
                reflectiveCurveToRelative(4.46f, -43.95f, 12.56f, -60.15f)
                curveTo(37.54f, 41.89f, 50.13f, 32.0f, 64.0f, 32.0f)
                lineTo(192.0f, 32.0f)
                curveToRelative(13.87f, 0.0f, 26.46f, 9.89f, 35.44f, 27.85f)
                curveTo(235.54f, 76.05f, 240.0f, 97.41f, 240.0f, 120.0f)
                close()
                moveTo(96.0f, 120.0f)
                curveToRelative(0.0f, -42.43f, -16.86f, -72.0f, -32.0f, -72.0f)
                reflectiveCurveTo(32.0f, 77.57f, 32.0f, 120.0f)
                reflectiveCurveToRelative(16.86f, 72.0f, 32.0f, 72.0f)
                reflectiveCurveTo(96.0f, 162.43f, 96.0f, 120.0f)
                close()
                moveTo(224.0f, 208.0f)
                lineTo(224.0f, 128.0f)
                lineTo(208.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(15.79f)
                curveTo(221.84f, 73.9f, 206.16f, 48.0f, 192.0f, 48.0f)
                lineTo(92.12f, 48.0f)
                arcToRelative(73.6f, 73.6f, 0.0f, false, true, 7.32f, 11.85f)
                curveToRelative(7.14f, 14.28f, 11.44f, 32.56f, 12.37f, 52.15f)
                lineTo(128.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(112.0f, 128.0f)
                verticalLineToRelative(80.0f)
                close()
                moveTo(176.0f, 112.0f)
                lineTo(160.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _toiletpaper!!
    }

private var _toiletpaper: ImageVector? = null
