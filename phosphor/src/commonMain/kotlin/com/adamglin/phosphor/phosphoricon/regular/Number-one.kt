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

public val RegularGroup.`Number-one`: ImageVector
    get() {
        if (`_number-one` != null) {
            return `_number-one`!!
        }
        `_number-one` = Builder(name = "Number-one", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(62.13f)
                lineTo(100.12f, 78.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.24f, -13.72f)
                lineToRelative(40.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 48.0f)
                close()
            }
        }
        .build()
        return `_number-one`!!
    }

private var `_number-one`: ImageVector? = null
