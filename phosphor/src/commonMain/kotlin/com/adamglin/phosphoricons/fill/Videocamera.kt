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

public val FillGroup.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 72.0f)
                lineTo(192.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 56.0f)
                lineTo(176.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 72.0f)
                close()
                moveTo(250.0f, 72.25f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, false, -6.63f, 1.22f)
                lineTo(209.78f, 95.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 99.19f)
                verticalLineToRelative(57.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.78f, 3.33f)
                lineToRelative(33.78f, 22.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.58f, 0.19f)
                arcToRelative(8.33f, 8.33f, 0.0f, false, false, 3.86f, -7.17f)
                lineTo(256.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 250.0f, 72.25f)
                close()
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
