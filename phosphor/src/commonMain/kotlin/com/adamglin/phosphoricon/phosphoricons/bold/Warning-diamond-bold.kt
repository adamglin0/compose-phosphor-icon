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

public val BoldGroup.`Warning-diamond-bold`: ImageVector
    get() {
        if (`_warning-diamond-bold` != null) {
            return `_warning-diamond-bold`!!
        }
        `_warning-diamond-bold` = Builder(name = "Warning-diamond-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 68.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 156.0f)
                close()
                moveTo(244.0f, 128.0f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, true, -5.84f, 14.11f)
                lineToRelative(-96.0f, 96.06f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.21f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-96.0f, -96.06f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -28.22f)
                lineToRelative(96.05f, -96.06f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.21f, 0.0f)
                lineToRelative(96.06f, 96.06f)
                arcTo(19.86f, 19.86f, 0.0f, false, true, 244.0f, 128.0f)
                close()
                moveTo(218.32f, 128.0f)
                lineTo(128.0f, 37.67f)
                lineTo(37.68f, 128.0f)
                lineTo(128.0f, 218.33f)
                close()
            }
        }
        .build()
        return `_warning-diamond-bold`!!
    }

private var `_warning-diamond-bold`: ImageVector? = null
