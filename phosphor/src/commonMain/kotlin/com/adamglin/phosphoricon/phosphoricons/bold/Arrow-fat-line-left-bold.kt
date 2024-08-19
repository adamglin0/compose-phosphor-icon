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

public val BoldGroup.`Arrow-fat-line-left-bold`: ImageVector
    get() {
        if (`_arrow-fat-line-left-bold` != null) {
            return `_arrow-fat-line-left-bold`!!
        }
        `_arrow-fat-line-left-bold` = Builder(name = "Arrow-fat-line-left-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 68.0f)
                lineTo(132.0f, 68.0f)
                lineTo(132.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.49f, -8.49f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(96.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 132.0f, 224.0f)
                lineTo(132.0f, 188.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(188.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 176.0f, 68.0f)
                close()
                moveTo(164.0f, 164.0f)
                lineTo(120.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(19.0f)
                lineTo(41.0f, 128.0f)
                lineToRelative(67.0f, -67.0f)
                lineTo(108.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(44.0f)
                close()
                moveTo(228.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(204.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_arrow-fat-line-left-bold`!!
    }

private var `_arrow-fat-line-left-bold`: ImageVector? = null
