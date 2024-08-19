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

public val LightGroup.`Number-circle-five-light`: ImageVector
    get() {
        if (`_number-circle-five-light` != null) {
            return `_number-circle-five-light`!!
        }
        `_number-circle-five-light` = Builder(name = "Number-circle-five-light", defaultWidth =
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
                moveTo(117.08f, 86.0f)
                lineToRelative(-5.0f, 30.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 124.0f, 114.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, true, -24.29f, -9.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.58f, -8.4f)
                arcTo(21.65f, 21.65f, 0.0f, false, false, 124.0f, 170.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f)
                arcToRelative(21.65f, 21.65f, 0.0f, false, false, -15.71f, 6.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 98.08f, 127.0f)
                lineToRelative(8.0f, -48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 112.0f, 74.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_number-circle-five-light`!!
    }

private var `_number-circle-five-light`: ImageVector? = null
