package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Text-h-four-light`: ImageVector
    get() {
        if (`_text-h-four-light` != null) {
            return `_text-h-four-light`!!
        }
        `_text-h-four-light` = Builder(name = "Text-h-four-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.0f, 56.0f)
                lineTo(150.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(138.0f, 122.0f)
                lineTo(46.0f, 122.0f)
                verticalLineToRelative(54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(34.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(54.0f)
                horizontalLineToRelative(92.0f)
                lineTo(138.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(254.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(238.0f, 190.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(226.0f, 190.0f)
                lineTo(176.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.74f, -9.68f)
                lineToRelative(56.0f, -72.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 238.0f, 112.0f)
                verticalLineToRelative(66.0f)
                horizontalLineToRelative(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 254.0f, 184.0f)
                close()
                moveTo(226.0f, 129.49f)
                lineTo(188.27f, 178.0f)
                lineTo(226.0f, 178.0f)
                close()
            }
        }
        .build()
        return `_text-h-four-light`!!
    }

private var `_text-h-four-light`: ImageVector? = null
