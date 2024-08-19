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

public val BoldGroup.`Images-square-bold`: ImageVector
    get() {
        if (`_images-square-bold` != null) {
            return `_images-square-bold`!!
        }
        `_images-square-bold` = Builder(name = "Images-square-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(88.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 68.0f, 48.0f)
                lineTo(68.0f, 60.0f)
                lineTo(48.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 80.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(176.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(196.0f, 188.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(92.0f, 52.0f)
                lineTo(204.0f, 52.0f)
                verticalLineToRelative(59.72f)
                lineToRelative(-9.86f, -9.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(103.72f, 164.0f)
                lineTo(92.0f, 164.0f)
                close()
                moveTo(172.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 84.0f)
                lineTo(68.0f, 84.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(84.0f)
                close()
                moveTo(137.66f, 164.0f)
                lineTo(180.0f, 121.66f)
                lineToRelative(24.0f, 24.0f)
                lineTo(204.0f, 164.0f)
                close()
                moveTo(108.0f, 88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 88.0f)
                close()
            }
        }
        .build()
        return `_images-square-bold`!!
    }

private var `_images-square-bold`: ImageVector? = null
