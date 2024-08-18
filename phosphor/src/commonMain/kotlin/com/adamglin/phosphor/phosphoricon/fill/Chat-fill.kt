package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Chat-fill`: ImageVector
    get() {
        if (`_chat-fill` != null) {
            return `_chat-fill`!!
        }
        `_chat-fill` = Builder(name = "Chat-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(83.0f)
                lineToRelative(-32.6f, 28.16f)
                lineToRelative(-0.09f, 0.07f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 40.0f, 240.0f)
                arcToRelative(16.05f, 16.05f, 0.0f, false, true, -6.79f, -1.52f)
                arcTo(15.84f, 15.84f, 0.0f, false, true, 24.0f, 224.0f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 48.0f)
                horizontalLineTo(216.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 64.0f)
                close()
            }
        }
        .build()
        return `_chat-fill`!!
    }

private var `_chat-fill`: ImageVector? = null
