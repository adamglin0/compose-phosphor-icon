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

public val LightGroup.`Prohibit-light`: ImageVector
    get() {
        if (`_prohibit-light` != null) {
            return `_prohibit-light`!!
        }
        `_prohibit-light` = Builder(name = "Prohibit-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(89.6f, 89.6f, 0.0f, false, true, -22.29f, 59.22f)
                lineTo(68.78f, 60.29f)
                arcTo(89.95f, 89.95f, 0.0f, false, true, 218.0f, 128.0f)
                close()
                moveTo(38.0f, 128.0f)
                arcTo(89.6f, 89.6f, 0.0f, false, true, 60.29f, 68.78f)
                lineTo(187.22f, 195.71f)
                arcTo(89.95f, 89.95f, 0.0f, false, true, 38.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_prohibit-light`!!
    }

private var `_prohibit-light`: ImageVector? = null
