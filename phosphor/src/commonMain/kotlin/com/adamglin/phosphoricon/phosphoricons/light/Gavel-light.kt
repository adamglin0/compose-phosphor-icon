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

public val LightGroup.`Gavel-light`: ImageVector
    get() {
        if (`_gavel-light` != null) {
            return `_gavel-light`!!
        }
        `_gavel-light` = Builder(name = "Gavel-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.91f, 118.1f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.55f, -0.23f)
                lineTo(154.13f, 49.64f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -0.23f, -19.55f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineToRelative(-64.0f, 64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.55f, 0.23f)
                lineTo(99.52f, 124.0f)
                lineTo(32.73f, 190.79f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, 32.48f, 32.49f)
                lineTo(132.0f, 156.49f)
                lineToRelative(9.87f, 9.87f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.23f, 19.55f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(64.0f, -64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 241.91f, 118.1f)
                close()
                moveTo(150.35f, 157.86f)
                lineTo(98.14f, 105.66f)
                lineTo(145.66f, 58.14f)
                lineTo(197.86f, 110.34f)
                close()
                moveTo(78.59f, 105.41f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f)
                lineToRelative(64.0f, -64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.83f)
                lineToRelative(-64.0f, 64.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 78.59f, 105.41f)
                close()
                moveTo(56.73f, 214.8f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -15.52f, -15.52f)
                lineTo(108.0f, 132.49f)
                lineTo(123.52f, 148.0f)
                close()
                moveTo(233.42f, 129.42f)
                lineTo(169.42f, 193.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f)
                lineToRelative(64.0f, -64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(16.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 233.42f, 129.42f)
                close()
            }
        }
        .build()
        return `_gavel-light`!!
    }

private var `_gavel-light`: ImageVector? = null
