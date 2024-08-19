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

public val ThinGroup.`Prohibit-thin`: ImageVector
    get() {
        if (`_prohibit-thin` != null) {
            return `_prohibit-thin`!!
        }
        `_prohibit-thin` = Builder(name = "Prohibit-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(220.0f, 128.0f)
                arcToRelative(91.67f, 91.67f, 0.0f, false, true, -24.21f, 62.13f)
                lineTo(65.87f, 60.21f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 220.0f, 128.0f)
                close()
                moveTo(36.0f, 128.0f)
                arcTo(91.67f, 91.67f, 0.0f, false, true, 60.21f, 65.87f)
                lineTo(190.13f, 195.79f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 36.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_prohibit-thin`!!
    }

private var `_prohibit-thin`: ImageVector? = null
