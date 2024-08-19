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

public val FillGroup.`Repeat-once-fill`: ImageVector
    get() {
        if (`_repeat-once-fill` != null) {
            return `_repeat-once-fill`!!
        }
        `_repeat-once-fill` = Builder(name = "Repeat-once-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 128.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 96.0f, 56.0f)
                horizontalLineToRelative(96.0f)
                lineTo(192.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 88.0f)
                lineTo(192.0f, 72.0f)
                lineTo(96.0f, 72.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(224.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, -56.0f, 56.0f)
                lineTo(64.0f, 184.0f)
                lineTo(64.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.66f, -5.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineToRelative(24.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 216.0f)
                lineTo(64.0f, 200.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, false, 72.0f, -72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 120.0f)
                close()
                moveTo(136.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(144.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.58f, -7.16f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 7.16f, 14.31f)
                lineToRelative(4.42f, -2.21f)
                lineTo(128.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 160.0f)
                close()
            }
        }
        .build()
        return `_repeat-once-fill`!!
    }

private var `_repeat-once-fill`: ImageVector? = null
