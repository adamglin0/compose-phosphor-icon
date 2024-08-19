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

public val LightGroup.`Number-circle-four-light`: ImageVector
    get() {
        if (`_number-circle-four-light` != null) {
            return `_number-circle-four-light`!!
        }
        `_number-circle-four-light` = Builder(name = "Number-circle-four-light", defaultWidth =
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
                moveTo(160.0f, 146.0f)
                lineTo(150.0f, 146.0f)
                lineTo(150.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.74f, -3.68f)
                lineToRelative(-56.0f, 72.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 88.0f, 158.0f)
                horizontalLineToRelative(50.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(150.0f, 158.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(138.0f, 146.0f)
                lineTo(100.27f, 146.0f)
                lineTo(138.0f, 97.49f)
                close()
            }
        }
        .build()
        return `_number-circle-four-light`!!
    }

private var `_number-circle-four-light`: ImageVector? = null
