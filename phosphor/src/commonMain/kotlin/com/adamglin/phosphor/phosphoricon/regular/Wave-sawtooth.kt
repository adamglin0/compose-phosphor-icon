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

public val RegularGroup.`Wave-sawtooth`: ImageVector
    get() {
        if (`_wave-sawtooth` != null) {
            return `_wave-sawtooth`!!
        }
        `_wave-sawtooth` = Builder(name = "Wave-sawtooth", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.19f, 134.81f)
                lineToRelative(-104.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 192.0f)
                verticalLineTo(78.32f)
                lineTo(28.19f, 134.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.38f, -13.62f)
                lineToRelative(104.0f, -64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 64.0f)
                verticalLineTo(177.68f)
                lineToRelative(91.81f, -56.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.38f, 13.62f)
                close()
            }
        }
        .build()
        return `_wave-sawtooth`!!
    }

private var `_wave-sawtooth`: ImageVector? = null
