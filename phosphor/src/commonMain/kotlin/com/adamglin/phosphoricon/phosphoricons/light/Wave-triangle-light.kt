package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Wave-triangle-light`: ImageVector
    get() {
        if (`_wave-triangle-light` != null) {
            return `_wave-triangle-light`!!
        }
        `_wave-triangle-light` = Builder(name = "Wave-triangle-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.86f, 131.51f)
                lineToRelative(-52.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.72f, 0.0f)
                lineTo(76.0f, 66.25f)
                lineTo(28.86f, 131.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.72f, -7.0f)
                lineToRelative(52.0f, -72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.72f, 0.0f)
                lineTo(180.0f, 189.75f)
                lineToRelative(47.14f, -65.26f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.72f, 7.0f)
                close()
            }
        }
        .build()
        return `_wave-triangle-light`!!
    }

private var `_wave-triangle-light`: ImageVector? = null
