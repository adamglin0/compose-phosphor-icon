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

public val DuotoneGroup.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) {
            return _footballHelmet!!
        }
        _footballHelmet = Builder(name = "FootballHelmet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.19f, 137.74f)
                lineToRelative(15.62f, 52.52f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 200.0f)
                horizontalLineTo(72.14f)
                arcTo(91.91f, 91.91f, 0.0f, false, true, 32.0f, 124.0f)
                curveToRelative(0.0f, -50.0f, 40.65f, -91.26f, 90.69f, -92.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 216.0f, 124.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.19f, 137.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 164.0f)
                close()
                moveTo(232.0f, 176.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(180.0f, 224.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -15.35f, -11.47f)
                lineTo(153.84f, 176.0f)
                lineTo(131.91f, 176.0f)
                lineToRelative(3.56f, 12.0f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, true, 0.15f, 0.54f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 208.0f)
                lineTo(72.14f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.52f, -1.4f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 24.0f, 124.0f)
                curveToRelative(0.0f, -54.36f, 44.24f, -99.2f, 98.58f, -100.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 224.0f, 124.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(158.71f, 136.0f)
                lineToRelative(7.09f, 24.0f)
                lineTo(216.0f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 176.0f)
                close()
                moveTo(120.0f, 120.0f)
                horizontalLineToRelative(87.91f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 122.8f, 40.0f)
                curveTo(77.16f, 40.64f, 40.0f, 78.31f, 40.0f, 124.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 34.67f, 68.0f)
                lineTo(120.0f, 192.0f)
                lineToRelative(-15.45f, -52.0f)
                arcToRelative(4.77f, 4.77f, 0.0f, false, true, -0.15f, -0.54f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 120.0f)
                close()
                moveTo(149.11f, 160.0f)
                lineTo(142.0f, 136.0f)
                lineTo(120.0f, 136.0f)
                lineToRelative(7.14f, 24.0f)
                close()
                moveTo(216.0f, 176.0f)
                lineTo(170.52f, 176.0f)
                lineTo(180.0f, 208.0f)
                horizontalLineToRelative(36.0f)
                close()
            }
        }
        .build()
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null
