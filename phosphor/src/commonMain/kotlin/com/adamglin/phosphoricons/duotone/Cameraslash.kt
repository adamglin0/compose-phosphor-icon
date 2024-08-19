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

public val DuotoneGroup.Cameraslash: ImageVector
    get() {
        if (_cameraslash != null) {
            return _cameraslash!!
        }
        _cameraslash = Builder(name = "Cameraslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 64.0f)
                horizontalLineTo(176.0f)
                lineTo(160.0f, 40.0f)
                horizontalLineTo(96.0f)
                lineTo(80.0f, 64.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 80.0f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 64.0f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(51.73f, 56.0f)
                lineTo(48.0f, 56.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 24.0f, 80.0f)
                lineTo(24.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(197.19f, 216.0f)
                lineToRelative(4.89f, 5.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(105.58f, 115.23f)
                lineTo(142.58f, 155.92f)
                arcTo(27.71f, 27.71f, 0.0f, false, true, 128.0f, 160.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -22.42f, -44.77f)
                close()
                moveTo(48.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(40.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(66.28f, 72.0f)
                lineToRelative(28.41f, 31.26f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 176.0f)
                arcToRelative(44.21f, 44.21f, 0.0f, false, false, 25.44f, -8.12f)
                lineTo(182.64f, 200.0f)
                close()
                moveTo(232.0f, 80.0f)
                lineTo(232.0f, 186.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(176.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.65f, -3.56f)
                lineTo(155.71f, 48.0f)
                lineTo(100.24f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.91f, -9.42f)
                lineToRelative(2.0f, -3.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.66f, 3.56f)
                lineTo(180.28f, 56.0f)
                lineTo(208.0f, 56.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 232.0f, 80.0f)
                close()
            }
        }
        .build()
        return _cameraslash!!
    }

private var _cameraslash: ImageVector? = null
