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

public val ThinGroup.`Voicemail-thin`: ImageVector
    get() {
        if (`_voicemail-thin` != null) {
            return `_voicemail-thin`!!
        }
        `_voicemail-thin` = Builder(name = "Voicemail-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 76.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -27.66f, 96.0f)
                lineTo(83.66f, 172.0f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 56.0f, 180.0f)
                lineTo(200.0f, 180.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, -104.0f)
                close()
                moveTo(12.0f, 128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 12.0f, 128.0f)
                close()
                moveTo(200.0f, 172.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, -44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 200.0f, 172.0f)
                close()
            }
        }
        .build()
        return `_voicemail-thin`!!
    }

private var `_voicemail-thin`: ImageVector? = null
