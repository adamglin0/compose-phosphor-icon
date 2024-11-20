package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) {
            return _videoCameraSlash!!
        }
        _videoCameraSlash = Builder(name = "VideoCameraSlash", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 80.23f)
                verticalLineToRelative(95.45f)
                arcToRelative(8.33f, 8.33f, 0.0f, false, true, -3.86f, 7.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.58f, -0.19f)
                lineToRelative(-33.78f, -22.52f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.78f, -3.33f)
                verticalLineTo(99.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.78f, -3.32f)
                lineToRelative(33.78f, -22.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.73f, 0.66f)
                arcTo(8.23f, 8.23f, 0.0f, false, true, 256.0f, 80.23f)
                close()
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(51.73f, 56.0f)
                horizontalLineTo(32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 72.0f)
                verticalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(182.64f)
                lineToRelative(19.44f, 21.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(185.0f, 155.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, -2.7f)
                verticalLineTo(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 6.69f)
                close()
            }
        }
        .build()
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
