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

public val DuotoneGroup.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) {
            return _mapPinSimpleArea!!
        }
        _mapPinSimpleArea = Builder(name = "MapPinSimpleArea", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 103.2f)
                verticalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(103.2f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -16.0f, 0.0f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(240.0f, 176.0f)
                curveToRelative(0.0f, 31.18f, -57.71f, 48.0f, -112.0f, 48.0f)
                reflectiveCurveTo(16.0f, 207.18f, 16.0f, 176.0f)
                curveToRelative(0.0f, -7.74f, 3.81f, -19.13f, 22.0f, -29.41f)
                curveToRelative(12.26f, -6.94f, 29.12f, -12.27f, 48.77f, -15.42f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 89.27f, 147.0f)
                curveToRelative(-17.54f, 2.82f, -33.0f, 7.63f, -43.42f, 13.55f)
                curveTo(37.05f, 165.5f, 32.0f, 171.14f, 32.0f, 176.0f)
                curveToRelative(0.0f, 13.36f, 36.52f, 32.0f, 96.0f, 32.0f)
                reflectiveCurveToRelative(96.0f, -18.64f, 96.0f, -32.0f)
                curveToRelative(0.0f, -4.86f, -5.05f, -10.5f, -13.85f, -15.49f)
                curveToRelative(-10.46f, -5.92f, -25.88f, -10.73f, -43.42f, -13.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 2.54f, -15.79f)
                curveToRelative(19.65f, 3.15f, 36.51f, 8.48f, 48.77f, 15.42f)
                curveTo(236.19f, 156.87f, 240.0f, 168.26f, 240.0f, 176.0f)
                close()
            }
        }
        .build()
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
