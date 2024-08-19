package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Wave-sawtooth-bold`: ImageVector
    get() {
        if (`_wave-sawtooth-bold` != null) {
            return `_wave-sawtooth-bold`!!
        }
        `_wave-sawtooth-bold` = Builder(name = "Wave-sawtooth-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.29f, 138.22f)
                lineToRelative(-104.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 192.0f)
                verticalLineTo(85.47f)
                lineTo(30.29f, 138.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.58f, -20.44f)
                lineToRelative(104.0f, -64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 64.0f)
                verticalLineTo(170.53f)
                lineToRelative(85.71f, -52.75f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.58f, 20.44f)
                close()
            }
        }
        .build()
        return `_wave-sawtooth-bold`!!
    }

private var `_wave-sawtooth-bold`: ImageVector? = null
