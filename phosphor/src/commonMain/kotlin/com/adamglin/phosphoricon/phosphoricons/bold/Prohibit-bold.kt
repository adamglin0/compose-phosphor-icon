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

public val BoldGroup.`Prohibit-bold`: ImageVector
    get() {
        if (`_prohibit-bold` != null) {
            return `_prohibit-bold`!!
        }
        `_prohibit-bold` = Builder(name = "Prohibit-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(83.6f, 83.6f, 0.0f, false, true, -16.75f, 50.28f)
                lineTo(77.72f, 60.75f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 212.0f, 128.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcTo(83.6f, 83.6f, 0.0f, false, true, 60.75f, 77.72f)
                lineTo(178.28f, 195.25f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 44.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_prohibit-bold`!!
    }

private var `_prohibit-bold`: ImageVector? = null
