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

public val LightGroup.`Number-circle-three-light`: ImageVector
    get() {
        if (`_number-circle-three-light` != null) {
            return `_number-circle-three-light`!!
        }
        `_number-circle-three-light` = Builder(name = "Number-circle-three-light", defaultWidth =
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
                moveTo(158.0f, 152.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -58.29f, 23.79f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.58f, -8.39f)
                arcTo(22.0f, 22.0f, 0.0f, true, false, 124.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.92f, -9.44f)
                lineTo(140.48f, 90.0f)
                lineTo(104.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.92f, 9.44f)
                lineToRelative(-22.53f, 32.18f)
                arcTo(34.06f, 34.06f, 0.0f, false, true, 158.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_number-circle-three-light`!!
    }

private var `_number-circle-three-light`: ImageVector? = null
