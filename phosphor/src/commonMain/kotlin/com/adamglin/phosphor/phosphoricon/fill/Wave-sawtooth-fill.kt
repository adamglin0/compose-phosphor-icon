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

public val FillGroup.`Wave-sawtooth-fill`: ImageVector
    get() {
        if (`_wave-sawtooth-fill` != null) {
            return `_wave-sawtooth-fill`!!
        }
        `_wave-sawtooth-fill` = Builder(name = "Wave-sawtooth-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(204.44f, 134.66f)
                lineTo(132.44f, 182.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(120.0f, 95.0f)
                lineTo(60.44f, 134.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.88f, -13.32f)
                lineToRelative(72.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 80.0f)
                verticalLineToRelative(81.05f)
                lineToRelative(59.56f, -39.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.88f, 13.32f)
                close()
            }
        }
        .build()
        return `_wave-sawtooth-fill`!!
    }

private var `_wave-sawtooth-fill`: ImageVector? = null
