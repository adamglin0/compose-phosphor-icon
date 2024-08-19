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

public val BoldGroup.`Orange-slice-bold`: ImageVector
    get() {
        if (`_orange-slice-bold` != null) {
            return `_orange-slice-bold`!!
        }
        `_orange-slice-bold` = Builder(name = "Orange-slice-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 76.0f)
                lineTo(12.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 88.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, false, 256.0f, 0.0f)
                lineTo(256.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 76.0f)
                close()
                moveTo(64.52f, 100.0f)
                horizontalLineToRelative(42.69f)
                lineTo(84.67f, 139.05f)
                arcTo(63.87f, 63.87f, 0.0f, false, true, 64.52f, 100.0f)
                close()
                moveTo(128.0f, 112.0f)
                lineToRelative(22.94f, 39.73f)
                arcToRelative(63.76f, 63.76f, 0.0f, false, true, -45.88f, 0.0f)
                close()
                moveTo(171.33f, 139.05f)
                lineTo(148.79f, 100.0f)
                horizontalLineToRelative(42.69f)
                arcTo(63.87f, 63.87f, 0.0f, false, true, 171.33f, 139.05f)
                close()
                moveTo(128.0f, 196.0f)
                arcTo(104.15f, 104.15f, 0.0f, false, true, 24.3f, 100.0f)
                lineTo(40.37f, 100.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 175.26f, 0.0f)
                lineTo(231.7f, 100.0f)
                arcTo(104.15f, 104.15f, 0.0f, false, true, 128.0f, 196.0f)
                close()
            }
        }
        .build()
        return `_orange-slice-bold`!!
    }

private var `_orange-slice-bold`: ImageVector? = null
