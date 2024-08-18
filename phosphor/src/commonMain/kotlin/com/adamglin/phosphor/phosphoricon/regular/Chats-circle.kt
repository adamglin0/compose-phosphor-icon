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

public val RegularGroup.`Chats-circle`: ImageVector
    get() {
        if (`_chats-circle` != null) {
            return `_chats-circle`!!
        }
        `_chats-circle` = Builder(name = "Chats-circle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.07f, 186.76f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -62.5f, -114.17f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 23.93f, 138.76f)
                lineToRelative(-7.27f, 24.71f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.87f, 19.87f)
                lineToRelative(24.71f, -7.27f)
                arcToRelative(80.39f, 80.39f, 0.0f, false, false, 25.18f, 7.35f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 108.34f, 40.65f)
                lineToRelative(24.71f, 7.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.87f, -19.86f)
                close()
                moveTo(62.0f, 159.5f)
                arcToRelative(8.28f, 8.28f, 0.0f, false, false, -2.26f, 0.32f)
                lineTo(32.0f, 168.0f)
                lineToRelative(8.17f, -27.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.63f, -6.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 26.26f, 26.26f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 62.0f, 159.5f)
                close()
                moveTo(215.79f, 188.23f)
                lineTo(224.0f, 216.0f)
                lineToRelative(-27.76f, -8.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, 0.63f)
                arcToRelative(64.05f, 64.05f, 0.0f, false, true, -85.87f, -24.88f)
                arcTo(79.93f, 79.93f, 0.0f, false, false, 174.7f, 89.71f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 41.75f, 92.48f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 215.82f, 188.23f)
                close()
            }
        }
        .build()
        return `_chats-circle`!!
    }

private var `_chats-circle`: ImageVector? = null
