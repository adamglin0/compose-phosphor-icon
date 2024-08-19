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

public val BoldGroup.`File-image-bold`: ImageVector
    get() {
        if (`_file-image-bold` != null) {
            return `_file-image-bold`!!
        }
        `_file-image-bold` = Builder(name = "File-image-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.0f, 145.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.0f, 0.0f)
                lineTo(79.0f, 167.82f)
                lineTo(72.3f, 157.73f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.07f, 0.17f)
                lineTo(13.91f, 217.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 236.0f)
                horizontalLineTo(152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.0f, -18.66f)
                close()
                moveTo(46.0f, 212.0f)
                lineTo(62.5f, 186.3f)
                lineToRelative(6.55f, 9.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.0f, 0.0f)
                lineToRelative(15.0f, -22.48f)
                lineTo(129.58f, 212.0f)
                close()
                moveTo(216.49f, 79.51f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 20.0f)
                horizontalLineTo(56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(76.0f)
                verticalLineTo(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.49f, 79.51f)
                close()
                moveTo(160.0f, 57.0f)
                lineToRelative(23.0f, 23.0f)
                horizontalLineTo(160.0f)
                close()
            }
        }
        .build()
        return `_file-image-bold`!!
    }

private var `_file-image-bold`: ImageVector? = null
