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

public val LightGroup.`Number-nine-light`: ImageVector
    get() {
        if (`_number-nine-light` != null) {
            return `_number-nine-light`!!
        }
        `_number-nine-light` = Builder(name = "Number-nine-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 42.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, false, 19.94f, 104.17f)
                lineToRelative(-33.17f, 58.88f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.46f, 5.89f)
                lineToRelative(49.54f, -88.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 128.0f, 42.0f)
                close()
                moveTo(128.0f, 138.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 42.0f, -42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 128.0f, 138.0f)
                close()
            }
        }
        .build()
        return `_number-nine-light`!!
    }

private var `_number-nine-light`: ImageVector? = null
