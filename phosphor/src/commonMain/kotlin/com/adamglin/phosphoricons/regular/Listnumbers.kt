package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) {
            return _listNumbers!!
        }
        _listNumbers = Builder(name = "ListNumbers", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
                moveTo(104.0f, 72.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(216.0f, 184.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(43.58f, 55.16f)
                lineTo(48.0f, 52.94f)
                verticalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.58f, -7.16f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 14.32f)
                close()
                moveTo(79.77f, 156.72f)
                arcToRelative(23.73f, 23.73f, 0.0f, false, false, -9.6f, -15.95f)
                arcToRelative(24.86f, 24.86f, 0.0f, false, false, -34.11f, 4.7f)
                arcToRelative(23.63f, 23.63f, 0.0f, false, false, -3.57f, 6.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.0f, 5.47f)
                arcToRelative(7.84f, 7.84f, 0.0f, false, true, 1.18f, -2.13f)
                arcToRelative(8.76f, 8.76f, 0.0f, false, true, 12.0f, -1.59f)
                arcTo(7.91f, 7.91f, 0.0f, false, true, 63.93f, 159.0f)
                arcToRelative(7.64f, 7.64f, 0.0f, false, true, -1.57f, 5.78f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.08f, 0.11f)
                lineTo(33.59f, 203.21f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 216.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(56.0f)
                lineToRelative(19.08f, -25.53f)
                arcTo(23.47f, 23.47f, 0.0f, false, false, 79.77f, 156.72f)
                close()
            }
        }
        .build()
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
