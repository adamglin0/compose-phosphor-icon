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

public val RegularGroup.`Chat-circle`: ImageVector
    get() {
        if (`_chat-circle` != null) {
            return `_chat-circle`!!
        }
        `_chat-circle` = Builder(name = "Chat-circle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 36.18f, 176.88f)
                lineTo(24.83f, 210.93f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 20.24f, 20.24f)
                lineToRelative(34.05f, -11.35f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(87.87f, 87.87f, 0.0f, false, true, -44.06f, -11.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.54f, -0.67f)
                lineTo(40.0f, 216.0f)
                lineTo(52.47f, 178.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.66f, -6.54f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return `_chat-circle`!!
    }

private var `_chat-circle`: ImageVector? = null
