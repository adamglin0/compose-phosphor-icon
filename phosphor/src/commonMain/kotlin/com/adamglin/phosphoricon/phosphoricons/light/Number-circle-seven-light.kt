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

public val LightGroup.`Number-circle-seven-light`: ImageVector
    get() {
        if (`_number-circle-seven-light` != null) {
            return `_number-circle-seven-light`!!
        }
        `_number-circle-seven-light` = Builder(name = "Number-circle-seven-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(156.91f, 84.56f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.73f, 5.49f)
                lineToRelative(-32.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 120.0f, 182.0f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, true, -2.0f, -0.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.59f, -7.69f)
                lineTo(143.43f, 94.0f)
                lineTo(104.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 156.91f, 84.56f)
                close()
            }
        }
        .build()
        return `_number-circle-seven-light`!!
    }

private var `_number-circle-seven-light`: ImageVector? = null
