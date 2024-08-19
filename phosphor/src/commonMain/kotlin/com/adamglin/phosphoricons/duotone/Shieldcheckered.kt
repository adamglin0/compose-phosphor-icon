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

public val DuotoneGroup.Shieldcheckered: ImageVector
    get() {
        if (_shieldcheckered != null) {
            return _shieldcheckered!!
        }
        _shieldcheckered = Builder(name = "Shieldcheckered", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 48.0f)
                verticalLineToRelative(80.0f)
                lineTo(40.87f, 128.0f)
                arcTo(146.29f, 146.29f, 0.0f, false, true, 40.0f, 112.0f)
                lineTo(40.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                close()
                moveTo(128.0f, 128.0f)
                lineTo(128.0f, 232.0f)
                reflectiveCurveToRelative(78.06f, -21.3f, 87.13f, -104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 52.72f, 25.52f, 84.67f, 46.93f, 102.19f)
                curveToRelative(23.06f, 18.86f, 46.0f, 25.27f, 47.0f, 25.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 0.0f)
                curveToRelative(1.0f, -0.26f, 23.91f, -6.67f, 47.0f, -25.53f)
                curveTo(198.48f, 196.67f, 224.0f, 164.72f, 224.0f, 112.0f)
                lineTo(224.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(120.0f, 220.55f)
                arcToRelative(130.85f, 130.85f, 0.0f, false, true, -30.93f, -18.74f)
                curveToRelative(-21.15f, -17.3f, -34.2f, -39.37f, -39.0f, -65.81f)
                lineTo(120.0f, 136.0f)
                close()
                moveTo(120.0f, 120.0f)
                lineTo(48.23f, 120.0f)
                curveToRelative(-0.15f, -2.63f, -0.23f, -5.29f, -0.23f, -8.0f)
                lineToRelative(0.0f, -56.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(167.4f, 201.42f)
                arcTo(131.31f, 131.31f, 0.0f, false, true, 136.0f, 220.53f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(69.91f)
                curveTo(201.16f, 162.24f, 188.27f, 184.18f, 167.4f, 201.42f)
                close()
                moveTo(208.0f, 112.0f)
                curveToRelative(0.0f, 2.71f, -0.08f, 5.37f, -0.23f, 8.0f)
                lineTo(136.0f, 120.0f)
                lineTo(136.0f, 56.0f)
                horizontalLineToRelative(72.0f)
                close()
            }
        }
        .build()
        return _shieldcheckered!!
    }

private var _shieldcheckered: ImageVector? = null
