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

public val DuotoneGroup.`Chat-centered-text-duotone`: ImageVector
    get() {
        if (`_chat-centered-text-duotone` != null) {
            return `_chat-centered-text-duotone`!!
        }
        `_chat-centered-text-duotone` = Builder(name = "Chat-centered-text-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 56.0f)
                verticalLineTo(184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(150.93f)
                lineToRelative(-16.0f, 28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.9f, 0.0f)
                lineToRelative(-16.0f, -28.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 104.0f)
                close()
                moveTo(96.0f, 144.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(96.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(155.57f, 200.0f)
                lineToRelative(-13.68f, 23.94f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -27.78f, 0.0f)
                lineTo(100.43f, 200.0f)
                lineTo(40.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(216.0f, 56.0f)
                lineTo(40.0f, 56.0f)
                lineTo(40.0f, 184.0f)
                horizontalLineToRelative(65.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.0f, 4.0f)
                lineToRelative(16.0f, 28.0f)
                lineToRelative(16.0f, -28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.0f, -4.0f)
                lineTo(216.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_chat-centered-text-duotone`!!
    }

private var `_chat-centered-text-duotone`: ImageVector? = null
