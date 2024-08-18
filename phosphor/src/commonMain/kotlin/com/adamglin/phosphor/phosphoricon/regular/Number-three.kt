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

public val RegularGroup.`Number-three`: ImageVector
    get() {
        if (`_number-three` != null) {
            return `_number-three`!!
        }
        `_number-three` = Builder(name = "Number-three", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 160.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -93.33f, 41.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 10.66f, -11.92f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 120.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -12.8f)
                lineTo(152.0f, 56.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.4f, 12.8f)
                lineToRelative(-39.84f, 53.12f)
                arcTo(56.1f, 56.1f, 0.0f, false, true, 176.0f, 160.0f)
                close()
            }
        }
        .build()
        return `_number-three`!!
    }

private var `_number-three`: ImageVector? = null
