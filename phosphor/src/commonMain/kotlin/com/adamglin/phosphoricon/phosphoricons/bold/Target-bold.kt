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

public val BoldGroup.`Target-bold`: ImageVector
    get() {
        if (`_target-bold` != null) {
            return `_target-bold`!!
        }
        `_target-bold` = Builder(name = "Target-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.26f, 90.4f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, true, -177.63f, 114.0f)
                arcTo(108.0f, 108.0f, 0.0f, false, true, 195.41f, 43.63f)
                lineToRelative(20.1f, -20.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 19.76f, 39.65f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.53f, 4.74f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, -25.73f, -62.0f)
                lineTo(178.3f, 60.74f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, 28.46f, 38.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.5f, -8.35f)
                close()
            }
        }
        .build()
        return `_target-bold`!!
    }

private var `_target-bold`: ImageVector? = null
