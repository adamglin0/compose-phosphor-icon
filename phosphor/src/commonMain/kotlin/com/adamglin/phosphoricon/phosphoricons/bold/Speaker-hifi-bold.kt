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

public val BoldGroup.`Speaker-hifi-bold`: ImageVector
    get() {
        if (`_speaker-hifi-bold` != null) {
            return `_speaker-hifi-bold`!!
        }
        `_speaker-hifi-bold` = Builder(name = "Speaker-hifi-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 20.0f)
                lineTo(64.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 40.0f)
                lineTo(44.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(192.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(212.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 192.0f, 20.0f)
                close()
                moveTo(188.0f, 212.0f)
                lineTo(68.0f, 212.0f)
                lineTo(68.0f, 44.0f)
                lineTo(188.0f, 44.0f)
                close()
                moveTo(112.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 76.0f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -44.0f, -44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 196.0f)
                close()
                moveTo(128.0f, 132.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 132.0f)
                close()
            }
        }
        .build()
        return `_speaker-hifi-bold`!!
    }

private var `_speaker-hifi-bold`: ImageVector? = null
