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

public val BoldGroup.`Tag-simple-bold`: ImageVector
    get() {
        if (`_tag-simple-bold` != null) {
            return `_tag-simple-bold`!!
        }
        `_tag-simple-bold` = Builder(name = "Tag-simple-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.0f, 121.34f)
                lineTo(204.36f, 52.91f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 187.72f, 44.0f)
                horizontalLineTo(40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(187.72f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.64f, -8.91f)
                lineTo(250.0f, 134.66f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 250.0f, 121.34f)
                close()
                moveTo(185.58f, 188.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(68.0f)
                horizontalLineTo(185.58f)
                lineToRelative(40.0f, 60.0f)
                close()
            }
        }
        .build()
        return `_tag-simple-bold`!!
    }

private var `_tag-simple-bold`: ImageVector? = null
