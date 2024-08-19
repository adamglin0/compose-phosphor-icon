package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Chat-circle-slash-fill`: ImageVector
    get() {
        if (`_chat-circle-slash-fill` != null) {
            return `_chat-circle-slash-fill`!!
        }
        `_chat-circle-slash-fill` = Builder(name = "Chat-circle-slash-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineToRelative(-10.26f, -11.29f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, -112.7f, 9.73f)
                lineTo(45.07f, 231.17f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -20.24f, -20.24f)
                lineToRelative(11.35f, -34.05f)
                arcTo(104.06f, 104.06f, 0.0f, false, true, 52.33f, 56.66f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(128.0f, 24.0f)
                arcToRelative(103.39f, 103.39f, 0.0f, false, false, -40.33f, 8.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.81f, 12.75f)
                lineToRelative(121.8f, 134.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.0f, -1.59f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 128.0f, 24.0f)
                close()
            }
        }
        .build()
        return `_chat-circle-slash-fill`!!
    }

private var `_chat-circle-slash-fill`: ImageVector? = null
