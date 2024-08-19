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

public val ThinGroup.`Microphone-stage-thin`: ImageVector
    get() {
        if (`_microphone-stage-thin` != null) {
            return `_microphone-stage-thin`!!
        }
        `_microphone-stage-thin` = Builder(name = "Microphone-stage-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 20.0f)
                arcToRelative(68.08f, 68.08f, 0.0f, false, false, -68.0f, 68.0f)
                arcToRelative(67.19f, 67.19f, 0.0f, false, false, 0.82f, 10.49f)
                lineTo(30.34f, 194.59f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, 1.2f, 15.58f)
                lineToRelative(14.29f, 14.3f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 15.58f, 1.19f)
                lineToRelative(96.11f, -70.48f)
                arcTo(68.0f, 68.0f, 0.0f, true, false, 168.0f, 20.0f)
                close()
                moveTo(228.0f, 88.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, true, -14.87f, 39.47f)
                lineTo(128.54f, 42.87f)
                arcTo(59.94f, 59.94f, 0.0f, false, true, 228.0f, 88.0f)
                close()
                moveTo(56.68f, 219.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.2f, -0.4f)
                lineTo(37.19f, 204.52f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.4f, -5.2f)
                lineToRelative(66.46f, -90.62f)
                arcToRelative(68.31f, 68.31f, 0.0f, false, false, 44.05f, 44.05f)
                close()
                moveTo(108.0f, 88.0f)
                arcToRelative(59.77f, 59.77f, 0.0f, false, true, 14.87f, -39.47f)
                lineToRelative(84.6f, 84.6f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 108.0f, 88.0f)
                close()
                moveTo(106.83f, 149.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.65f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.65f, -5.65f)
                lineToRelative(8.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 106.84f, 149.16f)
                close()
            }
        }
        .build()
        return `_microphone-stage-thin`!!
    }

private var `_microphone-stage-thin`: ImageVector? = null
