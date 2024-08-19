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

public val DuotoneGroup.Amazonlogo: ImageVector
    get() {
        if (_amazonlogo != null) {
            return _amazonlogo!!
        }
        _amazonlogo = Builder(name = "Amazonlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 132.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, -44.0f, -44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 168.0f, 132.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(187.31f)
                lineToRelative(-2.21f, 2.22f)
                curveTo(226.69f, 192.9f, 189.44f, 232.0f, 128.0f, 232.0f)
                curveToRelative(-62.84f, 0.0f, -100.38f, -40.91f, -101.95f, -42.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 38.0f, 178.65f)
                curveTo(38.27f, 179.0f, 72.5f, 216.0f, 128.0f, 216.0f)
                reflectiveCurveToRelative(89.73f, -37.0f, 90.07f, -37.36f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, true, 0.27f, -0.3f)
                lineToRelative(2.35f, -2.34f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 168.0f)
                close()
                moveTo(160.0f, 94.53f)
                verticalLineTo(84.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 91.92f, 67.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.25f, -7.28f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 176.0f, 84.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-6.53f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 0.0f, -74.94f)
                close()
                moveTo(160.0f, 132.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 160.0f, 132.0f)
                close()
            }
        }
        .build()
        return _amazonlogo!!
    }

private var _amazonlogo: ImageVector? = null
