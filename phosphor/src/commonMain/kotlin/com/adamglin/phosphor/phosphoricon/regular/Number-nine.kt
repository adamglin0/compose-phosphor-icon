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

public val RegularGroup.`Number-nine`: ImageVector
    get() {
        if (`_number-nine` != null) {
            return `_number-nine`!!
        }
        `_number-nine` = Builder(name = "Number-nine", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 40.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 15.62f, 109.77f)
                lineTo(113.0f, 204.07f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 127.0f, 211.92f)
                lineToRelative(49.55f, -88.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 128.0f, 40.0f)
                close()
                moveTo(128.0f, 136.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 136.0f)
                close()
            }
        }
        .build()
        return `_number-nine`!!
    }

private var `_number-nine`: ImageVector? = null
