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

public val ThinGroup.`Text-underline-thin`: ImageVector
    get() {
        if (`_text-underline-thin` != null) {
            return `_text-underline-thin`!!
        }
        `_text-underline-thin` = Builder(name = "Text-underline-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(64.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(192.0f, 220.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 224.0f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, -60.0f)
                lineTo(188.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -104.0f, 0.0f)
                lineTo(76.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 128.0f, 196.0f)
                close()
            }
        }
        .build()
        return `_text-underline-thin`!!
    }

private var `_text-underline-thin`: ImageVector? = null
