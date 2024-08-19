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

public val BoldGroup.`Traffic-sign-bold`: ImageVector
    get() {
        if (`_traffic-sign-bold` != null) {
            return `_traffic-sign-bold`!!
        }
        `_traffic-sign-bold` = Builder(name = "Traffic-sign-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 113.46f)
                lineTo(142.54f, 10.0f)
                arcToRelative(20.57f, 20.57f, 0.0f, false, false, -29.08f, 0.0f)
                lineTo(10.0f, 113.46f)
                arcToRelative(20.57f, 20.57f, 0.0f, false, false, 0.0f, 29.08f)
                lineTo(113.46f, 246.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.57f, 20.57f, 0.0f, false, false, 29.08f, 0.0f)
                lineTo(246.0f, 142.54f)
                arcToRelative(20.57f, 20.57f, 0.0f, false, false, 0.0f, -29.08f)
                close()
                moveTo(128.0f, 226.57f)
                lineTo(29.43f, 128.0f)
                lineTo(128.0f, 29.43f)
                lineTo(226.57f, 128.0f)
                close()
                moveTo(135.51f, 104.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(139.0f, 132.0f)
                lineTo(112.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                horizontalLineToRelative(27.0f)
                close()
            }
        }
        .build()
        return `_traffic-sign-bold`!!
    }

private var `_traffic-sign-bold`: ImageVector? = null
