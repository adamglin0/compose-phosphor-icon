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

public val DuotoneGroup.Clover: ImageVector
    get() {
        if (_clover != null) {
            return _clover!!
        }
        _clover = Builder(name = "Clover", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 120.0f)
                reflectiveCurveToRelative(-90.0f, -96.0f, 0.0f, -96.0f)
                reflectiveCurveTo(128.0f, 120.0f, 128.0f, 120.0f)
                close()
                moveTo(32.0f, 120.0f)
                curveToRelative(0.0f, 90.0f, 96.0f, 0.0f, 96.0f, 0.0f)
                reflectiveCurveTo(32.0f, 30.0f, 32.0f, 120.0f)
                close()
                moveTo(128.0f, 216.0f)
                curveToRelative(90.0f, 0.0f, 0.0f, -96.0f, 0.0f, -96.0f)
                reflectiveCurveTo(38.0f, 216.0f, 128.0f, 216.0f)
                close()
                moveTo(128.0f, 120.0f)
                reflectiveCurveToRelative(96.0f, 90.0f, 96.0f, 0.0f)
                reflectiveCurveTo(128.0f, 120.0f, 128.0f, 120.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.66f, 165.54f)
                curveTo(225.16f, 159.7f, 232.0f, 144.37f, 232.0f, 120.0f)
                reflectiveCurveToRelative(-6.84f, -39.7f, -20.34f, -45.55f)
                curveToRelative(-11.65f, -5.0f, -27.24f, -2.23f, -46.46f, 8.35f)
                curveToRelative(10.58f, -19.22f, 13.39f, -34.81f, 8.35f, -46.46f)
                curveTo(167.7f, 22.84f, 152.37f, 16.0f, 128.0f, 16.0f)
                reflectiveCurveTo(88.3f, 22.84f, 82.45f, 36.34f)
                curveTo(77.41f, 48.0f, 80.22f, 63.58f, 90.8f, 82.8f)
                curveTo(71.58f, 72.22f, 56.0f, 69.4f, 44.34f, 74.45f)
                curveTo(30.84f, 80.3f, 24.0f, 95.63f, 24.0f, 120.0f)
                reflectiveCurveToRelative(6.84f, 39.7f, 20.34f, 45.54f)
                arcTo(31.0f, 31.0f, 0.0f, false, false, 56.8f, 168.0f)
                curveToRelative(9.6f, 0.0f, 21.0f, -3.62f, 34.0f, -10.79f)
                curveTo(80.22f, 176.41f, 77.41f, 192.0f, 82.45f, 203.65f)
                curveTo(88.3f, 217.15f, 103.63f, 224.0f, 128.0f, 224.0f)
                reflectiveCurveToRelative(39.7f, -6.85f, 45.55f, -20.35f)
                arcToRelative(32.24f, 32.24f, 0.0f, false, false, 2.34f, -15.0f)
                curveToRelative(10.45f, 16.23f, 19.64f, 34.48f, 24.35f, 53.33f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 248.0f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, false, 1.95f, -0.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.82f, -9.7f)
                curveToRelative(-6.94f, -27.76f, -22.27f, -53.8f, -37.86f, -74.79f)
                quadTo(189.68f, 168.0f, 199.2f, 168.0f)
                arcTo(31.0f, 31.0f, 0.0f, false, false, 211.66f, 165.54f)
                close()
                moveTo(205.29f, 89.14f)
                curveTo(214.14f, 93.0f, 216.0f, 108.0f, 216.0f, 120.0f)
                reflectiveCurveToRelative(-1.86f, 27.0f, -10.7f, 30.86f)
                curveToRelative(-8.36f, 3.63f, -23.52f, -1.31f, -42.68f, -13.91f)
                arcToRelative(243.4f, 243.4f, 0.0f, false, true, -22.54f, -17.0f)
                curveTo(158.49f, 104.37f, 190.4f, 82.68f, 205.29f, 89.14f)
                close()
                moveTo(97.14f, 42.7f)
                curveTo(101.0f, 33.86f, 116.0f, 32.0f, 128.0f, 32.0f)
                reflectiveCurveToRelative(27.0f, 1.86f, 30.86f, 10.7f)
                curveToRelative(3.63f, 8.36f, -1.31f, 23.52f, -13.91f, 42.68f)
                arcToRelative(243.4f, 243.4f, 0.0f, false, true, -17.0f, 22.54f)
                curveTo(112.37f, 89.51f, 90.69f, 57.59f, 97.14f, 42.7f)
                close()
                moveTo(50.71f, 150.86f)
                curveTo(41.86f, 147.0f, 40.0f, 132.0f, 40.0f, 120.0f)
                reflectiveCurveToRelative(1.86f, -27.0f, 10.7f, -30.86f)
                arcTo(15.64f, 15.64f, 0.0f, false, true, 57.0f, 88.0f)
                curveToRelative(8.75f, 0.0f, 21.34f, 5.17f, 36.4f, 15.07f)
                arcToRelative(243.4f, 243.4f, 0.0f, false, true, 22.54f, 17.0f)
                curveTo(97.51f, 135.62f, 65.59f, 157.32f, 50.71f, 150.86f)
                close()
                moveTo(158.86f, 197.29f)
                curveTo(155.0f, 206.14f, 140.0f, 208.0f, 128.0f, 208.0f)
                reflectiveCurveToRelative(-27.0f, -1.86f, -30.86f, -10.7f)
                curveToRelative(-3.63f, -8.36f, 1.31f, -23.52f, 13.91f, -42.68f)
                arcToRelative(243.4f, 243.4f, 0.0f, false, true, 17.0f, -22.54f)
                curveTo(143.63f, 150.49f, 165.31f, 182.41f, 158.86f, 197.29f)
                close()
            }
        }
        .build()
        return _clover!!
    }

private var _clover: ImageVector? = null
