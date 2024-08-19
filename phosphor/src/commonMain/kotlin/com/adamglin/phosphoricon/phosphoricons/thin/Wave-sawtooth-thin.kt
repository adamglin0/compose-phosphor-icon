package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Wave-sawtooth-thin`: ImageVector
    get() {
        if (`_wave-sawtooth-thin` != null) {
            return `_wave-sawtooth-thin`!!
        }
        `_wave-sawtooth-thin` = Builder(name = "Wave-sawtooth-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.1f, 131.41f)
                lineToRelative(-104.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.1f, 0.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(71.16f)
                lineTo(26.1f, 131.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.2f, -6.82f)
                lineToRelative(104.0f, -64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 132.0f, 64.0f)
                verticalLineTo(184.84f)
                lineToRelative(97.9f, -60.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.2f, 6.82f)
                close()
            }
        }
        .build()
        return `_wave-sawtooth-thin`!!
    }

private var `_wave-sawtooth-thin`: ImageVector? = null
