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

public val LightGroup.`Microphone-light`: ImageVector
    get() {
        if (`_microphone-light` != null) {
            return `_microphone-light`!!
        }
        `_microphone-light` = Builder(name = "Microphone-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 174.0f)
                arcToRelative(46.06f, 46.06f, 0.0f, false, false, 46.0f, -46.0f)
                lineTo(174.0f, 64.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -92.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcTo(46.06f, 46.06f, 0.0f, false, false, 128.0f, 174.0f)
                close()
                moveTo(94.0f, 64.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -68.0f, 0.0f)
                close()
                moveTo(134.0f, 205.75f)
                lineTo(134.0f, 240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 205.75f)
                arcTo(78.09f, 78.09f, 0.0f, false, true, 50.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, 132.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcTo(78.09f, 78.09f, 0.0f, false, true, 134.0f, 205.75f)
                close()
            }
        }
        .build()
        return `_microphone-light`!!
    }

private var `_microphone-light`: ImageVector? = null
