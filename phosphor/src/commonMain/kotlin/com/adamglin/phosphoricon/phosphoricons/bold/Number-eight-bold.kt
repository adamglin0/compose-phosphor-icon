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

public val BoldGroup.`Number-eight-bold`: ImageVector
    get() {
        if (`_number-eight-bold` != null) {
            return `_number-eight-bold`!!
        }
        `_number-eight-bold` = Builder(name = "Number-eight-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.44f, 118.91f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -68.88f, 0.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, 68.88f, 0.0f)
                close()
                moveTo(100.0f, 80.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 80.0f)
                close()
                moveTo(128.0f, 204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 204.0f)
                close()
            }
        }
        .build()
        return `_number-eight-bold`!!
    }

private var `_number-eight-bold`: ImageVector? = null
