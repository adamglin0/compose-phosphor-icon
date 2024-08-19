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

public val DuotoneGroup.`Radio-duotone`: ImageVector
    get() {
        if (`_radio-duotone` != null) {
            return `_radio-duotone`!!
        }
        `_radio-duotone` = Builder(name = "Radio-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 72.0f)
                lineTo(32.0f, 72.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(216.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
                moveTo(160.0f, 168.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(64.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(96.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 168.0f)
                close()
                moveTo(96.0f, 128.0f)
                lineTo(64.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(96.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(96.0f, 96.0f)
                lineTo(64.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(96.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(232.0f, 80.0f)
                lineTo(232.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.7f, -7.66f)
                lineToRelative(160.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.6f, 15.33f)
                lineTo(86.51f, 64.0f)
                lineTo(216.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 80.0f)
                close()
                moveTo(216.0f, 192.0f)
                lineTo(216.0f, 80.0f)
                lineTo(40.0f, 80.0f)
                lineTo(40.0f, 192.0f)
                lineTo(216.0f, 192.0f)
                close()
                moveTo(200.0f, 136.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 200.0f, 136.0f)
                close()
                moveTo(184.0f, 136.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 184.0f, 136.0f)
                close()
            }
        }
        .build()
        return `_radio-duotone`!!
    }

private var `_radio-duotone`: ImageVector? = null
