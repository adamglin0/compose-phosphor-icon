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

public val DuotoneGroup.`Chat-text-duotone`: ImageVector
    get() {
        if (`_chat-text-duotone` != null) {
            return `_chat-text-duotone`!!
        }
        `_chat-text-duotone` = Builder(name = "Chat-text-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(80.0f)
                lineTo(45.15f, 230.11f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 224.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                lineTo(40.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                lineTo(24.0f, 224.0f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, false, 9.24f, 14.5f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 40.0f, 240.0f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, false, 10.25f, -3.78f)
                lineToRelative(0.09f, -0.07f)
                lineTo(83.0f, 208.0f)
                lineTo(216.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 48.0f)
                close()
                moveTo(40.0f, 224.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(216.0f, 192.0f)
                lineTo(80.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.23f, 1.95f)
                lineTo(40.0f, 224.0f)
                lineTo(40.0f, 64.0f)
                lineTo(216.0f, 64.0f)
                close()
                moveTo(88.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 112.0f)
                close()
                moveTo(88.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                lineTo(96.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_chat-text-duotone`!!
    }

private var `_chat-text-duotone`: ImageVector? = null
