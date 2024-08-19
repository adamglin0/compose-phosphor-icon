package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Number-nine-bold`: ImageVector
    get() {
        if (`_number-nine-bold` != null) {
            return `_number-nine-bold`!!
        }
        `_number-nine-bold` = Builder(name = "Number-nine-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 96.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, -60.0f, 60.0f)
                arcToRelative(59.21f, 59.21f, 0.0f, false, false, 7.81f, -0.53f)
                lineToRelative(-26.27f, 46.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.92f, 11.78f)
                lineToRelative(49.54f, -88.0f)
                arcTo(59.57f, 59.57f, 0.0f, false, false, 188.0f, 96.0f)
                close()
                moveTo(92.0f, 96.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_number-nine-bold`!!
    }

private var `_number-nine-bold`: ImageVector? = null
