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

public val BoldGroup.`Dots-three-outline-bold`: ImageVector
    get() {
        if (`_dots-three-outline-bold` != null) {
            return `_dots-three-outline-bold`!!
        }
        `_dots-three-outline-bold` = Builder(name = "Dots-three-outline-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 96.0f)
                close()
                moveTo(128.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 136.0f)
                close()
                moveTo(208.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 208.0f, 96.0f)
                close()
                moveTo(208.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 136.0f)
                close()
                moveTo(48.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 48.0f, 96.0f)
                close()
                moveTo(48.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 136.0f)
                close()
            }
        }
        .build()
        return `_dots-three-outline-bold`!!
    }

private var `_dots-three-outline-bold`: ImageVector? = null
