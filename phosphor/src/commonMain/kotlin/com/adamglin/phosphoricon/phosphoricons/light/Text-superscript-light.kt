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

public val LightGroup.`Text-superscript-light`: ImageVector
    get() {
        if (`_text-superscript-light` != null) {
            return `_text-superscript-light`!!
        }
        `_text-superscript-light` = Builder(name = "Text-superscript-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.8f, -9.6f)
                lineToRelative(43.17f, -57.55f)
                arcTo(18.0f, 18.0f, 0.0f, true, false, 199.0f, 66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.31f, -4.0f)
                arcTo(30.12f, 30.12f, 0.0f, false, true, 192.0f, 54.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 240.0f, 90.06f)
                lineTo(204.0f, 138.0f)
                horizontalLineToRelative(36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 144.0f)
                close()
                moveTo(147.93f, 75.47f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.46f, 0.6f)
                lineTo(92.0f, 130.84f)
                lineTo(44.53f, 76.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.06f, 7.86f)
                lineTo(84.06f, 140.0f)
                lineTo(35.47f, 196.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.06f, 7.86f)
                lineTo(92.0f, 149.16f)
                lineToRelative(47.47f, 54.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.06f, -7.86f)
                lineTo(99.94f, 140.0f)
                lineToRelative(48.59f, -56.07f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 147.93f, 75.47f)
                close()
            }
        }
        .build()
        return `_text-superscript-light`!!
    }

private var `_text-superscript-light`: ImageVector? = null
