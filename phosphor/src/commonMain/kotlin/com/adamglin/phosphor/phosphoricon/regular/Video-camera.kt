package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Video-camera`: ImageVector
    get() {
        if (`_video-camera` != null) {
            return `_video-camera`!!
        }
        `_video-camera` = Builder(name = "Video-camera", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.77f, 73.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.21f, 0.39f)
                lineTo(208.0f, 97.05f)
                lineTo(208.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(32.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 72.0f)
                lineTo(16.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(192.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(208.0f, 159.0f)
                lineToRelative(35.56f, 23.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(256.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 251.77f, 73.0f)
                close()
                moveTo(192.0f, 184.0f)
                lineTo(32.0f, 184.0f)
                lineTo(32.0f, 72.0f)
                lineTo(192.0f, 72.0f)
                lineTo(192.0f, 184.0f)
                close()
                moveTo(240.0f, 161.05f)
                lineTo(208.0f, 139.72f)
                lineTo(208.0f, 116.28f)
                lineTo(240.0f, 95.0f)
                close()
            }
        }
        .build()
        return `_video-camera`!!
    }

private var `_video-camera`: ImageVector? = null
