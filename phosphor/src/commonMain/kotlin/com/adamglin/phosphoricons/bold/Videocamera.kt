package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.45f, 69.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.51f, 1.0f)
                lineTo(212.0f, 88.43f)
                lineTo(212.0f, 72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(32.0f, 52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 72.0f)
                lineTo(12.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(192.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(212.0f, 167.57f)
                lineToRelative(24.94f, 18.14f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 256.0f, 176.0f)
                lineTo(256.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 249.45f, 69.31f)
                close()
                moveTo(188.0f, 180.0f)
                lineTo(36.0f, 180.0f)
                lineTo(36.0f, 76.0f)
                lineTo(188.0f, 76.0f)
                close()
                moveTo(232.0f, 152.43f)
                lineTo(212.0f, 137.89f)
                lineTo(212.0f, 118.11f)
                lineToRelative(20.0f, -14.54f)
                close()
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
