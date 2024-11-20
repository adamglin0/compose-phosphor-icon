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

public val DuotoneGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 144.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 130.06f, 224.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 168.0f, 184.0f)
                curveToRelative(0.0f, -40.0f, -40.0f, -64.0f, -40.0f, -64.0f)
                reflectiveCurveToRelative(-40.0f, 24.0f, -40.0f, 64.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 125.94f, 224.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 48.0f, 144.0f)
                curveToRelative(0.0f, -72.0f, 80.0f, -120.0f, 80.0f, -120.0f)
                reflectiveCurveTo(208.0f, 72.0f, 208.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.79f, 51.48f)
                arcToRelative(221.25f, 221.25f, 0.0f, false, false, -41.67f, -34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.24f, 0.0f)
                arcTo(221.25f, 221.25f, 0.0f, false, false, 82.21f, 51.48f)
                curveTo(54.59f, 80.48f, 40.0f, 112.47f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 112.47f, 201.41f, 80.48f, 173.79f, 51.48f)
                close()
                moveTo(96.0f, 184.0f)
                curveToRelative(0.0f, -27.67f, 22.53f, -47.28f, 32.0f, -54.3f)
                curveToRelative(9.48f, 7.0f, 32.0f, 26.63f, 32.0f, 54.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f)
                close()
                moveTo(173.27f, 199.93f)
                arcTo(47.8f, 47.8f, 0.0f, false, false, 176.0f, 184.0f)
                curveToRelative(0.0f, -44.0f, -42.09f, -69.79f, -43.88f, -70.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.24f, 0.0f)
                curveTo(122.09f, 114.21f, 80.0f, 140.0f, 80.0f, 184.0f)
                arcToRelative(47.8f, 47.8f, 0.0f, false, false, 2.73f, 15.93f)
                arcTo(71.88f, 71.88f, 0.0f, false, true, 56.0f, 144.0f)
                curveToRelative(0.0f, -34.41f, 20.4f, -63.15f, 37.52f, -81.19f)
                arcTo(216.21f, 216.21f, 0.0f, false, true, 128.0f, 33.54f)
                arcToRelative(215.77f, 215.77f, 0.0f, false, true, 34.48f, 29.27f)
                curveTo(193.49f, 95.5f, 200.0f, 125.0f, 200.0f, 144.0f)
                arcTo(71.88f, 71.88f, 0.0f, false, true, 173.27f, 199.93f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
