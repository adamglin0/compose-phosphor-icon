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

public val BoldGroup.`Brackets-angle-bold`: ImageVector
    get() {
        if (`_brackets-angle-bold` != null) {
            return `_brackets-angle-bold`!!
        }
        `_brackets-angle-bold` = Builder(name = "Brackets-angle-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.12f, 46.44f)
                lineTo(38.22f, 128.0f)
                lineToRelative(51.9f, 81.56f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -20.24f, 12.88f)
                lineToRelative(-56.0f, -88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -12.88f)
                lineToRelative(56.0f, -88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 90.12f, 46.44f)
                close()
                moveTo(242.12f, 121.56f)
                lineTo(186.12f, 33.56f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.24f, 12.88f)
                lineTo(217.78f, 128.0f)
                lineToRelative(-51.9f, 81.56f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.24f, 12.88f)
                lineToRelative(56.0f, -88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 242.12f, 121.56f)
                close()
            }
        }
        .build()
        return `_brackets-angle-bold`!!
    }

private var `_brackets-angle-bold`: ImageVector? = null
