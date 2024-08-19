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

public val BoldGroup.`Number-four-bold`: ImageVector
    get() {
        if (`_number-four-bold` != null) {
            return `_number-four-bold`!!
        }
        `_number-four-bold` = Builder(name = "Number-four-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 156.0f)
                lineTo(172.0f, 156.0f)
                lineTo(172.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.37f, -7.5f)
                lineToRelative(-96.0f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 64.0f, 180.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(172.0f, 180.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(148.0f, 156.0f)
                lineTo(89.0f, 156.0f)
                lineToRelative(59.0f, -73.79f)
                close()
            }
        }
        .build()
        return `_number-four-bold`!!
    }

private var `_number-four-bold`: ImageVector? = null
