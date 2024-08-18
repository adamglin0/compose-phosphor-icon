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

public val FillGroup.`Poker-chip-fill`: ImageVector
    get() {
        if (`_poker-chip-fill` != null) {
            return `_poker-chip-fill`!!
        }
        `_poker-chip-fill` = Builder(name = "Poker-chip-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(60.4f, 71.72f)
                lineTo(77.47f, 88.79f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, -13.0f, 31.21f)
                lineTo(40.37f, 120.0f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 60.4f, 71.72f)
                close()
                moveTo(40.37f, 136.0f)
                lineTo(64.52f, 136.0f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, 13.0f, 31.21f)
                lineTo(60.4f, 184.28f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 40.37f, 136.0f)
                close()
                moveTo(120.0f, 215.63f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, -48.28f, -20.0f)
                lineToRelative(17.07f, -17.07f)
                arcTo(63.66f, 63.66f, 0.0f, false, false, 120.0f, 191.48f)
                close()
                moveTo(120.0f, 64.52f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, -31.21f, 13.0f)
                lineTo(71.72f, 60.4f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, 48.28f, -20.0f)
                close()
                moveTo(215.63f, 120.0f)
                lineTo(191.48f, 120.0f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, -12.95f, -31.21f)
                lineTo(195.6f, 71.72f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 215.63f, 120.0f)
                close()
                moveTo(136.0f, 40.37f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, 48.28f, 20.0f)
                lineTo(167.21f, 77.47f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, -31.21f, -13.0f)
                close()
                moveTo(136.0f, 215.63f)
                lineTo(136.0f, 191.48f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, 31.21f, -12.95f)
                lineToRelative(17.07f, 17.07f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 136.0f, 215.63f)
                close()
                moveTo(195.6f, 184.28f)
                lineTo(178.53f, 167.21f)
                arcTo(63.66f, 63.66f, 0.0f, false, false, 191.48f, 136.0f)
                horizontalLineToRelative(24.15f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 195.6f, 184.28f)
                close()
            }
        }
        .build()
        return `_poker-chip-fill`!!
    }

private var `_poker-chip-fill`: ImageVector? = null
