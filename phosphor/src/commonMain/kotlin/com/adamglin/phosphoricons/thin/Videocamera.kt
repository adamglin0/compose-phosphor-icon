package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.89f, 76.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.11f, 0.2f)
                lineTo(204.0f, 104.53f)
                lineTo(204.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(32.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 72.0f)
                lineTo(20.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(192.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(204.0f, 151.47f)
                lineToRelative(41.78f, 27.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 252.0f, 176.0f)
                lineTo(252.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 249.89f, 76.47f)
                close()
                moveTo(196.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(32.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(192.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(244.0f, 168.53f)
                lineTo(204.0f, 141.86f)
                lineTo(204.0f, 114.14f)
                lineToRelative(40.0f, -26.67f)
                close()
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
