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

public val LightGroup.`Number-circle-nine-light`: ImageVector
    get() {
        if (`_number-circle-nine-light` != null) {
            return `_number-circle-nine-light`!!
        }
        `_number-circle-nine-light` = Builder(name = "Number-circle-nine-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(145.0f, 78.55f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 127.94f, 142.0f)
                arcToRelative(33.56f, 33.56f, 0.0f, false, false, 5.67f, -0.49f)
                lineToRelative(-18.76f, 31.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.3f, 6.16f)
                lineTo(157.45f, 125.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 145.0f, 78.55f)
                close()
                moveTo(147.06f, 119.0f)
                verticalLineToRelative(0.0f)
                arcTo(22.0f, 22.0f, 0.0f, true, true, 139.0f, 89.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 147.05f, 119.0f)
                close()
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return `_number-circle-nine-light`!!
    }

private var `_number-circle-nine-light`: ImageVector? = null
