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

public val DuotoneGroup.Folders: ImageVector
    get() {
        if (_folders != null) {
            return _folders!!
        }
        _folders = Builder(name = "Folders", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 80.0f)
                verticalLineToRelative(88.89f)
                arcToRelative(7.11f, 7.11f, 0.0f, false, true, -7.11f, 7.11f)
                horizontalLineTo(200.0f)
                verticalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(120.0f)
                lineTo(90.13f, 81.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.8f, -1.6f)
                horizontalLineTo(64.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(45.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.8f, 1.6f)
                lineTo(152.0f, 72.0f)
                horizontalLineToRelative(72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                lineTo(154.67f, 64.0f)
                lineTo(126.93f, 43.2f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, -9.6f, -3.2f)
                lineTo(72.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 56.0f)
                lineTo(56.0f, 72.0f)
                lineTo(40.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 88.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(192.89f, 216.0f)
                arcTo(15.13f, 15.13f, 0.0f, false, false, 208.0f, 200.89f)
                lineTo(208.0f, 184.0f)
                horizontalLineToRelative(16.89f)
                arcTo(15.13f, 15.13f, 0.0f, false, false, 240.0f, 168.89f)
                lineTo(240.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 64.0f)
                close()
                moveTo(192.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 88.0f)
                lineTo(85.33f, 88.0f)
                lineToRelative(29.87f, 22.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 112.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(224.0f, 168.0f)
                lineTo(208.0f, 168.0f)
                lineTo(208.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(122.67f, 96.0f)
                lineTo(94.93f, 75.2f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, -9.6f, -3.2f)
                lineTo(72.0f, 72.0f)
                lineTo(72.0f, 56.0f)
                horizontalLineToRelative(45.33f)
                lineTo(147.2f, 78.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 80.0f)
                horizontalLineToRelative(72.0f)
                close()
            }
        }
        .build()
        return _folders!!
    }

private var _folders: ImageVector? = null
