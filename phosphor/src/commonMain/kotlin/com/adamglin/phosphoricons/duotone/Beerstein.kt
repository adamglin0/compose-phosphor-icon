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

public val DuotoneGroup.Beerstein: ImageVector
    get() {
        if (_beerstein != null) {
            return _beerstein!!
        }
        _beerstein = Builder(name = "Beerstein", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 72.0f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 104.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(88.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(144.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 96.0f)
                close()
                moveTo(240.0f, 112.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(200.0f, 200.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(56.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(40.0f, 72.0f)
                curveToRelative(0.0f, -30.88f, 28.71f, -56.0f, 64.0f, -56.0f)
                curveToRelative(16.77f, 0.0f, 32.91f, 5.8f, 44.82f, 16.0f)
                lineTo(160.0f, 32.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(200.0f, 88.0f)
                horizontalLineToRelative(16.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 240.0f, 112.0f)
                close()
                moveTo(57.0f, 64.0f)
                lineTo(182.62f, 64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 160.0f, 48.0f)
                lineTo(145.74f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.53f, -2.22f)
                curveTo(131.06f, 37.0f, 117.87f, 32.0f, 104.0f, 32.0f)
                curveTo(80.82f, 32.0f, 61.43f, 45.76f, 57.0f, 64.0f)
                close()
                moveTo(184.0f, 208.0f)
                lineTo(184.0f, 192.17f)
                curveToRelative(0.0f, -0.06f, 0.0f, -0.11f, 0.0f, -0.17f)
                reflectiveCurveToRelative(0.0f, -0.11f, 0.0f, -0.17f)
                lineTo(184.0f, 80.0f)
                lineTo(56.0f, 80.0f)
                lineTo(56.0f, 208.0f)
                lineTo(184.0f, 208.0f)
                close()
                moveTo(224.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(200.0f, 104.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _beerstein!!
    }

private var _beerstein: ImageVector? = null
