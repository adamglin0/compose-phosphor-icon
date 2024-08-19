package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Chat-circle-slash-duotone`: ImageVector
    get() {
        if (`_chat-circle-slash-duotone` != null) {
            return `_chat-circle-slash-duotone`!!
        }
        `_chat-circle-slash-duotone` = Builder(name = "Chat-circle-slash-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 79.93f, 211.11f)
                horizontalLineToRelative(0.0f)
                lineTo(42.54f, 223.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.12f, -10.12f)
                lineToRelative(12.47f, -37.39f)
                horizontalLineToRelative(0.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(52.33f, 56.66f)
                arcTo(104.06f, 104.06f, 0.0f, false, false, 36.18f, 176.88f)
                lineTo(24.83f, 210.93f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 20.24f, 20.24f)
                lineToRelative(34.05f, -11.35f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 112.7f, -9.73f)
                lineToRelative(10.26f, 11.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(87.87f, 87.87f, 0.0f, false, true, -44.06f, -11.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.54f, -0.66f)
                lineTo(40.0f, 216.0f)
                lineTo(52.47f, 178.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.66f, -6.54f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 63.14f, 68.54f)
                lineTo(181.0f, 198.23f)
                arcTo(87.77f, 87.77f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcToRelative(104.15f, 104.15f, 0.0f, false, true, -12.38f, 49.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.09f, -7.58f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 93.88f, 46.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.21f, -14.75f)
                arcTo(104.06f, 104.06f, 0.0f, false, true, 232.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_chat-circle-slash-duotone`!!
    }

private var `_chat-circle-slash-duotone`: ImageVector? = null
