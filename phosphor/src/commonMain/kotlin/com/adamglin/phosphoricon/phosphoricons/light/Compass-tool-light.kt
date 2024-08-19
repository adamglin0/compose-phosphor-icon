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

public val LightGroup.`Compass-tool-light`: ImageVector
    get() {
        if (`_compass-tool-light` != null) {
            return `_compass-tool-light`!!
        }
        `_compass-tool-light` = Builder(name = "Compass-tool-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.34f, 122.73f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.68f, -5.46f)
                arcToRelative(81.79f, 81.79f, 0.0f, false, true, -35.81f, 35.36f)
                lineToRelative(-18.14f, -40.8f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 134.0f, 42.48f)
                lineTo(134.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 42.48f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -14.71f, 69.35f)
                lineTo(58.52f, 221.56f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.0f, 4.88f)
                lineToRelative(25.9f, -58.26f)
                arcTo(93.37f, 93.37f, 0.0f, false, false, 128.0f, 174.0f)
                arcToRelative(97.0f, 97.0f, 0.0f, false, false, 32.68f, -5.69f)
                lineToRelative(25.84f, 58.13f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.0f, -4.88f)
                lineToRelative(-25.77f, -58.0f)
                arcTo(93.92f, 93.92f, 0.0f, false, false, 213.34f, 122.73f)
                close()
                moveTo(128.0f, 54.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 54.0f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(81.51f, 81.51f, 0.0f, false, true, -27.73f, -4.83f)
                lineToRelative(18.0f, -40.45f)
                arcToRelative(37.85f, 37.85f, 0.0f, false, false, 19.52f, 0.0f)
                lineToRelative(18.0f, 40.6f)
                arcTo(85.34f, 85.34f, 0.0f, false, true, 128.0f, 162.0f)
                close()
            }
        }
        .build()
        return `_compass-tool-light`!!
    }

private var `_compass-tool-light`: ImageVector? = null
