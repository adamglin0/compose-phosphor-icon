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

public val ThinGroup.`Number-six-thin`: ImageVector
    get() {
        if (`_number-six-thin` != null) {
            return `_number-six-thin`!!
        }
        `_number-six-thin` = Builder(name = "Number-six-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 108.0f)
                arcToRelative(51.66f, 51.66f, 0.0f, false, false, -24.74f, 6.27f)
                lineTo(139.49f, 50.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.0f, -3.92f)
                lineTo(83.0f, 134.05f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 128.0f, 108.0f)
                close()
                moveTo(128.0f, 204.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, -44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 128.0f, 204.0f)
                close()
            }
        }
        .build()
        return `_number-six-thin`!!
    }

private var `_number-six-thin`: ImageVector? = null
