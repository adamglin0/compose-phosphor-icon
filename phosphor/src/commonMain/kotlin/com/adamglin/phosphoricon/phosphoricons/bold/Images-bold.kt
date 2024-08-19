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

public val BoldGroup.`Images-bold`: ImageVector
    get() {
        if (`_images-bold` != null) {
            return `_images-bold`!!
        }
        `_images-bold` = Builder(name = "Images-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 160.0f, 88.0f)
                close()
                moveTo(236.0f, 56.0f)
                lineTo(236.0f, 160.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(204.0f, 180.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(40.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 68.0f)
                lineTo(60.0f, 68.0f)
                lineTo(60.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 36.0f)
                lineTo(216.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 56.0f)
                close()
                moveTo(180.0f, 180.0f)
                lineTo(80.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(60.0f, 92.0f)
                lineTo(44.0f, 92.0f)
                lineTo(44.0f, 196.0f)
                lineTo(180.0f, 196.0f)
                close()
                moveTo(158.34f, 156.0f)
                lineTo(124.0f, 121.66f)
                lineTo(89.66f, 156.0f)
                close()
                moveTo(212.0f, 60.0f)
                lineTo(84.0f, 60.0f)
                verticalLineToRelative(67.72f)
                lineToRelative(25.86f, -25.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.28f, 0.0f)
                lineTo(192.28f, 156.0f)
                lineTo(212.0f, 156.0f)
                close()
            }
        }
        .build()
        return `_images-bold`!!
    }

private var `_images-bold`: ImageVector? = null
