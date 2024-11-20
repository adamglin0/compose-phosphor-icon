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

public val DuotoneGroup.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) {
            return _pinterestLogo!!
        }
        _pinterestLogo = Builder(name = "PinterestLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 112.0f)
                curveToRelative(0.0f, 44.18f, -32.0f, 72.0f, -64.0f, 72.0f)
                reflectiveCurveToRelative(-41.63f, -21.07f, -41.63f, -21.07f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 88.0f)
                lineToRelative(13.14f, -55.83f)
                horizontalLineToRelative(0.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 216.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 112.0f)
                curveToRelative(0.0f, 22.57f, -7.9f, 43.2f, -22.23f, 58.11f)
                curveTo(188.39f, 184.0f, 170.25f, 192.0f, 152.0f, 192.0f)
                curveToRelative(-17.88f, 0.0f, -29.82f, -5.86f, -37.43f, -12.0f)
                lineToRelative(-10.78f, 45.82f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 232.0f)
                arcToRelative(8.24f, 8.24f, 0.0f, false, true, -1.84f, -0.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.0f, -9.62f)
                lineToRelative(32.0f, -136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.58f, 3.66f)
                lineToRelative(-16.9f, 71.8f)
                curveTo(122.0f, 166.0f, 131.3f, 176.0f, 152.0f, 176.0f)
                curveToRelative(27.53f, 0.0f, 56.0f, -23.94f, 56.0f, -64.0f)
                arcTo(72.0f, 72.0f, 0.0f, true, false, 73.63f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.85f, 8.0f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 224.0f, 112.0f)
                close()
            }
        }
        .build()
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
