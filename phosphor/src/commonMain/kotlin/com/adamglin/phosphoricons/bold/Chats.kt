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

public val BoldGroup.Chats: ImageVector
    get() {
        if (_chats != null) {
            return _chats!!
        }
        _chats = Builder(name = "Chats", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 76.0f)
                lineTo(188.0f, 76.0f)
                lineTo(188.0f, 48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(40.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 48.0f)
                lineTo(20.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.54f, 9.33f)
                lineToRelative(28.46f, -23.0f)
                lineTo(68.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(92.17f)
                lineToRelative(36.29f, 29.33f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 224.0f)
                lineTo(236.0f, 96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 76.0f)
                close()
                moveTo(44.0f, 150.87f)
                lineTo(44.0f, 52.0f)
                lineTo(164.0f, 52.0f)
                verticalLineToRelative(80.0f)
                lineTo(71.58f, 132.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 64.0f, 134.67f)
                close()
                moveTo(212.0f, 198.87f)
                lineTo(192.0f, 182.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.54f, -2.67f)
                lineTo(92.0f, 180.0f)
                lineTo(92.0f, 156.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(188.0f, 100.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _chats!!
    }

private var _chats: ImageVector? = null
