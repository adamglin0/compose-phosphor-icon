package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Binary: ImageVector
    get() {
        if (_binary != null) {
            return _binary!!
        }
        _binary = Builder(name = "Binary", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(121.75f, 41.21f)
                curveTo(115.22f, 31.26f, 105.62f, 26.0f, 94.0f, 26.0f)
                reflectiveCurveTo(72.78f, 31.26f, 66.25f, 41.21f)
                curveTo(60.93f, 49.31f, 58.0f, 60.25f, 58.0f, 72.0f)
                reflectiveCurveToRelative(2.93f, 22.69f, 8.25f, 30.79f)
                curveTo(72.78f, 112.74f, 82.38f, 118.0f, 94.0f, 118.0f)
                reflectiveCurveToRelative(21.22f, -5.26f, 27.75f, -15.21f)
                curveToRelative(5.32f, -8.1f, 8.25f, -19.0f, 8.25f, -30.79f)
                reflectiveCurveTo(127.07f, 49.31f, 121.75f, 41.21f)
                close()
                moveTo(94.0f, 106.0f)
                curveToRelative(-19.0f, 0.0f, -24.0f, -21.37f, -24.0f, -34.0f)
                reflectiveCurveToRelative(5.0f, -34.0f, 24.0f, -34.0f)
                reflectiveCurveToRelative(24.0f, 21.37f, 24.0f, 34.0f)
                reflectiveCurveTo(113.0f, 106.0f, 94.0f, 106.0f)
                close()
                moveTo(193.75f, 153.21f)
                curveTo(187.22f, 143.26f, 177.62f, 138.0f, 166.0f, 138.0f)
                reflectiveCurveToRelative(-21.22f, 5.26f, -27.75f, 15.21f)
                curveToRelative(-5.32f, 8.1f, -8.25f, 19.0f, -8.25f, 30.79f)
                reflectiveCurveToRelative(2.93f, 22.69f, 8.25f, 30.79f)
                curveToRelative(6.53f, 10.0f, 16.13f, 15.21f, 27.75f, 15.21f)
                reflectiveCurveToRelative(21.22f, -5.26f, 27.75f, -15.21f)
                curveToRelative(5.32f, -8.1f, 8.25f, -19.0f, 8.25f, -30.79f)
                reflectiveCurveTo(199.07f, 161.31f, 193.75f, 153.21f)
                close()
                moveTo(166.0f, 218.0f)
                curveToRelative(-18.95f, 0.0f, -24.0f, -21.37f, -24.0f, -34.0f)
                reflectiveCurveToRelative(5.05f, -34.0f, 24.0f, -34.0f)
                reflectiveCurveToRelative(24.0f, 21.37f, 24.0f, 34.0f)
                reflectiveCurveTo(185.0f, 218.0f, 166.0f, 218.0f)
                close()
                moveTo(146.75f, 48.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.34f, -8.16f)
                lineToRelative(24.0f, -13.34f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 182.0f, 32.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(170.0f, 42.2f)
                lineToRelative(-15.09f, 8.38f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 146.75f, 48.25f)
                close()
                moveTo(102.0f, 144.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(90.0f, 154.2f)
                lineToRelative(-15.09f, 8.38f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -5.82f, -10.49f)
                lineToRelative(24.0f, -13.34f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 102.0f, 144.0f)
                close()
            }
        }
        .build()
        return _binary!!
    }

private var _binary: ImageVector? = null
