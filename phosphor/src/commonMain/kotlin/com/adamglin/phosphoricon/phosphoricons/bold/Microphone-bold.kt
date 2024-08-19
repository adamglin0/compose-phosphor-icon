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

public val BoldGroup.`Microphone-bold`: ImageVector
    get() {
        if (`_microphone-bold` != null) {
            return `_microphone-bold`!!
        }
        `_microphone-bold` = Builder(name = "Microphone-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 180.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, -52.0f)
                lineTo(180.0f, 64.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 76.0f, 64.0f)
                verticalLineToRelative(64.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 128.0f, 180.0f)
                close()
                moveTo(100.0f, 64.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                close()
                moveTo(140.0f, 219.22f)
                lineTo(140.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 219.22f)
                arcTo(92.14f, 92.14f, 0.0f, false, true, 36.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 136.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcTo(92.14f, 92.14f, 0.0f, false, true, 140.0f, 219.22f)
                close()
            }
        }
        .build()
        return `_microphone-bold`!!
    }

private var `_microphone-bold`: ImageVector? = null
