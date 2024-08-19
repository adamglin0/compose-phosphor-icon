package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Text-a-underline-thin`: ImageVector
    get() {
        if (`_text-a-underline-thin` != null) {
            return `_text-a-underline-thin`!!
        }
        `_text-a-underline-thin` = Builder(name = "Text-a-underline-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.3f, 171.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.32f, -1.92f)
                lineTo(85.36f, 132.0f)
                horizontalLineToRelative(85.28f)
                lineToRelative(17.74f, 37.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.24f, -3.4f)
                lineToRelative(-64.0f, -136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.24f, 0.0f)
                lineToRelative(-64.0f, 136.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 62.3f, 171.62f)
                close()
                moveTo(128.0f, 41.39f)
                lineTo(166.87f, 124.0f)
                horizontalLineTo(89.13f)
                close()
                moveTo(220.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 216.0f)
                close()
            }
        }
        .build()
        return `_text-a-underline-thin`!!
    }

private var `_text-a-underline-thin`: ImageVector? = null
