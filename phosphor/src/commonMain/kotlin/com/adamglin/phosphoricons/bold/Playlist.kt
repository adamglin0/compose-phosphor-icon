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

public val BoldGroup.Playlist: ImageVector
    get() {
        if (_playlist != null) {
            return _playlist!!
        }
        _playlist = Builder(name = "Playlist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 52.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(40.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 64.0f)
                close()
                moveTo(40.0f, 140.0f)
                lineTo(156.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(40.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(108.0f, 180.0f)
                lineTo(40.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(251.49f, 127.45f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.94f, 8.0f)
                lineTo(212.0f, 128.13f)
                lineTo(212.0f, 192.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -24.0f, -33.94f)
                lineTo(188.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.45f, -11.49f)
                lineToRelative(40.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 251.49f, 127.45f)
                close()
                moveTo(188.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 188.0f, 192.0f)
                close()
            }
        }
        .build()
        return _playlist!!
    }

private var _playlist: ImageVector? = null
