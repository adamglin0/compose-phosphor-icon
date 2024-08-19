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

public val DuotoneGroup.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = Builder(name = "Images", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 56.0f)
                verticalLineToRelative(82.06f)
                lineToRelative(-23.72f, -23.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 0.0f)
                lineTo(163.31f, 140.0f)
                lineTo(113.66f, 90.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(64.0f, 128.69f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(72.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 56.0f)
                lineTo(56.0f, 72.0f)
                lineTo(40.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 88.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(184.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(200.0f, 184.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(72.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                verticalLineToRelative(62.75f)
                lineToRelative(-10.07f, -10.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineToRelative(-20.0f, 20.0f)
                lineToRelative(-44.0f, -44.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineTo(72.0f, 109.37f)
                close()
                moveTo(184.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 88.0f)
                lineTo(56.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(184.0f, 184.0f)
                close()
                moveTo(216.0f, 168.0f)
                lineTo(72.0f, 168.0f)
                lineTo(72.0f, 132.0f)
                lineToRelative(36.0f, -36.0f)
                lineToRelative(49.66f, 49.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.31f, 0.0f)
                lineTo(194.63f, 120.0f)
                lineTo(216.0f, 141.38f)
                lineTo(216.0f, 168.0f)
                close()
                moveTo(160.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 160.0f, 84.0f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
