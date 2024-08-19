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

public val BoldGroup.`Arrow-fat-lines-up-bold`: ImageVector
    get() {
        if (`_arrow-fat-lines-up-bold` != null) {
            return `_arrow-fat-lines-up-bold`!!
        }
        `_arrow-fat-lines-up-bold` = Builder(name = "Arrow-fat-lines-up-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 111.51f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 132.0f)
                lineTo(68.0f, 132.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -20.49f)
                close()
                moveTo(176.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(92.0f, 124.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(61.0f, 108.0f)
                lineToRelative(67.0f, -67.0f)
                lineToRelative(67.0f, 67.0f)
                close()
                moveTo(188.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(80.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 216.0f)
                close()
                moveTo(188.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(80.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 176.0f)
                close()
            }
        }
        .build()
        return `_arrow-fat-lines-up-bold`!!
    }

private var `_arrow-fat-lines-up-bold`: ImageVector? = null
