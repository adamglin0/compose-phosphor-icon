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

public val LightGroup.`Tent-light`: ImageVector
    get() {
        if (`_tent-light` != null) {
            return `_tent-light`!!
        }
        `_tent-light` = Builder(name = "Tent-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.48f, 189.56f)
                lineToRelative(-64.0f, -144.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 184.0f, 42.0f)
                lineTo(72.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.45f, 3.51f)
                lineToRelative(0.0f, 0.05f)
                lineToRelative(0.0f, 0.09f)
                verticalLineToRelative(0.0f)
                lineTo(2.52f, 189.56f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 198.0f)
                lineTo(248.0f, 198.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.48f, -8.44f)
                close()
                moveTo(66.0f, 76.27f)
                lineTo(66.0f, 186.0f)
                lineTo(17.23f, 186.0f)
                close()
                moveTo(78.0f, 186.0f)
                lineTo(78.0f, 76.27f)
                lineTo(126.77f, 186.0f)
                close()
                moveTo(139.9f, 186.0f)
                lineTo(81.23f, 54.0f)
                lineTo(180.1f, 54.0f)
                lineToRelative(58.67f, 132.0f)
                close()
            }
        }
        .build()
        return `_tent-light`!!
    }

private var `_tent-light`: ImageVector? = null
