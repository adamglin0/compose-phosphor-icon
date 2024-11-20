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

public val DuotoneGroup.Island: ImageVector
    get() {
        if (_island != null) {
            return _island!!
        }
        _island = Builder(name = "Island", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 140.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 32.0f, 140.0f)
                close()
                moveTo(128.0f, 192.0f)
                curveToRelative(-64.0f, 0.0f, -104.0f, 32.0f, -104.0f, 32.0f)
                lineTo(232.0f, 224.0f)
                reflectiveCurveTo(192.0f, 192.0f, 128.0f, 192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.25f, 229.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 227.0f, 230.25f)
                curveToRelative(-0.37f, -0.3f, -38.82f, -30.25f, -99.0f, -30.25f)
                reflectiveCurveTo(29.36f, 230.0f, 29.0f, 230.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.0f, -12.51f)
                curveToRelative(1.63f, -1.3f, 38.52f, -30.26f, 98.29f, -33.45f)
                arcTo(119.94f, 119.94f, 0.0f, false, true, 114.0f, 146.37f)
                curveToRelative(1.74f, -21.71f, 10.92f, -50.63f, 43.0f, -72.48f)
                arcToRelative(66.19f, 66.19f, 0.0f, false, false, -15.0f, -1.87f)
                lineToRelative(-1.67f, 0.0f)
                curveToRelative(-19.0f, 0.62f, -30.94f, 11.71f, -36.5f, 33.92f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 112.0f)
                arcToRelative(7.64f, 7.64f, 0.0f, false, true, -1.94f, -0.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.82f, -9.7f)
                curveToRelative(9.25f, -36.95f, 33.11f, -45.42f, 51.5f, -46.0f)
                arcToRelative(81.48f, 81.48f, 0.0f, false, true, 21.68f, 2.45f)
                curveToRelative(-3.83f, -6.33f, -9.43f, -12.93f, -17.21f, -16.25f)
                curveToRelative(-10.0f, -4.24f, -22.17f, -2.39f, -36.31f, 5.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, -14.0f)
                curveToRelative(18.74f, -10.45f, 35.72f, -12.54f, 50.48f, -6.2f)
                curveToRelative(12.49f, 5.36f, 20.73f, 15.78f, 25.87f, 25.0f)
                curveToRelative(6.18f, -9.64f, 13.88f, -16.17f, 22.39f, -18.94f)
                curveToRelative(11.86f, -3.87f, 24.64f, -0.72f, 38.0f, 9.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.64f, 12.76f)
                curveToRelative(-8.91f, -6.73f, -16.77f, -9.06f, -23.35f, -6.93f)
                curveToRelative(-7.29f, 2.35f, -12.87f, 10.0f, -16.37f, 16.61f)
                arcTo(70.46f, 70.46f, 0.0f, false, true, 208.0f, 73.07f)
                curveToRelative(14.61f, 8.35f, 32.0f, 26.05f, 32.0f, 62.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                curveToRelative(0.0f, -23.46f, -8.07f, -40.0f, -24.0f, -49.0f)
                arcToRelative(50.49f, 50.49f, 0.0f, false, false, -5.75f, -2.8f)
                arcToRelative(55.64f, 55.64f, 0.0f, false, true, 5.06f, 33.06f)
                arcToRelative(59.41f, 59.41f, 0.0f, false, true, -8.86f, 23.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.09f, -9.2f)
                curveToRelative(0.74f, -1.09f, 16.33f, -24.38f, -3.26f, -49.37f)
                curveToRelative(-27.0f, 15.21f, -41.89f, 37.25f, -44.16f, 65.59f)
                arcToRelative(104.27f, 104.27f, 0.0f, false, false, 3.83f, 36.44f)
                curveToRelative(62.65f, 1.81f, 101.52f, 32.33f, 103.2f, 33.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 238.25f, 229.0f)
                close()
                moveTo(24.0f, 140.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 24.0f, 140.0f)
                close()
                moveTo(40.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 140.0f)
                close()
            }
        }
        .build()
        return _island!!
    }

private var _island: ImageVector? = null
