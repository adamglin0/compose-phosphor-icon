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

public val DuotoneGroup.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 48.0f)
                verticalLineTo(152.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.82f, 157.0f)
                lineToRelative(-12.0f, -96.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 204.0f, 40.0f)
                lineTo(32.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(75.06f, 160.0f)
                lineToRelative(37.78f, 75.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 240.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                lineTo(160.0f, 184.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 23.82f, -27.0f)
                close()
                moveTo(72.0f, 144.0f)
                lineTo(32.0f, 144.0f)
                lineTo(32.0f, 56.0f)
                lineTo(72.0f, 56.0f)
                close()
                moveTo(222.0f, 165.29f)
                arcToRelative(7.88f, 7.88f, 0.0f, false, true, -6.0f, 2.71f)
                lineTo(152.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -19.29f, 23.54f)
                lineTo(88.0f, 150.11f)
                lineTo(88.0f, 56.0f)
                lineTo(204.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.94f, 7.0f)
                lineToRelative(12.0f, 96.0f)
                arcTo(7.87f, 7.87f, 0.0f, false, true, 222.0f, 165.29f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
