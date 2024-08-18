package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Tag-simple`: ImageVector
    get() {
        if (`_tag-simple` != null) {
            return `_tag-simple`!!
        }
        `_tag-simple` = Builder(name = "Tag-simple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.66f, 123.56f)
                lineTo(201.0f, 55.13f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 187.72f, 48.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(187.72f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 201.0f, 200.88f)
                lineToRelative(45.63f, -68.44f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 246.66f, 123.56f)
                close()
                moveTo(187.72f, 192.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(187.72f)
                lineToRelative(42.66f, 64.0f)
                close()
            }
        }
        .build()
        return `_tag-simple`!!
    }

private var `_tag-simple`: ImageVector? = null
