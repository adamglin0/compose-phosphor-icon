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

public val FillGroup.Chats: ImageVector
    get() {
        if (_chats != null) {
            return _chats!!
        }
        _chats = Builder(name = "Chats", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(184.0f, 80.0f)
                lineTo(184.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(40.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 48.0f)
                lineTo(24.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.0f, 6.22f)
                lineTo(72.0f, 154.0f)
                lineTo(72.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(93.59f)
                lineTo(219.0f, 230.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.0f, 1.78f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                close()
                moveTo(189.45f, 185.78f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, -1.78f)
                lineTo(88.0f, 184.0f)
                lineTo(88.0f, 152.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(184.0f, 96.0f)
                horizontalLineToRelative(32.0f)
                lineTo(216.0f, 207.25f)
                close()
            }
        }
        .build()
        return _chats!!
    }

private var _chats: ImageVector? = null
