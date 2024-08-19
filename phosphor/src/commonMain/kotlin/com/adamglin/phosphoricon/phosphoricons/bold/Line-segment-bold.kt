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

public val BoldGroup.`Line-segment-bold`: ImageVector
    get() {
        if (`_line-segment-bold` != null) {
            return `_line-segment-bold`!!
        }
        `_line-segment-bold` = Builder(name = "Line-segment-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.47f, 38.53f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -57.95f, 41.0f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(36.07f, 36.07f, 0.0f, false, false, -41.0f, 7.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 58.0f, 9.95f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 41.0f, -57.95f)
                close()
                moveTo(72.47f, 200.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.48f, 200.5f)
                close()
                moveTo(200.47f, 72.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_line-segment-bold`!!
    }

private var `_line-segment-bold`: ImageVector? = null
