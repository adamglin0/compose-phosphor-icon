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

public val ThinGroup.`Tag-chevron-thin`: ImageVector
    get() {
        if (`_tag-chevron-thin` != null) {
            return `_tag-chevron-thin`!!
        }
        `_tag-chevron-thin` = Builder(name = "Tag-chevron-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.33f, 125.78f)
                lineTo(197.7f, 57.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, -5.34f)
                lineTo(32.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.33f, 6.22f)
                lineTo(75.19f, 128.0f)
                lineTo(28.67f, 197.78f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 204.0f)
                lineTo(187.72f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.0f, -5.34f)
                lineToRelative(45.63f, -68.44f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 243.33f, 125.78f)
                close()
                moveTo(191.05f, 194.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.33f, 1.78f)
                lineTo(39.47f, 196.0f)
                lineToRelative(43.86f, -65.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -4.44f)
                lineTo(39.47f, 60.0f)
                lineTo(187.72f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.33f, 1.78f)
                lineTo(235.19f, 128.0f)
                close()
            }
        }
        .build()
        return `_tag-chevron-thin`!!
    }

private var `_tag-chevron-thin`: ImageVector? = null
