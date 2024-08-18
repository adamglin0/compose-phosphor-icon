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

public val RegularGroup.`Chat-slash`: ImageVector
    get() {
        if (`_chat-slash` != null) {
            return `_chat-slash`!!
        }
        `_chat-slash` = Builder(name = "Chat-slash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(44.46f, 48.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(224.0f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, false, 9.24f, 14.5f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 40.0f, 240.0f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, 10.26f, -3.78f)
                lineToRelative(0.08f, -0.07f)
                lineTo(83.0f, 208.0f)
                horizontalLineTo(189.92f)
                lineToRelative(12.16f, 13.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(80.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.23f, 1.95f)
                lineTo(40.0f, 224.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(59.0f)
                lineTo(175.37f, 192.0f)
                close()
                moveTo(232.0f, 64.0f)
                verticalLineTo(186.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(105.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(216.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 64.0f)
                close()
            }
        }
        .build()
        return `_chat-slash`!!
    }

private var `_chat-slash`: ImageVector? = null
