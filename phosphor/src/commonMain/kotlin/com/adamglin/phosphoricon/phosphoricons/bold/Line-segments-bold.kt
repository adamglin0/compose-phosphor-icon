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

public val BoldGroup.`Line-segments-bold`: ImageVector
    get() {
        if (`_line-segments-bold` != null) {
            return `_line-segments-bold`!!
        }
        `_line-segments-bold` = Builder(name = "Line-segments-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.47f, 30.53f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.92f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.06f, 36.06f, 0.0f, false, false, -1.2f, 49.66f)
                lineToRelative(-23.83f, 44.26f)
                arcToRelative(36.08f, 36.08f, 0.0f, false, false, -21.0f, 3.07f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -57.94f, -41.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -1.2f, 49.66f)
                lineTo(45.5f, 164.45f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -31.0f, 10.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 52.12f, 1.26f)
                lineToRelative(23.83f, -44.26f)
                arcTo(35.21f, 35.21f, 0.0f, false, false, 96.0f, 132.0f)
                arcToRelative(36.07f, 36.07f, 0.0f, false, false, 15.51f, -3.5f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 59.14f, -8.68f)
                lineTo(210.5f, 91.55f)
                arcTo(36.32f, 36.32f, 0.0f, false, false, 216.0f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 25.46f, -61.45f)
                close()
                moveTo(87.47f, 87.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                close()
                moveTo(48.47f, 208.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.47f, 208.5f)
                close()
                moveTo(168.47f, 168.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.49f, 168.49f)
                close()
                moveTo(224.47f, 64.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 224.5f, 64.48f)
                close()
            }
        }
        .build()
        return `_line-segments-bold`!!
    }

private var `_line-segments-bold`: ImageVector? = null
