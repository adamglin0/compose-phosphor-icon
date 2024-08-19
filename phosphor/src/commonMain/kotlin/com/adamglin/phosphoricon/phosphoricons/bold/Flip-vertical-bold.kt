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

public val BoldGroup.`Flip-vertical-bold`: ImageVector
    get() {
        if (`_flip-vertical-bold` != null) {
            return `_flip-vertical-bold`!!
        }
        `_flip-vertical-bold` = Builder(name = "Flip-vertical-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 120.0f)
                lineTo(216.0f, 120.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 7.79f, -38.42f)
                lineToRelative(-0.46f, -0.19f)
                lineTo(63.51f, 21.47f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 120.0f)
                close()
                moveTo(60.0f, 45.79f)
                lineTo(193.91f, 96.0f)
                lineTo(60.0f, 96.0f)
                close()
                moveTo(216.0f, 136.0f)
                lineTo(56.0f, 136.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 27.51f, 18.54f)
                lineToRelative(159.81f, -59.92f)
                lineToRelative(0.46f, -0.19f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 136.0f)
                close()
                moveTo(60.0f, 210.22f)
                lineTo(60.0f, 160.0f)
                lineTo(193.91f, 160.0f)
                close()
            }
        }
        .build()
        return `_flip-vertical-bold`!!
    }

private var `_flip-vertical-bold`: ImageVector? = null
